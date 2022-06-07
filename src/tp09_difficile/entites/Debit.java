package tp09_difficile.entites;

import java.util.Date;

public class Debit extends Operation {


    public Debit(Date date, int montant, Compte compte) {
        super(date, montant, compte);
    }

    @Override
    public String getType() {
        return "Debit";
    }
}
