package TP4;

class Oiseau extends Animal implements Sonore {
    public Oiseau(String nom, int energie) {
        super(nom, energie);
    }
    
    @Override
    public void deplacer() throws EnergieInsuffisanteException {
        if (energie < 8) {
            throw new EnergieInsuffisanteException(nom + " n'a pas assez d'énergie pour voler!");
        }
        energie -= 8;
        System.out.println(nom + " vole! Énergie restante: " + energie);
    }
    
    @Override
    public void crier() {
        if (energie >= 3) {
            energie -= 3;
            System.out.println(nom + " chante: Cui cui! Énergie: " + energie);
        } else {
            System.out.println(nom + " est trop fatigué pour chanter...");
        }
    }
}
