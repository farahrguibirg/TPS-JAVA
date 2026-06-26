package TP6;
import java.io.*;
import java.nio.file.*;

public class BackupManager {
    public static void main(String[] args) {
        String sourcePath = "C:\\Users\\hp\\Desktop\\TOUS/compta.pdf"; 
        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("Le fichier source n'existe pas.");
            return;
        }
        File backupDir = new File("backup");
        if (!backupDir.exists()) {
            backupDir.mkdir();}
        File destFile = new File(backupDir, sourceFile.getName());

        byte[] buffer = new byte[4096];
        int bytesRead;
        long totalBytes = 0;

        long startTime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;}
            long endTime = System.currentTimeMillis();

            System.out.println("Sauvegarde réussie !");
            System.out.println("Taille totale copiée : " + totalBytes + " octets");
            System.out.println("Durée de la copie : " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }
}
