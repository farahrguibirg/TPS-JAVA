package TP3;

import java.time.LocalDate;

public abstract class Vehicule {
private String matricule;
private int prix;
private LocalDate annee;
private static int compteur = 0;
	public Vehicule(String matricule,int prix,LocalDate annee) {
		this.matricule=matricule;
		this.prix=prix;
		this.annee=annee;
		compteur ++;

	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public LocalDate getAnnee() {
		return annee;
	}
	public void setAnnee(LocalDate annee) {
		this.annee = annee;
	}
public abstract void demarre() ;
public abstract void accelerer() ;
@Override
public String toString() {
    return "Matricule : " + matricule + ", Prix : " + prix + ", Année : " + annee;
}
}

