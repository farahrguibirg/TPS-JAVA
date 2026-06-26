package TP5;
import java.util.*;
public class ImprimerCollection {
    public static void imprimerCollection(Collection<?> c) {
        System.out.print("[");
        int count = 0;
        for (Object element : c) {
            if (count > 0) {
                System.out.print(", "); }
            System.out.print(element);
            count++;} System.out.println("]");}
    public static void parcourirEtSupprimer(List<String> liste) {
        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) { String ville = iterator.next();
            if (ville.length() > 6) {
                System.out.println("  Suppression de: " + ville + " (longueur: " + ville.length() + ")"); iterator.remove();}}}
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();
        villes.add("Paris");
        villes.add("Lyon");
        villes.add("Marseille");
        villes.add("Toulouse");
        villes.add("Nice");
        System.out.println("Liste initiale des villes:");
        imprimerCollection(villes);
        System.out.println("\nAjout de 'Bordeaux' à l'index 2:");
        villes.add(2, "Bordeaux");
        System.out.println("Liste après ajout:");
        imprimerCollection(villes);
        System.out.println("\nSuppression des villes avec plus de 6 caractères:");
        parcourirEtSupprimer(villes);
        System.out.println("\nListe finale:");
        imprimerCollection(villes);
        System.out.println("\nNombre de villes restantes: " + villes.size());}}