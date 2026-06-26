package TP6;
import java.io.*;
import java.util.Scanner;

public class RechercheMots {
    public static void main(String[] args) {
        File fichier = new File("recherche.txt");
        if (!fichier.exists()) {
            System.out.println("Le fichier recherche.txt n'existe pas.");
            return;}
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le mot à rechercher : ");
        String motRecherche = sc.nextLine().trim();
        int compteurOccurrences = 0;
        int numeroLigne = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                numeroLigne++;
                String[] mots = ligne.split("\\s+");
                int occurrencesDansLigne = 0;

                for (String mot : mots) {
                    if (mot.equalsIgnoreCase(motRecherche)) { 
                        occurrencesDansLigne++;
                        compteurOccurrences++;}}
                if (occurrencesDansLigne > 0) {
                    System.out.println("Le mot \"" + motRecherche + "\" apparaît " + occurrencesDansLigne + " fois à la ligne " + numeroLigne);
                }
            }

            if (compteurOccurrences == 0) {
                System.out.println("Le mot \"" + motRecherche + "\" n'a pas été trouvé dans le fichier.");
            } else {
                System.out.println("Nombre total d'occurrences : " + compteurOccurrences);
            }

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        sc.close();
    }
}
