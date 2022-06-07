package tp09_difficile;

import tp08.fr.diginamic.banque.entites.Credit;
import tp08.fr.diginamic.banque.entites.Debit;
import tp08.fr.diginamic.banque.entites.Operation;

import java.util.ArrayList;

public class TestOperation {

    public static void main(String[] args) {

        int montantTotal = 0;

        ArrayList<Operation> operationsList = new ArrayList<>();

        Credit credit1 = new Credit("10/01/1999" , 50);
        Credit credit2 = new Credit("10/02/1999" , 1545);

        Debit debit1 = new Debit("10/01/1999" , 100);
        Debit debit2 = new Debit("10/02/1999" , 244);

        operationsList.add(credit1);
        operationsList.add(credit2);
        operationsList.add(debit1);
        operationsList.add(debit2);

        for (Operation e : operationsList   ) {
            System.out.println(e.toString());
            System.out.println(e.getType());

            if (e.getType() == "Credit"){
                montantTotal += e.getMontant();
            }else if (e.getType() == "Debit"){
                montantTotal -= e.getMontant();
            }
        }
        System.out.println(montantTotal);
    }
}
