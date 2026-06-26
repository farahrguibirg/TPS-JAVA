package TP3;
import java.time.LocalDate;

public abstract class Employe {
	protected String Matricule,Nom,Prenom;
	protected LocalDate  DateN;

	public Employe(String Matricule,String Nom,String Prenom,LocalDate DateN) {
	this.Matricule=Matricule;
	this.Nom=Nom;
	this.Prenom=Prenom;
	this.DateN=DateN;
	}
	public String getMatricule() {return Matricule;}
	public String getNom() {return Nom;}
	public String getPrenom() {return Prenom;}
	public LocalDate getDateN() {return DateN;}
	public void setMatricule(String Matricule) {this.Matricule=Matricule;}
	public void setNom(String Nom) {this.Nom=Nom;}
	public void setPrenom(String Prenom) {this.Prenom=Prenom;}
	public void setDateN(LocalDate DateN) {this.DateN=DateN;}
	public void afficher() {
		System.out.println("le nom de l'employe est + " + Nom  );
		System.out.println("le Prenom de l'employe est + " + Prenom  );
		System.out.println("la date de naissance  de l'employe est + " + DateN  );
		System.out.println("le Matricule de l'employe est + " + Matricule  );
	}
	public abstract double getSalaire();
	}
