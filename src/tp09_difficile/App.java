package tp09_difficile;

import tp09_difficile.entites.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App{

    static CompteDaoMem compteDaoMem = new CompteDaoMem();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Compte compte1 = new Compte(1, 100);
        Compte compte2 = new Compte(2, 1000);
        compteDaoMem.sauvegarder(compte1);
        compteDaoMem.sauvegarder(compte2);


        int input;
        do {
            menu();
            input = scanner.nextInt();
            getResponse(input);
        }while (input != 99);
    }

    public static void getResponse(int input){
        switch (input){
            case 1:
                System.out.println("Liste des comptes ");
                afficherList();
                break;
            case 2:
                System.out.println("Ajout d’un nouveau compte");
                ajouterCompte();
                break;
            case 3:
                System.out.println("Ajout d’une opération à un compte ");
                ajoouterOperation();
                break;
            case 4:
                System.out.println("Suppression d’un compte");
                supprimerCompte();
                break;
            case 99:
                System.out.println("Aurevoir ☹");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    public static void afficherList(){

        if (!compteDaoMem.lister().isEmpty()){
            for (Compte compte : compteDaoMem.lister() ) {
                if ( compte instanceof CompteTaux ){
                    System.out.println("Numero: " + compte.numeroCompte +" - "  +" Solde: " +compte.soldeCompte + " €" + ((CompteTaux) compte).getTauxRemuneration());
                }else {
                    System.out.println("Numero: " + compte.numeroCompte +" - "  +" Solde: " +compte.soldeCompte + " €" );
                }

            }
        }else {
            System.out.println(" il n'y a pas des comptes");
        }
    }

    public static void ajouterCompte(){
            System.out.println();
            System.out.println("Veuillez saisir le numéro :");
            int numero = scanner.nextInt();
            System.out.println("Veuillez saisir le solde initial: ");
            int solde = scanner.nextInt();
            System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
            while (true){
                if (scanner.nextInt() == 1){
                    compteDaoMem.sauvegarder(new Compte(numero,solde));
                    break;
                }else if (scanner.nextInt() == 2){
                    System.out.println("Veuillez saisir le taux :");
                    int taux = scanner.nextInt();
                    compteDaoMem.sauvegarder(new CompteTaux(numero,solde,taux));
                    break;
                }else {
                    System.out.println("Type non difini:");
                }
            }
    }

    public static void supprimerCompte(){
        while (true){
            afficherList();
            System.out.println("");
            System.out.println("Veuillez choisir le numéro de compte concerné :");
            String input = scanner.next();

            if (compteDaoMem.existe(input)){
                if (compteDaoMem.supprimer(input) == true ){
                    compteDaoMem.supprimer(input);
                    System.out.println("Compte Supprimer");
                    break;
                }
            }
            System.out.println("numero invalide");

        }
    }


    public static void ajoouterOperation(){

        while (true){
            afficherList();
            System.out.println("");
            System.out.println("Veuillez choisir le numéro de compte concerné :");
            String input = scanner.next();

            if (compteDaoMem.existe(input)){

                Compte compte = compteDaoMem.getCompte(input);
                System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT): ");
                int type = scanner.nextInt();
                if (type == 1){
                    System.out.println("Veuillez saisir le montant :");
                    int montant = scanner.nextInt();
                    addCredit(montant,compte);
                    System.out.println("On a ajouter " + montant + " a le compte de numer :" + compte.numeroCompte);
                    break;
                }else if (type==2 ){
                    System.out.println("Veuillez saisir le montant :");
                    int montant = scanner.nextInt();
                    addDebit(montant,compte);
                    System.out.println("On a ajouter " + montant + " a le compte de numer :" + compte.numeroCompte);
                    break;
                }else {
                    System.out.println("saisir invalide");
                }
            }
            System.out.println("numero invalide");

        }
    }

    public static void addCredit(int montant, Compte compte){
        Credit credit = new Credit(new Date() , montant , compte);
    }

    public static void addDebit(int montant, Compte compte){
        Debit credit = new Debit(new Date() , montant , compte);
    }



    public static void menu(){
        System.out.println();
        System.out.println("***** Administration des comptes ***** ");
        System.out.println("1. Lister les comptes ");
        System.out.println("2. Ajouter un nouveau compte ");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir ");
    };

}
