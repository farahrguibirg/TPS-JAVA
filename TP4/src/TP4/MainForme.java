package TP4;

import java.util.Arrays;
import java.util.Comparator;

public class MainForme {
    public static void main(String[] args) {
	        Forme[] formes = {
	            new Cercle(5, "Rouge"),
	            new Rectangle(4, 6, "Bleu"),
	            new Triangle(3, 4, 5)
	        };

	        for(Forme f : formes){
	            f.afficherInfos();
	            System.out.println();
	        }

	        Arrays.sort(formes, Comparator.comparingDouble(Forme::aire));

	        System.out.println("Après tri par aire :");
	        for(Forme f : formes){
	            f.afficherInfos();
	            System.out.println();
	        }
	    }
	}
