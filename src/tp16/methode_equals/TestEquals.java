package tp16.methode_equals;

public class TestEquals {

    public static void main(String[] args) {

        Ville ville1 = new Ville("vannes" , 100);
        Ville ville2 = new Ville("rennes" , 150);

        System.out.println(ville1.equals(ville2));
    }



}
