package TP4;

class Division {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);  
        boolean succes = false;
        
        while (!succes) {
            try {
                System.out.print("Entrez le dividende (nombre à diviser): ");
                int dividende = sc.nextInt();    
                System.out.print("Entrez le diviseur: ");
                int diviseur = sc.nextInt();
                double resultat = (double) dividende / diviseur;
                
                System.out.println("\n✓ Résultat: " + dividende + " / " + diviseur + " = " + resultat);
                succes = true;
                
            } catch (ArithmeticException e) {
                String erreur = "ArithmeticException: Division par zéro tentée";
                logErreur(erreur);
                System.err.println("\n Erreur: Division par zéro impossible!");
                System.out.println(" Veuillez réessayer avec un diviseur différent de zéro.\n");
                
            } catch (java.util.InputMismatchException e) {
                String erreur = "InputMismatchException: Entrée non numérique";
                logErreur(erreur);
                System.err.println("\n Erreur: Veuillez entrer des nombres entiers valides!");
                System.out.println("→ Réessayez.\n");
                sc.nextLine();}}
        System.out.println("\n✓ Opération terminée avec succès!");
        System.out.println("→ Les erreurs ont été journalisées dans 'erreurs.log'");
        sc.close();}
    private static void logErreur(String message) {
        try (java.io.FileWriter fw = new java.io.FileWriter("erreurs.log", true);
             java.io.PrintWriter pw = new java.io.PrintWriter(fw)) {
            String timestamp = java.time.LocalDateTime.now().toString();
            pw.println(timestamp + " - " + message);
        } catch (java.io.IOException e) {
            System.err.println(" Erreur lors de l'écriture dans le fichier log: " + e.getMessage());
        }
    }
}
