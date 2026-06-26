package TP3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEmploye {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employe> listeEmployes = new ArrayList<>();

        System.out.print("Entrez le chiffre d'affaire commun aux patrons : ");
        double chiffreAffaire = sc.nextDouble();
        Patron.setCA(chiffreAffaire);

        for (int i = 1; i <= 1; i++) {
            sc.nextLine(); 
            System.out.println("\n--- Ouvrier " + i + " ---");
            System.out.print("Matricule : "); String matricule = sc.nextLine();
            System.out.print("Nom : "); String nom = sc.nextLine();
            System.out.print("Prénom : "); String prenom = sc.nextLine();
            System.out.print("Année de naissance (yyyy) : "); int anneeN = sc.nextInt();
            System.out.print("Mois de naissance (1-12) : "); int moisN = sc.nextInt();
            System.out.print("Jour de naissance : "); int jourN = sc.nextInt();
            LocalDate dateN = LocalDate.of(anneeN, moisN, jourN);

            System.out.print("Année d'entrée : "); int anneeEntree = sc.nextInt();
            System.out.print("Mois d'entrée (1-12) : "); int moisEntree = sc.nextInt();
            System.out.print("Jour d'entrée : "); int jourEntree = sc.nextInt();
            LocalDate dateEntree = LocalDate.of(anneeEntree, moisEntree, jourEntree);

            listeEmployes.add(new Ouvrier(matricule, nom, prenom, dateN, dateEntree));
        }

        for (int i = 1; i <= 1; i++) {
            sc.nextLine(); 
            System.out.println("\n--- Cadre " + i + " ---");
            System.out.print("Matricule : "); String matricule = sc.nextLine();
            System.out.print("Nom : "); String nom = sc.nextLine();
            System.out.print("Prénom : "); String prenom = sc.nextLine();
            System.out.print("Année de naissance (yyyy) : "); int anneeN = sc.nextInt();
            System.out.print("Mois de naissance (1-12) : "); int moisN = sc.nextInt();
            System.out.print("Jour de naissance : "); int jourN = sc.nextInt();
            LocalDate dateN = LocalDate.of(anneeN, moisN, jourN);

            System.out.print("Indice du cadre (1-4) : "); int indice = sc.nextInt();

            listeEmployes.add(new Cadre(matricule, nom, prenom, dateN, indice));
        }

        for (int i = 1; i <= 1; i++) {
            sc.nextLine(); 
            System.out.println("\n--- Patron " + i + " ---");
            System.out.print("Matricule : "); String matricule = sc.nextLine();
            System.out.print("Nom : "); String nom = sc.nextLine();
            System.out.print("Prénom : "); String prenom = sc.nextLine();
            System.out.print("Année de naissance (yyyy) : "); int anneeN = sc.nextInt();
            System.out.print("Mois de naissance (1-12) : "); int moisN = sc.nextInt();
            System.out.print("Jour de naissance : "); int jourN = sc.nextInt();
            LocalDate dateN = LocalDate.of(anneeN, moisN, jourN);

            System.out.print("Pourcentage du patron : "); double pourcentage = sc.nextDouble();

            listeEmployes.add(new Patron(matricule, nom, prenom, dateN, pourcentage));
        }

        sc.close();

        System.out.println("\n\n--- Liste des employés ---");
        for (Employe e : listeEmployes) {
            e.afficher();
            System.out.println("Salaire : " + e.getSalaire() + " DH\n");
        }
    }
}
