package TP7;

import java.io.*;
import java.util.List;
import java.util.Map;
import TP7.InscriptionException;

public class FileManager {
    private static final String FICHIER_INSCRIPTIONS = "inscriptions.txt";
    public static void sauvegarderInscriptions(Map<String, Utilisateur> utilisateurs, List<Cours> cours) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHIER_INSCRIPTIONS))) {
            for (Cours c : cours) {
                for (Etudiant e : c.getEtudiantsInscrits()) {
                    writer.write(e.getId() + ";" + c.getCode());
                    writer.newLine();}}}}
    public static void chargerInscriptions(Map<String, Utilisateur> utilisateurs, List<Cours> cours) throws IOException, FileNotFoundException {
        File fichier = new File(FICHIER_INSCRIPTIONS);
        if (!fichier.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FICHIER_INSCRIPTIONS))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] parties = ligne.split(";");
                if (parties.length == 2) {
                    String etudiantId = parties[0];
                    String coursCode = parties[1];

                    Utilisateur u = utilisateurs.get(etudiantId);
                    if (u instanceof Etudiant) {
                        Etudiant etudiant = (Etudiant) u;
                        for (Cours c : cours) {
                            if (c.getCode().equals(coursCode)) {
                                try {
                                    etudiant.inscrireCours(c);
                                    c.inscrireEtudiant(etudiant);
                                } catch (InscriptionException e) {
                                    System.err.println("Erreur lors du chargement: " + e.getMessage());
                                }
                                break;}}}}}}}}