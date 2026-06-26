package TP4;

class MainAnimaux {
    public static void main(String[] args) {
        Animal[] animaux = {
            new Chien("Rex", 50),
            new Oiseau("Tweety", 40),
            new Chien("Max", 8)};
         Sonore[] sonores = {
            new Chien("Médor", 30),
            new Oiseau("Piou", 25)
        };
        System.out.println("--- TEST 1: Polymorphisme Animal[] ---\n");
        for (Animal a : animaux) {
            System.out.println("Animal: " + a.getNom() + " (Énergie initiale: " + a.getEnergie() + ")");
            try {
                a.deplacer();
                a.manger(15);
            } catch (EnergieInsuffisanteException e) {
                System.err.println("❌ EXCEPTION: " + e.getMessage());
                System.out.println("→ On nourrit " + a.getNom() + " pour qu'il récupère");
                a.manger(20);
                try {
                    a.deplacer();
                } catch (EnergieInsuffisanteException e2) {
                    System.err.println("❌ Toujours pas assez d'énergie!");}}
            System.out.println(); }
        System.out.println("\n--- TEST 2: Polymorphisme Sonore[] ---\n");
        for (Sonore s : sonores) {
            s.crier();
            s.crier();
            s.crier(); 
            System.out.println();}
        System.out.println("\n--- TEST 3: Interface Domestique ---\n");
        Chien rex = new Chien("Buddy", 20);
        System.out.println(rex.getNom() + " a " + rex.getEnergie() + " d'énergie");
        rex.caresser();
        rex.caresser();
        try {
            rex.deplacer();
        } catch (EnergieInsuffisanteException e) {
            System.err.println("❌ " + e.getMessage());}
        System.out.println("\n--- TEST 4: Exception EnergieInsuffisanteException ---\n");
        Chien chienFatigue = new Chien("Lazy", 3);
        Oiseau oiseauFatigue = new Oiseau("Tired", 2);
        System.out.println("Test avec " + chienFatigue.getNom() + ":");
        try {
            chienFatigue.deplacer();
        } catch (EnergieInsuffisanteException e) {
            System.err.println("❌ Exception capturée: " + e.getMessage());
            System.out.println("→ Solution: nourrir l'animal");
            chienFatigue.manger(25);
            try {
                chienFatigue.deplacer();
                System.out.println("✓ Déplacement réussi après avoir mangé!");
            } catch (EnergieInsuffisanteException e2) {
                System.err.println(e2.getMessage());}}
        System.out.println("\nTest avec " + oiseauFatigue.getNom() + ":");
        try {
            oiseauFatigue.deplacer();
        } catch (EnergieInsuffisanteException e) {
            System.err.println("❌ Exception capturée: " + e.getMessage());
            oiseauFatigue.manger(10);
            try {
                oiseauFatigue.deplacer();
                System.out.println("✓ Vol réussi!");
            } catch (EnergieInsuffisanteException e2) {
                System.err.println(e2.getMessage());}}}}

