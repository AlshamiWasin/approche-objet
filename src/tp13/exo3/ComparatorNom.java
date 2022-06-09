package tp13.exo3;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        if ( o1.getNom().charAt(0) > o2.getNom().charAt(0) ){
            return 1;
        } else if (o1.getNom().charAt(0)< o2.getNom().charAt(0)) {
            return -1;
        }
        return 0;
    }
}
