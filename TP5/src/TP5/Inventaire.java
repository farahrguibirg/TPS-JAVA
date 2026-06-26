package TP5;
import java.util.*;
class Produit {
    private String nom;
    private String reference;
    private double prix;
    public Produit(String nom, String reference, double prix) {
        this.nom = nom;
        this.reference = reference; this.prix = prix;}
    public String getReference() { return reference;}
    public double getPrix() {return prix;}
    public void setPrix(double prix) { this.prix = prix;}
    @Override
    public String toString() {return "Ref: [" + reference + "], Nom: [" + nom + "], Prix: [" +  String.format("%.2f", prix) + " €]";}}
class Inventaire {
    private List<Produit> produits;
    public Inventaire() {this.produits = new ArrayList<>();}
    public boolean ajouterProduit(Produit p) {
        for (Produit produit : produits) { if (produit.getReference().equals(p.getReference())) {  return false;}} produits.add(p); return true;}
    public Produit trouverParReference(String ref) {for (Produit produit : produits) { if (produit.getReference().equals(ref)) { return produit;}} return null;}
    public void afficherInventaire() {
        System.out.println("\n=== Inventaire Complet ===");for (Produit produit : produits) { System.out.println(produit);}}
    public void augmenterPrix(String ref, double pourcentage) {
        Produit produit = trouverParReference(ref);
        if (produit != null) { double nouveauPrix = produit.getPrix() * (1 + pourcentage / 100);
            produit.setPrix(nouveauPrix);System.out.println("Prix augmenté de " + pourcentage + "% pour le produit " + ref);
        } else { System.out.println("Produit non trouvé: " + ref);}}
    public static void main(String[] args) {
        Inventaire inventaire = new Inventaire();
        System.out.println("\nAjout de produits:");inventaire.ajouterProduit(new Produit("Ordinateur", "REF001", 899.99));
        inventaire.ajouterProduit(new Produit("Souris", "REF002", 25.50));inventaire.ajouterProduit(new Produit("Clavier", "REF003", 65.00));
        System.out.println("3 produits ajoutés avec succès");System.out.println("\nTest d'unicité de la référence:");
        boolean ajoutDuplique = inventaire.ajouterProduit(new Produit("Autre", "REF001", 100.00));
        System.out.println("Tentative d'ajout d'un produit avec référence REF001 existante: " + (ajoutDuplique ? "Succès" : "Échec (référence déjà existante)"));
        System.out.println("\nAugmentation de prix:");inventaire.augmenterPrix("REF002", 10);inventaire.afficherInventaire();}}