package TP4;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);}}
class MontantNegatifException extends Exception {
    public MontantNegatifException(String message) {
        super(message);}}
class CompteBancaire {
    private double solde;
    private double decouvertMaximal;
    public CompteBancaire(double soldeInitial, double decouvertMaximal) {
        this.solde = soldeInitial;
        this.decouvertMaximal = decouvertMaximal;}
    public void deposer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException(
                "Impossible de deposer un montant negatif: " + montant + " euros");}
        solde += montant;
        journaliser("DEPOT: +" + String.format("%.2f", montant) + " euros, Nouveau solde: " + String.format("%.2f", solde) + " euros");
        System.out.println("✓ Depot de " + String.format("%.2f", montant) + " euros effectue");}
    public void retirer(double montant) throws SoldeInsuffisantException, MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException(
                "Impossible de retirer un montant negatif: " + montant + " euros");}
        double soldeApresRetrait = solde - montant;
        if (soldeApresRetrait < -decouvertMaximal) {
            throw new SoldeInsuffisantException(
                String.format("Solde insuffisant! Solde actuel: %.2f euros, Decouvert autorise: %.2f euros, " +
                             "Montant demande: %.2f euros, Solde minimum autorise: %.2f euros", 
                    solde, decouvertMaximal, montant, -decouvertMaximal));}
        solde -= montant;
        journaliser("RETRAIT: -" + String.format("%.2f", montant) + " euros, Nouveau solde: " + String.format("%.2f", solde) + " euros");
        System.out.println("✓ Retrait de " + String.format("%.2f", montant) + " euros effectue");}
    public double getSolde() { return solde;}
    public double getDecouvertMaximal() {return decouvertMaximal;}
    private void journaliser(String message) {
        try (FileWriter fw = new FileWriter("transactions.log", true);
             PrintWriter pw = new PrintWriter(fw)) {
            String timestamp = LocalDateTime.now().toString(); pw.println(timestamp + " - " + message);
        } catch (IOException e) { System.err.println("Erreur de journalisation: " + e.getMessage());}}}

