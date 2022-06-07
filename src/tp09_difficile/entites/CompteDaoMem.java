package tp09_difficile.entites;

import tp09_difficile.entites.Compte;
import tp09_difficile.entites.CompteDao;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CompteDaoMem implements CompteDao {

    static ArrayList<Compte> comptelist = new ArrayList<>();

    @Override
    public  ArrayList<Compte> lister() {
        return comptelist;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        comptelist.add(nvCompte);
    }

    @Override
    public boolean supprimer(String numero) {

        for (Compte compte: comptelist) {
            if (compte.numeroCompte == parseInt(numero)) {
                comptelist.remove(compte);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String numero) {

       for (Compte compte: comptelist) {
            if (parseInt(numero) == compte.numeroCompte){
                return true;
            }
        }
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        for (Compte compte: comptelist) {
            if (compte.numeroCompte == parseInt(numero)){
                return compte;
            }
        }
        return null;
    }


}
