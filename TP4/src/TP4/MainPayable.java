package TP4;

class MainPayable {
    public static void main(String[] args) {

        Payable[] elements = {
            new Facture(100, 0.20),
            new Facture(250, 0.055),
            new Achat(25.50, 3, 0.10),
            new Achat(15.99, 5, 0),
            new Service(45, 5, 0.25),
            new Service(60, 8, 0)
        };
        double total = 0;
        System.out.println("Détails des paiements:\n");
        for (int i = 0; i < elements.length; i++) {
            System.out.println((i + 1) + ". " + elements[i]);
            total += elements[i].getMontantAPayer();
        }
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("MONTANT TOTAL À PAYER: %.2f€\n", total);
        System.out.println("=".repeat(60));
    }
}