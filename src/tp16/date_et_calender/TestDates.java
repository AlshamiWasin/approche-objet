package tp16.date_et_calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formateurSansHeure = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat formateurAvecHeure = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date1 = new Date();
        String chaine1 = formateurSansHeure.format(date1);

        System.out.println(chaine1);

        Date date2 = new Date("19/05/2016 23:59:30");
        String chaine2 = formateurAvecHeure.format(date2);

        System.out.println(chaine2);

    }

}
