package TP7;

public abstract class Utilisateur {
    protected String id;
    protected String nom;
    protected String email;

    public Utilisateur(String id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    public abstract String getType();
    public void afficherProfil() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Email: " + email);
        System.out.println("Type: " + getType());
    }
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}