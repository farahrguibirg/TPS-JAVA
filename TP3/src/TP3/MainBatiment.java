package TP3;

import java.util.Scanner;
public class MainBatiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bâtiment");
        System.out.print("Entrez l'adresse du bâtiment: ");
        String adresseBat = scanner.nextLine();
        Batiment bat = new Batiment(adresseBat);
        bat.afficher();
        
        System.out.println("Maison ");
        System.out.print("Entrez l'adresse de la maison: ");
        String adresseMaison = scanner.nextLine();
        System.out.print("Entrez le nombre de pièces: ");
        int nbPieces = scanner.nextInt();
        Maison maison = new Maison(adresseMaison, nbPieces);
        maison.afficher();
        }}