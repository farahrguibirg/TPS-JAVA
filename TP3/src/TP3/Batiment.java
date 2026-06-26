package TP3;

class Batiment {
    private String adresse;
    
    public Batiment() {
        this.adresse = "Rue eljezzar";}
    public Batiment(String adresse) {
        this.adresse = adresse;}
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void afficher() {
        System.out.println("Bâtiment:");
        System.out.println("  Adresse: " + adresse);
    }
}