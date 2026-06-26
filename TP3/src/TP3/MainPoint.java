package TP3;

import java.util.Scanner;

public class MainPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Segment 1");
        System.out.print("Entrez x1 (origine): ");
        double x1 = scanner.nextDouble();
        System.out.print("Entrez y1 (origine): ");
        double y1 = scanner.nextDouble();
        System.out.print("Entrez x2 (extrémité): ");
        double x2 = scanner.nextDouble();
        System.out.print("Entrez y2 (extrémité): ");
        double y2 = scanner.nextDouble();
        Segment seg = new Segment(x1, y1, x2, y2);
        seg.afficher();
        System.out.println("  Longueur: " + seg.longueur());

    }
}