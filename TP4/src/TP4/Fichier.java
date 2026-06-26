package TP4;

class Fichier {
    public static void main(String[] args) {
        creerFichierTest();
        int somme = 0;
        int lignesCorrectes = 0;
        int lignesIncorrectes = 0;
        java.util.List<String> erreursDetails = new java.util.ArrayList<>();
        try (java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.FileReader("data.txt"))) {
            String ligne;
            int numeroLigne = 0;
            System.out.println("Lecture du fichier 'data.txt'...\n");
            while ((ligne = br.readLine()) != null) {
                numeroLigne++;
                try {
                    int nombre = Integer.parseInt(ligne.trim());
                    somme += nombre;
                    lignesCorrectes++;
                    System.out.println("✓ Ligne " + numeroLigne + ": " + nombre);
                    
                } catch (NumberFormatException e) {
                    lignesIncorrectes++;
                    String erreur = "❌ Ligne " + numeroLigne + ": \"" + ligne + "\" (format invalide)";
                    System.err.println(erreur);
                    erreursDetails.add(erreur);}} 
        } catch (java.io.FileNotFoundException e) {
            System.err.println("❌ ERREUR CRITIQUE: Fichier 'data.txt' non trouvé!");
            System.err.println("→ " + e.getMessage());
            return; 
        } catch (java.io.IOException e) {
            System.err.println("❌ ERREUR CRITIQUE: Erreur de lecture du fichier!");
            System.err.println("→ " + e.getMessage());
            return;}
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RÉSUMÉ DE LA LECTURE");
        System.out.println("=".repeat(50));
        System.out.println("Lignes correctes:   " + lignesCorrectes);
        System.out.println("Lignes incorrectes: " + lignesIncorrectes);
        System.out.println("Somme totale:       " + somme);
        System.out.println("=".repeat(50));
        
        if (!erreursDetails.isEmpty()) {
            System.out.println("\nDétails des erreurs:");
            for (String err : erreursDetails) {
                System.out.println("  " + err);
            }
        }
    }
    
    private static void creerFichierTest() {
        try (java.io.PrintWriter pw = new java.io.PrintWriter("data.txt")) {
            pw.println("10");
            pw.println("20");
            pw.println("invalide");
            pw.println("30.5");
            pw.println("40");
            pw.println("");
            pw.println("abc123");
            pw.println("50");
            System.out.println("→ Fichier 'data.txt' créé avec succès\n");
        } catch (java.io.IOException e) {
            System.err.println("⚠ Erreur lors de la création du fichier: " + e.getMessage());
        }
    }
}
