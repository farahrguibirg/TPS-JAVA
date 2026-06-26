package TP7;
import java.util.ArrayList;

public class CliniqueService {
    private ArrayList<Patient> patients=new ArrayList<>();
    private ArrayList<Consultation> consultations=new ArrayList<>();

   
    public void ajouterPatient(Patient p) throws AgeInvalideException {
        patients.add(new Patient(p)); 
    }

    public void ajouterConsultation(Consultation c) throws AgeInvalideException {
        consultations.add(new Consultation(c)); 
    }

    public void afficherConsultations() {
        if (consultations.isEmpty()) {
            System.out.println("Aucune consultation enregistrée.");
            return;
        }

        for (Consultation c : consultations) {
            System.out.println("Date : " + c.getDate() 
                               + ", Patient : " + c.getPatient().getNom() 
                               + ", Médecin : " + c.getMedecin().getNom());}}
    public ArrayList<Patient> getPatients() {
        return patients;
    }
    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }
}
