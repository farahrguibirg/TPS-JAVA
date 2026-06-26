package TP7;

public abstract class Personne {
 protected String nom ;
 protected int age;
	public Personne(String nom,int age)throws AgeInvalideException {
		if(age<0 || age >120) { throw new AgeInvalideException("Invalide veuillez saisir un age positif et inferieure a 120");}
		this.nom=nom;
		this.age=age;
	}
	 public abstract String getRole();
	 
	 @Override
	 public String toString() {
	     return "Le nom est : " + nom + ", l'âge est : " + age;
	 }


}
