package TP6;
import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();
            
            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);
            
            System.out.print("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();
            
            double resultat;
            
            switch (operateur) {
                case '+':
                    resultat = nombre1 + nombre2;
                    System.out.println("Résultat : " + nombre1 + " + " + nombre2 + " = " + resultat);
                    break;
                case '-':
                    resultat = nombre1 - nombre2;
                    System.out.println("Résultat : " + nombre1 + " - " + nombre2 + " = " + resultat);
                    break;
                case '*':
                    resultat = nombre1 * nombre2;
                    System.out.println("Résultat : " + nombre1 + " * " + nombre2 + " = " + resultat);
                    break;
                case '/':
                    if (nombre2 == 0) {
                        System.out.println("Erreur : Division par zéro impossible !");
                    } else {
                        resultat = (double) nombre1 / nombre2;
                        System.out.println("Résultat : " + nombre1 + " / " + nombre2 + " = " + resultat);
                    }
                    break;
                default:
                    System.out.println("Erreur : Opérateur non valide. Utilisez +, -, * ou /");
            }
        } catch (Exception e) {
            System.out.println("Erreur : Veuillez entrer des nombres valides.");
        } finally {
            scanner.close();
        }
    }
}