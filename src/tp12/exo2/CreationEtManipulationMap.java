package tp12.exo2;

import java.util.HashMap;

public class CreationEtManipulationMap {

    public static void main(String args[]) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        //TODO Développements à réaliser ci-dessous

        mapVilles.put(1, "Lille");
        mapVilles.put(2, "lyon");
        mapVilles.put(3, "Bordeaux");

        for (Integer integer : mapVilles.keySet()) {
            System.out.println(integer);
        }

        for (String string : mapVilles.values()) {
            System.out.println(string);
        }

        System.out.println(mapVilles.size());

    }


}
