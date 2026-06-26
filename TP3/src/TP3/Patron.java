package TP3;

import java.time.LocalDate;

public class Patron extends Employe {
	private static double CA;
	private double pourcentage; 
	public Patron(String Matricule,String Nom,String Prenom,LocalDate DateN,double pourcentage) {
		super(Matricule,Nom,Prenom,DateN);
		this.pourcentage=pourcentage;
	}
	@Override
	public double getSalaire() {
		return CA*pourcentage /100;
	}
	public static double getCA() {
		return CA;
	}
	public static void setCA(double cA) {
		CA = cA;
	}
	public double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

}
