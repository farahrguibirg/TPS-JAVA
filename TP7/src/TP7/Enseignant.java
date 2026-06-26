package TP7;

public class Enseignant extends Utilisateur {
    private String specialite;

    public Enseignant(String id, String nom, String email, String specialite) {
        super(id, nom, email);
        this.specialite = specialite;
    }

    @Override
    public String getType() {
        return "Enseignant";
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}