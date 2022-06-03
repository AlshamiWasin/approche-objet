package tp02.entites;


import tp02.entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {



        AdressePostale adresse = new AdressePostale(1,56000,"place bougainville" , "Vannes");

        Personne personne1 = new Personne("Al shami","Waseem");
        Personne personne2 = new Personne("Al shami","Waseem",adresse);


    }


}
