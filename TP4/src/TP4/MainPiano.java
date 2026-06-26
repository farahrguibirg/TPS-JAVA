package TP4;


public class MainPiano {
 public static void main(String[] args) {
     Jouable[] jouables = { new Guitare(), new Piano(), new Violon() };
     Accordable[] accordables = { new Guitare(), new Violon() };

     System.out.println("Jouer tous les instruments :");
     for(Jouable j : jouables) j.jouer();

     System.out.println("Accorder ceux qui sont accordables :");
     for(Jouable j : jouables) {
         if(j instanceof Accordable)
             ((Accordable) j).accorder();
     }
 }
}
