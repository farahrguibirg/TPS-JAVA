package TP6;
import java.io.*;

public class CompterMots {
    public static void main(String[] args) {
        File fichier = new File("data.txt");
        if (!fichier.exists()) {
            System.out.println("Le fichier data.txt n'existe pas.");
            return;
        }

        int compteurMots = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;

            while ((ligne = reader.readLine()) != null) {
                ligne = ligne.trim();
                if (!ligne.isEmpty()) {
                    String[] mots = ligne.split("\\s+");
                    compteurMots += mots.length;
                }
            }

            System.out.println("Nombre total de mots dans le fichier : " + compteurMots);

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
