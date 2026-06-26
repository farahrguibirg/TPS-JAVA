package TP3;

import java.time.LocalDate;

public class Cadre extends Employe {
	
private int indice;

	public Cadre(String Matricule,String Nom,String Prenom,LocalDate DateN,int indice) {
		super(Matricule,Nom,Prenom,DateN);
		this.indice=indice;
	}
	public int getIndice() {return indice;}
	public void setIndice(int indice) {this.indice=indice;}
	 @Override
	 public double getSalaire() {
		 switch(indice) {
		 case 1:return 13000;
		 case 2:return 15000;
		 case 3 :return 17000;
		 case 4 :return 20000;
		 default : return 0;
		 }
		 }
	 }

