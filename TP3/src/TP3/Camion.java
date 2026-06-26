package TP3;

import java.time.LocalDate;

public class Camion extends Vehicule {

	public Camion(String matricule,int prix,LocalDate annee) {
		super(matricule,prix,annee);
	}
	 @Override
	    public void demarre() {
	        System.out.println("Le camion " + getMatricule() + " démarre lentement.");
	    }

	    @Override
	    public void accelerer() {
	        System.out.println("Le camion " + getMatricule() + " accélère progressivement.");
	    }

}
