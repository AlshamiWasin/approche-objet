package tp12.exo4;

import java.util.HashMap;

public class MapVilles {

    public static void main(String[] args) {

        HashMap<String, Ville> map = new HashMap<String, Ville>();


        map.put("Vannes" ,new Ville("Vannes" , 100));
        map.put("Rennes" ,new Ville("Rennes" , 1000));
        map.put("test" ,new Ville("test" , 10));

        Ville ville = null;

        for (String s : map.keySet()) {

            if (ville == null){
                ville = map.get(s);
            }

            if (ville.nbrHabitants > map.get(s).nbrHabitants){
                ville = map.get(s);
            }

        }

        map.remove(ville.nom);

        System.out.println(map);


    }

}
