package TP4;

public class EmployeHoraire extends Employe {
    public int heures;
    public double tauxHoraire, bonus;

    public EmployeHoraire(String nom, int age, int heures, double tauxHoraire, double bonus) {
        super(nom, age);
        this.heures = heures;
        this.tauxHoraire = tauxHoraire;
        this.bonus = bonus;
    }

    @Override
    public double calculerSalaire() {
        return heures * tauxHoraire + bonus;
    }
}

