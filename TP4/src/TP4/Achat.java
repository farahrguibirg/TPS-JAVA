package TP4;

class Achat implements Payable {
    private double prixUnitaire;
    private int quantite;
    private double remise;
    
    public Achat(double prixUnitaire, int quantite, double remise) {
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.remise = remise;
    }
    
    @Override
    public double getMontantAPayer() {
        return prixUnitaire * quantite * (1 - remise);
    }
    
    @Override
    public String toString() {
        return String.format("Achat - Prix unitaire: %.2f€, Quantité: %d, Remise: %.0f%%, Total: %.2f€",
            prixUnitaire, quantite, remise * 100, getMontantAPayer());
    }
}
