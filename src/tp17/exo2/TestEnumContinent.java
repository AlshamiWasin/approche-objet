package tp17.exo2;

import java.util.ArrayList;

public class TestEnumContinent {

    public static void main(String[] args) {

        ArrayList<Ville> listVilles = new ArrayList<>();

        listVilles.add(new Ville("vannes" , 10 , EnumContinent.Europe.continent));
        listVilles.add(new Ville("paris" , 10 , EnumContinent.Europe.continent));
        listVilles.add(new Ville("rennes" , 10 , EnumContinent.Europe.continent));
        listVilles.add(new Ville("nantes" , 10 , EnumContinent.Europe.continent));


        for (Ville ville : listVilles) {
            System.out.println(ville.toString());
        }


    }

}
