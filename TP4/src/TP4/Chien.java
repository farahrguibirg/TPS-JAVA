package TP4;

class Chien extends Animal implements Sonore, Domestique {
    public Chien(String nom, int energie) {
        super(nom, energie);
    }
    @Override
    public void deplacer() throws EnergieInsuffisanteException {
        if (energie < 10) {
            throw new EnergieInsuffisanteException(nom + " n'a pas assez d'énergie pour se déplacer!");
        }
        energie -= 10;
        System.out.println(nom + " court! Énergie restante: " + energie);
    }
    
    @Override
    public void crier() {
        if (energie >= 5) {
            energie -= 5;
            System.out.println(nom + " aboie: Woof! Woof! Énergie: " + energie);
        } else {
            System.out.println(nom + " est trop fatigué pour aboyer...");
        }
    }
    
    @Override
    public void caresser() {
        energie += 3;
        System.out.println(nom + " remue la queue, content d'être caressé! Énergie: " + energie);
    }
}
