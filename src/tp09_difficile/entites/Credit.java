package tp09_difficile.entites;

import java.time.LocalDate;
import java.util.Date;

public class Credit extends Operation {


    public Credit(Date date, int montant, Compte compte) {
        super(date, montant, compte);
    }

    @Override
    public String getType() {
        return "Credit";
    }
}
