package TP3;


import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println(" Rectangle ");
        System.out.print("Entrez la longueur du rectangle: ");
        double longueur = scanner.nextDouble();
        System.out.print("Entrez la largeur du rectangle: ");
        double largeur = scanner.nextDouble();
        System.out.println("entrer le nom du rectangle");
        String nom=scanner.next();
        Rectangle rect = new Rectangle(longueur, largeur,nom);
        rect.afficher();

        System.out.println(" Carré ");
        Carre carre = new Carre();
        carre.afficher();}}