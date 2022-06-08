package tp11.exo2.sets;

import java.util.HashSet;

public class TestSetString {

    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("USA");
        list.add("France");
        list.add("Allemagne");
        list.add("UK");
        list.add("Italie");
        list.add("Japon");
        list.add("Chine");
        list.add("Russie");
        list.add("Inde");

        String payPlusLettre ="";

        for (String s : list) {
            if (payPlusLettre.length() < s.length()){
                payPlusLettre = s;
            }
        }


        list.remove(payPlusLettre);

        System.out.println(list);

    }

}
