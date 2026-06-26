package TP4;

public class MainCompteBancaire {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000, 200);
        System.out.println("Compte cree:");
        System.out.println("-> Solde initial: " + String.format("%.2f", compte.getSolde()) + " euros");
        System.out.println("-> Decouvert autorise: " + String.format("%.2f", compte.getDecouvertMaximal()) + " euros");
        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("TEST 1: Depot de 500 euros");
        try {
            compte.deposer(500);
            System.out.println("-> Solde actuel: " + String.format("%.2f", compte.getSolde()) + " euros\n");
        } catch (MontantNegatifException e) {
            System.err.println("Erreur: " + e.getMessage() + "\n");}
        System.out.println("TEST 2: Retrait de 300 euros");
        try {
            compte.retirer(300);
            System.out.println("-> Solde actuel: " + String.format("%.2f", compte.getSolde()) + " euros\n");
        } catch (SoldeInsuffisantException | MontantNegatifException e) {
            System.err.println("Erreur: " + e.getMessage() + "\n");
        }
        System.out.println("TEST 3: Tentative de depot negatif (-100 euros)");
        try {
            compte.deposer(-100);
        } catch (MontantNegatifException e) {
            System.err.println("Exception capturee: " + e.getMessage());
            System.out.println("-> Depot refuse\n");}
        System.out.println("TEST 4: Tentative de retrait negatif (-50 euros)");
        try {
            compte.retirer(-50);
        } catch (MontantNegatifException e) {
            System.err.println("Exception capturee: " + e.getMessage());
            System.out.println("-> Retrait refuse\n");
        } catch (SoldeInsuffisantException e) {
            System.err.println("Exception capturee: " + e.getMessage());
            System.out.println("-> Retrait refuse\n");}
        System.out.println("TEST 5: Retrait de 1000 euros (utilisation du decouvert)");
        try {
            compte.retirer(1000);
            System.out.println("-> Solde actuel: " + String.format("%.2f", compte.getSolde()) + " euros");
            System.out.println("-> Compte en decouvert autorise\n");
        } catch (SoldeInsuffisantException | MontantNegatifException e) {
            System.err.println("Erreur: " + e.getMessage() + "\n");}
        System.out.println("TEST 6: Tentative de retrait de 500 euros (depassement du decouvert)");
        try {
            compte.retirer(500);
        } catch (SoldeInsuffisantException e) {
            System.err.println("Exception capturee:");
            System.err.println("   " + e.getMessage());
            System.out.println("-> Retrait refuse\n");
        } catch (MontantNegatifException e) {
            System.err.println("Exception capturee: " + e.getMessage());
            System.out.println("-> Retrait refuse\n");}
        System.out.println("TEST 7: Depot de 1000 euros pour renflouer le compte");
        try {
            compte.deposer(1000);
            System.out.println("-> Solde actuel: " + String.format("%.2f", compte.getSolde()) + " euros\n");
        } catch (MontantNegatifException e) {
            System.err.println("Erreur: " + e.getMessage() + "\n");}
        System.out.println("=".repeat(50));
        System.out.println("RESUME FINAL");
        System.out.println("=".repeat(50));
        System.out.println("Solde final: " + String.format("%.2f", compte.getSolde()) + " euros");
        System.out.println("\n-> Toutes les transactions ont ete journalisees dans 'transactions.log'");}}