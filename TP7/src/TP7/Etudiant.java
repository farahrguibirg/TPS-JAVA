package TP7;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Utilisateur {
    private String niveau;
    private List<Cours> coursInscrits;

    public Etudiant(String id, String nom, String email, String niveau) {
        super(id, nom, email);
        this.niveau = niveau;
        this.coursInscrits = new ArrayList<>();
    }

    @Override
    public String getType() {
        return "Etudiant";
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public List<Cours> getCoursInscrits() {
        return coursInscrits;
    }

    public void inscrireCours(Cours cours) throws InscriptionException {
        if (coursInscrits.contains(cours)) {
            throw new InscriptionException("L'étudiant est déjà inscrit à ce cours");
        }
        coursInscrits.add(cours);
    }
}