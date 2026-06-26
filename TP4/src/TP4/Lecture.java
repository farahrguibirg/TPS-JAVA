package TP4;

class Lecture {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] tableau = {10, 20, 30, 40, 50};
        
        System.out.println("Tableau disponible: " + java.util.Arrays.toString(tableau));
        System.out.println("Indices valides: 0 à " + (tableau.length - 1) + "\n");
        
        boolean indexValide = false;
        while (!indexValide) {
            try {
                System.out.print("Entrez un index pour accéder à l'élément: ");
                int index = sc.nextInt();
                int element = tableau[index];
                System.out.println("\n✓ Succès!");
                System.out.println("→ Élément à l'index " + index + ": " + element);
                System.out.println("→ Index valide!\n");
                indexValide = true;
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("\n❌ Erreur: Index hors limites!");
                System.out.println("→ Veuillez choisir un index entre 0 et " + (tableau.length - 1));
                System.out.println("→ Réessayez.\n");
                
            } catch (java.util.InputMismatchException e) {
                System.err.println("\n❌ Erreur: Entrée invalide!");
                System.out.println("→ Veuillez entrer un nombre entier.");
                System.out.println("→ Réessayez.\n");
                sc.nextLine(); 
            }
        }
        
        System.out.println("✓ Programme terminé avec succès!");
        sc.close();
    }
}

