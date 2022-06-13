package tp16.stringbuilder.chaines;

public class TestStringBuilder {


    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        long debut = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            builder.append(i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));


        String string = "";

        long debut2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            string += i;
        }

        long fin2 = System.currentTimeMillis();



        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));





    }
}
