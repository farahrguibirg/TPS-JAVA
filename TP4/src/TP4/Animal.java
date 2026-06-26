package TP4;

class EnergieInsuffisanteException extends Exception {
    public EnergieInsuffisanteException(String message) {
        super(message);
    }
}
abstract class Animal {
    protected String nom;
    protected int energie;
    
    public Animal(String nom, int energie) {
        this.nom = nom;
        this.energie = energie;
    }
    
    public abstract void deplacer() throws EnergieInsuffisanteException;
    
    public void manger(int nourriture) {
        energie += nourriture;
        System.out.println(nom + " mange et gagne " + nourriture + " d'énergie. Énergie: " + energie);
    }
    
    public int getEnergie() {
        return energie;
    }
    
    public String getNom() {
        return nom;
    }
}
