package TP7;

public class Medecin extends Personne{
private String specialite;
	public Medecin(String nom,int age,String specialite) throws AgeInvalideException {
		super(nom,age);
		this.specialite=specialite;
		
	}
    public Medecin(Medecin autre) throws AgeInvalideException {
        super(autre.nom, autre.age);
        this.specialite = autre.specialite;
    }
	@Override
	public String getRole() {
		return "Medecin";

}
public String getNom() {return nom;}
public void afficher() {
	System.out.println("le nom est :"+nom+"l'age est : "+age+"specialite est :"+specialite);
}
}