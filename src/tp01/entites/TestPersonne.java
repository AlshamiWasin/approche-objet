package tp01.entites;

import tp01.entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Al shami";
        personne1.prenom = "waseem";
        personne1.adressePostale.codePostal = 56000;
        personne1.adressePostale.ville = "Vannes";
        personne1.adressePostale.LibelleRue = "Place Bougainville";
        personne1.adressePostale.numeroRue = 1;
    }


}
