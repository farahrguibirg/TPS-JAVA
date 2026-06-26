package TP4;
public class MainEmploye {
    public static void main(String[] args) {
        Employe[] employes = {
            new EmployeHoraire("Ali", 30, 160, 15, 200),
            new EmployeFixe("Sara", 40, 3000, 500),
            new EmployeHoraire("Youssef", 25, 120, 20, 100)
        };

        double total = 0;
        for(Employe e : employes){
            e.afficherInfos();
            total += e.calculerSalaire();
        }

        System.out.println("Salaire total : " + total);

        System.out.println("Employés avec salaire > 2000 :");
        for(Employe e : employes){
            if(e.calculerSalaire() > 2000)
                e.afficherInfos();
        }
    }
}