package tp10.exo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VilleArrayTest {

    public static void main(String[] args) {

        List<Ville> listVille = new ArrayList<>();

        listVille.add(new Ville("Nice" ,343000 ));
        listVille.add(new Ville("Carcassonne", 47800) );
        listVille.add(new Ville("Narbonne", 53400 ));
        listVille.add(new Ville("Lyon", 484000 ));
        listVille.add(new Ville("Foix", 9700 ));
        listVille.add(new Ville("Pau", 77200) );
        listVille.add(new Ville("Marseille", 850700) );
        listVille.add(new Ville("Tarbes", 40600) );

        Iterator<Ville> iter = listVille.iterator();

        Ville villePlusPeuplee = null;

        if (iter.hasNext()){
            villePlusPeuplee = iter.next();
        }

        while(iter.hasNext()){
            Ville ville = iter.next();
            if (villePlusPeuplee.nbrHabitants < ville.nbrHabitants){
                villePlusPeuplee =ville;
            }
        }

        System.out.println( "la ville la plus peuplée : "+ villePlusPeuplee.nom);

        Iterator<Ville> iter2 = listVille.iterator();

        Ville villeMoinsPeuplee = null;

        if (iter2.hasNext()){
            villeMoinsPeuplee = iter2.next();
        }

        while(iter2.hasNext()){
            Ville ville = iter2.next();
            if (villeMoinsPeuplee.nbrHabitants > ville.nbrHabitants){
                villeMoinsPeuplee =ville;
                iter2.remove();
            }
        }
        System.out.println( "la ville la moins peuplée : "+ villeMoinsPeuplee.nom);


        for (Ville ville : listVille) {
            System.out.println(ville.nom);
        }


        Iterator<Ville> iter3 = listVille.iterator();

        List<Ville> listVilleModifier = new ArrayList<>();

        while(iter3.hasNext()){
            Ville ville = iter3.next();
            if (ville.nbrHabitants > 100000){
                iter3.remove();
                listVilleModifier.add(new Ville(ville.nom.toUpperCase(), ville.nbrHabitants ));
            }
        }

        listVille.addAll(listVilleModifier);

        System.out.println(" les villes de plus de 100 000 habitants en mettant leur nom en majuscules ");

        for (Ville ville : listVille) {
            System.out.println(ville.nom);
        }

        System.out.println(Collections.max(listVille));
        System.out.println(Collections.min(listVille));

    }
}
