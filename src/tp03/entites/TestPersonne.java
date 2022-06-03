package tp03.entites;


import tp03.entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {



        AdressePostale adresse = new AdressePostale(1,56000,"place bougainville" , "Vannes");

        Personne personne = new Personne("Al shami","Waseem" ,adresse);

        AdressePostale newAdresse = new AdressePostale(2,56000,"place bougainville" , "Vannes");


        personne.afficherNomPrenom();

        System.out.println(personne.adressePostale.numeroRue);

        personne.changerAdresse(newAdresse);

        System.out.println(personne.adressePostale.numeroRue);
    }


}
