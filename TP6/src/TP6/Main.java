package TP6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.loadUsers();
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("\n1. Ajouter un utilisateur");
            System.out.println("2. Afficher les utilisateurs");
            System.out.println("3. Sauvegarder et quitter");
            System.out.print("Choix : ");
            int choix = sc.nextInt();
            sc.nextLine(); 
            switch (choix) {
                case 1:
                    System.out.print("ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Username : ");
                    String username = sc.nextLine();
                    System.out.print("Email : ");
                    String email = sc.nextLine();
                    userService.addUser(new User(id, username, email));
                    break;
                case 2:
                    userService.listUsers();
                    break;
                case 3:
                    userService.saveUsers();
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }

        sc.close();
    }
}
