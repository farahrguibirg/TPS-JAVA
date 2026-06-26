package TP7;

import java.time.LocalDate;

public class Consultation {
private Patient patient;
private Medecin medecin;
private LocalDate date;

    public Consultation(Patient patient, Medecin medecin ,LocalDate date) throws AgeInvalideException {
        this.patient = new Patient(patient); 
        this.medecin= new Medecin(medecin);
        this.date = date;}
    public Consultation(Consultation autre) throws AgeInvalideException {
        this.patient = new Patient(autre.patient);
        this.medecin = new Medecin(autre.medecin);
        this.date = autre.date;}
    public void afficher() {
        System.out.println("Consultation du " + date + " : " 
                           + patient.getNom() + " avec " + medecin.getNom());}
	public Patient getPatient() {
		return patient;}
	public void setPatient(Patient patient) {
		this.patient = patient;}
	public Medecin getMedecin() {
		return medecin;}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}

