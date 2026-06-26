package TP4;

class EmployeFixe extends Employe {
	public double montantFixe, prime;

    public EmployeFixe(String nom, int age, double montantFixe, double prime) {
        super(nom, age);
        this.montantFixe = montantFixe;
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return montantFixe + prime;
    }
}
