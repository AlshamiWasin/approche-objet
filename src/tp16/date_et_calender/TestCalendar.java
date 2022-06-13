package tp16.date_et_calender;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {


        Locale france = Locale.FRANCE;
        Locale china = Locale.CHINA;
        Locale germany = Locale.GERMANY;
        Locale us = Locale.US;

        Locale locale = us;

        SimpleDateFormat formateurSansHeure = new SimpleDateFormat("EEEEE MMMMM" ,locale);

        SimpleDateFormat formateurAvecHeure = new SimpleDateFormat("EEEEE MMMMM HH:mm:ss",locale);


        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date date = cal.getTime();
        String chaine1 = formateurSansHeure.format(date);
        String chaine2 = formateurAvecHeure.format(date);

        System.out.println(chaine1);
        System.out.println(chaine2);


    }

}
