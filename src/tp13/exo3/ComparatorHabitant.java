package tp13.exo3;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        if ( o1.nbrHabitants > o2.nbrHabitants ){
            return 1;
        } else if (o1.nbrHabitants< o2.nbrHabitants) {
            return -1;
        }
        return 0;

    }
}
