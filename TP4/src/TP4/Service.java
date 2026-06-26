package TP4;

class Service implements Payable {
    private double tarifHoraire;
    private int nbHeures;
    private double majorationNocturne;
    
    public Service(double tarifHoraire, int nbHeures, double majorationNocturne) {
        this.tarifHoraire = tarifHoraire;
        this.nbHeures = nbHeures;
        this.majorationNocturne = majorationNocturne;
    }
    
    @Override
    public double getMontantAPayer() {
        return tarifHoraire * nbHeures * (1 + majorationNocturne);
    }
    
    @Override
    public String toString() {
        return String.format("Service - Tarif: %.2f€/h, Heures: %d, Majoration: %.0f%%, Total: %.2f€",
            tarifHoraire, nbHeures, majorationNocturne * 100, getMontantAPayer());
    }
}
