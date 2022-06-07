package tp07.fr.diginamic.banque;

import tp07.fr.diginamic.banque.entites.Compte;
import tp07.fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque  {

    public static void main(String[] args) {

        Compte compte1 = new Compte(0,100);
        CompteTaux compte2 = new CompteTaux(1,100 , 1);

        ArrayList<Compte> comptesList = new ArrayList<Compte>(2);
        comptesList.add(compte1);
        comptesList.add(compte2);

        for (Compte e:   comptesList ) {
            System.out.println(e.toString());
        }

    }
}
