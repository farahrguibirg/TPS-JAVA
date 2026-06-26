package TP3;

class Maison extends Batiment {
    private int nbPieces;
    
    public Maison() {
        super();
        this.nbPieces = 0;}
    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;}
    public int getNbPieces() {
        return nbPieces;}
    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;}
    @Override
    public void afficher() {
        System.out.println("Maison:");
        System.out.println("  Adresse: " + getAdresse());
        System.out.println("  Nombre de pièces: " + nbPieces);
    }
}