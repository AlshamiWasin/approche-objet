package tp08.fr.diginamic.banque;


import tp06.fr.diginamic.banque.entites.Compte;

public class soldeCompte {

    public static void main(String[] args) {

        Compte compte = new Compte(1 , 100);

        System.out.println(compte.toString());

    }

}
