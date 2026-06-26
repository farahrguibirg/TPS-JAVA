package TP3;

import java.time.LocalDate;

public class Voiture extends Vehicule {

	public Voiture(String matricule,int prix,LocalDate annee) {
		super(matricule,prix,annee);
	}
	@Override
    public void demarre() {
        System.out.println("La voiture " + getMatricule() + " démarre doucement.");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture " + getMatricule() + " accélère rapidement.");
    }

}
