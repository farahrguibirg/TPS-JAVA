package TP4;

public abstract class Employe {
	public String nom;
	public int age;

    public Employe(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract double calculerSalaire();

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", Age : " + age + ", Salaire : " + calculerSalaire());
    }
}
