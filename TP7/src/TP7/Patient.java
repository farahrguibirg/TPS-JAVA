package TP7;

public class Patient extends Personne {
 private int idPatient;
	public Patient(String nom,int age,int idPatient) throws AgeInvalideException {
		super(nom,age);
		this.idPatient=idPatient;
	}

    public Patient(Patient autre) throws AgeInvalideException {
        super(autre.nom, autre.age);
        this.idPatient = autre.idPatient;
    }

	@Override
	public String getRole() {
		return "Patient";
	}
public int getId() {
	return idPatient;
	
}
public void setid(int id) {
	this.idPatient=id;
}
public String getNom() {
	return nom;
}
public int getAge() {
	return age;
}

public void afficher() {
	System.out.println("le nom est :" + nom +"l'age est :"+age +"id de patient est :"+ idPatient);
	
}


}
