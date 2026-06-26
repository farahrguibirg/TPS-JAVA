package TP7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Patient> patients = new HashMap<>();

        try {
            Patient p1 = new Patient("Ali", 30, 101); 
            Patient p2 = new Patient("Sara", 25, 102);
            Patient p3 = new Patient("Khalid", 35, 103);

            patients.put(p1.getId(), p1);
            patients.put(p2.getId(), p2);
            patients.put(p3.getId(), p3);

            System.out.println("Tous les patients :");
            for (Patient p : patients.values()) {
                p.afficher();
            }

            List<Patient> listePatients = new ArrayList<>(patients.values());
            listePatients.sort(Comparator.comparingInt(Patient::getAge));

            System.out.println("\nPatients triés par âge :");
            for (Patient p : listePatients) {
                System.out.println("ID: " + p.getId() + ", Nom: " + p.getNom() + ", Age: " + p.getAge());}
        } catch (AgeInvalideException e) {
            System.out.println("Erreur lors de la création d'un patient : " + e.getMessage());}
        try {
            Medecin m1 = new Medecin("Dr. Sara", 35, "Cardiologie"); 
            m1.afficher();
        } catch (AgeInvalideException e) {
            System.out.println("Erreur lors de la création du médecin : " + e.getMessage());}}}
