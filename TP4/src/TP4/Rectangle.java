package TP4;

class Rectangle extends Forme {
	public double largeur, hauteur;
	public String couleur;

    public Rectangle(double largeur, double hauteur, String couleur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    @Override
    public double aire() {
        return largeur * hauteur;
    }

    @Override
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}

