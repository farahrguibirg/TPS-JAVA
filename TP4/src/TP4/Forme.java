package TP4;

public abstract class Forme {
	public abstract double aire();
	public abstract double perimetre();

    public void afficherInfos() {
        System.out.println("Type : " + this.getClass().getSimpleName());
        System.out.println("Aire : " + aire());
        System.out.println("Périmètre : " + perimetre());
    }
}

