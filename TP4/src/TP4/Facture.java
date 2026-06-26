package TP4;

class Facture implements Payable {
    private double montant;
    private double tauxTVA;
    
    public Facture(double montant, double tauxTVA) {
        this.montant = montant;
        this.tauxTVA = tauxTVA;
    }
    
    @Override
    public double getMontantAPayer() {
        return montant * (1 + tauxTVA);
    }
    
    @Override
    public String toString() {
        return String.format("Facture - Montant HT: %.2f€, TVA: %.0f%%, Total TTC: %.2f€", 
            montant, tauxTVA * 100, getMontantAPayer());
    }
}

