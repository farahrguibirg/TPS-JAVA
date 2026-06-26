package TP3;

import java.time.LocalDate;
import java.util.Scanner;

public class MainVoiture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicule[] parc = new Vehicule[2];

        System.out.println("--- Création d'une Voiture ---");
        System.out.print("Matricule: ");
        String matriculeVoiture = sc.next();

        System.out.println("Date du modèle : ");
        System.out.print("Année : ");
        int anneeV = sc.nextInt();
        System.out.print("Mois : ");
        int moisV = sc.nextInt();
        System.out.print("Jour : ");
        int jourV = sc.nextInt();
        LocalDate dateVoiture = LocalDate.of(anneeV, moisV, jourV);
        System.out.print("Prix de la voiture : ");
        int prixVoiture = sc.nextInt();
        parc[0] = new Voiture(matriculeVoiture, prixVoiture,dateVoiture);
        System.out.println("\n--- Création d'un Camion ---");
        System.out.print("Matricule: ");
        String matriculeCamion = sc.next();
        System.out.println("Date du modèle : ");
        System.out.print("Année : ");
        int anneeC = sc.nextInt();
        System.out.print("Mois : ");
        int moisC = sc.nextInt();
        System.out.print("Jour : ");
        int jourC = sc.nextInt();
        LocalDate dateCamion = LocalDate.of(anneeC, moisC, jourC);
        System.out.print("Prix du camion : ");
        int prixCamion = sc.nextInt();
        parc[1] = new Camion(matriculeCamion, prixCamion,dateCamion);
        sc.close();
        System.out.println("\n--- Parc Auto ---");
        for (Vehicule v : parc) {
            System.out.println(v); 
            v.demarre();
            v.accelerer();
            System.out.println("------------------------");
        }
    }
}
