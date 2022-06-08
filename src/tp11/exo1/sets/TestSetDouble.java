package tp11.exo1.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {


    public static void main(String[] args) {
        HashSet<Double> list = new HashSet<>();
        list.add(0.01);
        list.add(48.5);
        list.add(-12.45);
        list.add(13.3);
        list.add(-7.32);
        list.add(8.25);
        list.add(1.5);

        System.out.println(list);
        System.out.println(Collections.max(list));
        list.remove(Collections.min(list));
        System.out.println(list);

    }

}
