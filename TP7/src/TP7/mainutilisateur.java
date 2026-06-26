package TP7;
import java.io.IOException;
import java.util.*;
public class mainutilisateur {
    public static void main(String[] args) {
        Map<String, Utilisateur> utilisateurs = new HashMap<>();
        List<Cours> cours = new ArrayList<>();
        try {
            Enseignant ens1 = new Enseignant("E001", "Dr. Martin", "martin@univ.ma", "Informatique");
            Enseignant ens2 = new Enseignant("E002", "Dr. Dubois", "dubois@univ.ma", "Mathématiques");
            utilisateurs.put(ens1.getId(), ens1); utilisateurs.put(ens2.getId(), ens2);
            Etudiant et1 = new Etudiant("ET001", "Ahmed Alami", "ahmed@student.ma", "L3");
            Etudiant et2 = new Etudiant("ET002", "Fatima Zahra", "fatima@student.ma", "M1");
            Etudiant et3 = new Etudiant("ET003", "Youssef Bennani", "youssef@student.ma", "L2");
            utilisateurs.put(et1.getId(), et1); utilisateurs.put(et2.getId(), et2);utilisateurs.put(et3.getId(), et3);
            Cours cours1 = new Cours("INF101", "Programmation Java", ens1);
            Cours cours2 = new Cours("MAT201", "Algèbre Linéaire", ens2);
            Cours cours3 = new Cours("INF202", "Bases de Données", ens1);
            cours.add(cours1);   cours.add(cours2);   cours.add(cours3);
            System.out.println("=== Inscription des étudiants aux cours ===");
            inscrireEtudiantCours(et1, cours1);inscrireEtudiantCours(et1, cours2);
            inscrireEtudiantCours(et2, cours1); inscrireEtudiantCours(et2, cours3); inscrireEtudiantCours(et3, cours2);
            System.out.println("\n=== Tentative d'inscription double ===");
            inscrireEtudiantCours(et1, cours1);
            System.out.println("\n=== Ajout des notes ===");
       cours1.ajouterNote(et1.getId(), 15.5); cours1.ajouterNote(et2.getId(), 17.0); cours2.ajouterNote(et1.getId(), 14.0); cours2.ajouterNote(et3.getId(), 16.5);
            System.out.println("\n=== Affichage des profils ===");
            et1.afficherProfil();System.out.println();ens1.afficherProfil();
            System.out.println("\n=== Notes finales moyennes ===");
            for (Cours c : cours) {
                System.out.println("Cours: " + c.getTitre() + " - Note moyenne: " + c.calculerNoteFinale());}
            System.out.println("\n=== Sauvegarde des inscriptions ===");
            FileManager.sauvegarderInscriptions(utilisateurs, cours);
            System.out.println("Inscriptions sauvegardées avec succès");
            System.out.println("\n=== Chargement des inscriptions ===");
            FileManager.chargerInscriptions(utilisateurs, cours);
            System.out.println("Inscriptions chargées avec succès");
        } catch (IOException e) {
            System.err.println("Erreur d'entrée/sortie: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());}}
    private static void inscrireEtudiantCours(Etudiant etudiant, Cours cours) {
        try {
            etudiant.inscrireCours(cours);
            cours.inscrireEtudiant(etudiant);
            System.out.println("✓ " + etudiant.getNom() + " inscrit au cours " + cours.getTitre());
        } catch (InscriptionException e) {
            System.err.println("✗ Erreur: " + e.getMessage());
        }
    }
}