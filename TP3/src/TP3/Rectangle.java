package TP3;

class Rectangle {
    protected double longueur;
    protected double largeur;
    protected String nom;
    
    public Rectangle() {
        this.longueur = 5.0;
        this.largeur = 13.0;
        this.nom="rectangle";}
    public Rectangle(double longueur, double largeur,String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom=nom;}
    public void afficher() {
        System.out.println("Forme: " + nom);
        System.out.println("Longueur: " + longueur);
        System.out.println("Largeur: " + largeur);
        System.out.println("Surface: " + surface());}
    public double surface() {
        return longueur * largeur;}}
