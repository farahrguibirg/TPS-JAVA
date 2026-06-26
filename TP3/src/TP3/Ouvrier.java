package TP3;
import java.time.LocalDate;

public class Ouvrier extends Employe {
	
private  LocalDate DateEntre;
private static final double SMIG = 2500;

	public Ouvrier(String Matricule,String Nom,String Prenom,LocalDate DateN,LocalDate DateEntre) {
		super(Matricule,Nom,Prenom,DateN);
		this.DateEntre=DateEntre;
	}
	
	public static double getSmig() {
		return SMIG;
	}

	public LocalDate getDateEntre() {
		return DateEntre;
	}

	public void setDateEntre(LocalDate dateEntre) {
		DateEntre = dateEntre;
	}

	@Override
	public double getSalaire() {
	    int anciennete = LocalDate.now().getYear() - DateEntre.getYear();
	    double salaire = SMIG + anciennete * 100;
	    if (salaire > SMIG * 2) {
	        salaire = SMIG * 2;
	    }
	    return salaire;
	}}
