package tp12.exo5;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

    public static void main(String[] args) {


        ArrayList<Pays> listPays = new ArrayList<>();

        listPays.add( new Pays( "France",65 , "Europe"));
        listPays.add( new Pays( "Allemagne",80 , "Europe"));
        listPays.add( new Pays( "Belgique",10 , "Europe"));
        listPays.add( new Pays( "Russie",150 , "Asie"));

        HashMap<String,Integer> map = new HashMap<>();

        for (Pays pay : listPays) {
            if (map.containsKey(pay.continent)){
                map.put(pay.continent , map.get(pay.continent)+1);
            }else {
                map.put(pay.continent , 1);
            }
        }

        System.out.println(map);


    }

}
