package tp_Reservation_En_Ligne;

import tp_Reservation_En_Ligne.Logement.Appartement;
import tp_Reservation_En_Ligne.Logement.Logement;
import tp_Reservation_En_Ligne.Logement.Maison;
import tp_Reservation_En_Ligne.Logement.Peniche;
import tp_Reservation_En_Ligne.exception.AlreadyReservedBusinessException;
import tp_Reservation_En_Ligne.exception.SurcapaciteBusinessException;
import tp_Reservation_En_Ligne.service.ReservationService;

import java.util.ArrayList;
import java.util.List;

public class TestAppartement {

    static ArrayList<Logement> listLogement = new ArrayList<>();
    static ReservationService reservationService = new ReservationService();

    public static void main(String[] args) throws AlreadyReservedBusinessException, SurcapaciteBusinessException {

        initData();

        /*appartement1.libererApparement();*/

        System.out.println("non reserved apartments");

        System.out.println(listerAppartementsDisponibles());


        reservationService.reserver(listLogement.get(0), 1);

        System.out.println(listerAppartementsNonDisponibles());

    }


    private static void initData() {

        Appartement appartement = new Appartement( " adresse 1 " , 10 , 1 , "1");
        Maison maison = new Maison( " adresse 1 " , 10 , 1 , true);
        Peniche peniche = new Peniche(" adresse 1 " , 10 , 1 , 100);

        listLogement.add(appartement);
        listLogement.add(maison);
        listLogement.add(peniche);


    }


    public static List<Logement> listerAppartementsDisponibles() {
        List<Logement> appartementsDisponibles = new ArrayList<>();

        for (Logement appartement : listLogement) {
            if (!appartement.isReserver()) {
                appartementsDisponibles.add(appartement);
            }
        }

        return appartementsDisponibles;
    }

    public static List<Logement> listerAppartementsNonDisponibles() {
        List<Logement> appartementsNonDisponibles = new ArrayList<>();
        for (Logement appartement : listLogement) {
            if (appartement.isReserver()) {
                appartementsNonDisponibles.add(appartement);
            }
        }
        return appartementsNonDisponibles;
    }


}
