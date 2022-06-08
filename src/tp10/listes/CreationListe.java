package tp10.listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list.size());

    }

}
