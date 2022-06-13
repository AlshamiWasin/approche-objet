package tp_Reservation_En_Ligne.service;


import tp_Reservation_En_Ligne.Logement.Logement;
import tp_Reservation_En_Ligne.exception.AlreadyReservedBusinessException;
import tp_Reservation_En_Ligne.exception.SurcapaciteBusinessException;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    public void reserver(Logement logement, int nombreDePersonne) throws AlreadyReservedBusinessException, SurcapaciteBusinessException {
        if (logement.isReserver()) {
            throw new AlreadyReservedBusinessException("Le logement " + logement + " est déjà réservé");
        }
        if (nombreDePersonne > logement.getCapaciteMax()) {
            throw new SurcapaciteBusinessException("Le logement " + logement + " n'as pas assez de place");
        }
        logement.setReserver(true);
    }

    public void liberer(Logement logement) {
        logement.setReserver(false);
    }





}
