package TP4;

class Cercle extends Forme {
	public double rayon;
	public String couleur;

    public Cercle(double rayon, String couleur) {
        this.rayon = rayon;
        this.couleur = couleur;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
