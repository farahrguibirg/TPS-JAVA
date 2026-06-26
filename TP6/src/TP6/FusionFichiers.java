package TP6;
import java.io.*;

public class FusionFichiers {
    public static void main(String[] args) {
        File fichier1 = new File("fichier1.txt");
        File fichier2 = new File("fichier2.txt");
        File fichierFusion = new File("fusion.txt");

        if (!fichier1.exists() || !fichier2.exists()) {
            System.out.println("Un ou les deux fichiers sources n'existent pas.");
            return;}
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(fichier1));
            BufferedReader reader2 = new BufferedReader(new FileReader(fichier2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fichierFusion))
        ) {
            String ligne;
            while ((ligne = reader1.readLine()) != null) {
                writer.write(ligne);
                writer.newLine();  }
            while ((ligne = reader2.readLine()) != null) {
                writer.write(ligne);
                writer.newLine();}
            System.out.println("Les fichiers ont été fusionnés avec succès dans fusion.txt");

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture ou de l'écriture des fichiers : " + e.getMessage());
        }
    }
}
