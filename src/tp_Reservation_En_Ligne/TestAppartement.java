package tp_Reservation_En_Ligne;

import java.util.ArrayList;

public class TestAppartement {

    public static void main(String[] args) {

        ArrayList<Appartement> listAppartement = new ArrayList<>();

        Appartement appartement1 = new Appartement( " adresse 1 " , 10 , 1 , "1");

        listAppartement.add(appartement1);
        listAppartement.add(new Appartement( " adresse 2 " , 20 , 2 , "2"));
        listAppartement.add(new Appartement( " adresse 3 " , 30 , 3 , "3"));
        listAppartement.add(new Appartement( " adresse 4 " , 40 , 4 , "4"));
        listAppartement.add(new Appartement( " adresse 5 " , 50 , 5 , "5"));


        appartement1.reserverAppartement(10);
        appartement1.reserverAppartement(1);
        appartement1.reserverAppartement(1);
        /*appartement1.libererApparement();*/

        System.out.println("non reserved apartments");

        for (Appartement appartement : listAppartement) {
            if (appartement.reserver == false){
                System.out.println(appartement.toString());
            }
        }

        System.out.println("reserved apartments");

        for (Appartement appartement : listAppartement) {
            if (appartement.reserver == true){
                System.out.println(appartement.toString());
            }
        }


    }

}
