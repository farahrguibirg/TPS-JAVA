package TP6;
import java.io.*;

public class LogAnalizer {
    public static void main(String[] args) {
        File logFile = new File("app.log");
        File errorFile = new File("errors.log");
        if (!logFile.exists()) {
            System.out.println("Le fichier app.log n'existe pas.");
            return;}
        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(logFile));
              BufferedWriter bw = new BufferedWriter(new FileWriter(errorFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalLines++;
                if (line.contains("ERROR")) {
                    errorCount++;
                    bw.write(line);
                    bw.newLine();}
                if (line.contains("WARNING")) {
                    warningCount++;}}
            System.out.println("Analyse terminée !");
            System.out.println("Nombre total de lignes : " + totalLines);
            System.out.println("Nombre de lignes ERROR : " + errorCount);
            System.out.println("Nombre de lignes WARNING : " + warningCount);
            System.out.println("Les lignes ERROR ont été enregistrées dans errors.log");

        } catch (IOException e) {
            System.out.println("Erreur lors de l'analyse des logs : " + e.getMessage());
        }
    }
}
