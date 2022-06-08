package tp11.exo3;

import java.util.HashSet;

public class PaysTest {


    public static void main(String[] args) {

        HashSet<Pays> list = new HashSet<>();

        list.add(new Pays("usa" , 1 , 100));
        list.add(new Pays("France" , 2 , 200));
        list.add(new Pays("Allemagne" , 3 , 300));
        list.add(new Pays("UK" , 4, 400));
        list.add(new Pays("Italie" , 5 , 500));
        list.add(new Pays("Japon" , 6 , 600));
        list.add(new Pays("Chine" , 7 , 700));
        list.add(new Pays("Russie" , 8 , 800));
        list.add(new Pays("Inde" , 9 , 900));

        Pays payPIBPlusImportant = null;

        for (Pays pays : list) {
            if (payPIBPlusImportant==null){
                payPIBPlusImportant = pays;
            }
            if (payPIBPlusImportant.getPibParHabitant() < pays.getPibParHabitant()){
                payPIBPlusImportant = pays;
            }
        }

        System.out.println(payPIBPlusImportant.getNom());

    }

}
