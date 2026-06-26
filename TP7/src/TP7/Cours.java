package TP7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cours implements Evaluable {
    private String code;
    private String titre;
    private Enseignant enseignant;
    private List<Etudiant> etudiantsInscrits;
    private Map<String, Double> notes;

    public Cours(String code, String titre, Enseignant enseignant) {
        this.code = code;
        this.titre = titre;
        this.enseignant = enseignant;
        this.etudiantsInscrits = new ArrayList<>();
        this.notes = new HashMap<>();
    }

    @Override
    public double calculerNoteFinale() {
        if (notes.isEmpty()) {
            return 0.0;
        }
        double somme = 0;
        for (Double note : notes.values()) {
            somme += note;
        }
        return somme / notes.size();
    }

    public void ajouterNote(String etudiantId, double note) {
        notes.put(etudiantId, note);
    }

    public void inscrireEtudiant(Etudiant etudiant) {
        if (!etudiantsInscrits.contains(etudiant)) {
            etudiantsInscrits.add(etudiant);
        }
    }

    public String getCode() {
        return code;
    }

    public String getTitre() {
        return titre;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public List<Etudiant> getEtudiantsInscrits() {
        return etudiantsInscrits;
    }

    public Map<String, Double> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cours cours = (Cours) obj;
        return code.equals(cours.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}