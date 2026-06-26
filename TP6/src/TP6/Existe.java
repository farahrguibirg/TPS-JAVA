package TP6;
import java.io.File;

public class Existe {
    public static void main(String[] args) {

        File fichier = new File("C:\\\\Users\\\\hp\\\\Desktop\\\\PDF/ch1 se.pdf");
        
        if (!fichier.exists()) {
            System.out.println("Le fichier data.txt n'existe pas.");
            return;
        }

        File nouveauFichier = new File("C:\\Users\\hp\\Desktop\\PDF/ch1 se.pdf");
        boolean succes = fichier.renameTo(nouveauFichier);
        
        if (succes) {
            System.out.println("Le fichier a été renommé avec succès !");
        } else {
            System.out.println("Échec du renommage du fichier.");
        }
    }
}
