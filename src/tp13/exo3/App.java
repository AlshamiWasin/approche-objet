package tp13.exo3;


import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList<Ville> list = new ArrayList<>();

        list.add(new Ville("Vannes" , 100));
        list.add(new Ville("Rennes" , 1000));
        list.add(new Ville("Test" , 10));

        System.out.println(list);

        Collections.sort(list , new ComparatorHabitant());

        System.out.println(list);

        Collections.sort(list , new ComparatorNom());

        System.out.println(list);
    }

}
