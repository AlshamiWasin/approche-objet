package tp10.exo3.listes;

import java.util.*;

public class TestListeInt {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);

        System.out.println("size : " + list.size());

        System.out.println("biggest : " +(Collections.max(list)));

        System.out.println("smallest : " +(Collections.min(list)));

        System.out.println(list);

        for (Integer integer : list) {
            if (integer < 0){
                list.set(list.indexOf(integer), Math.abs(integer) );
            }
        }

/*        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext()){
            Integer number = iter.next();
            if (number < 0){
                System.out.println(list.indexOf(number));
                System.out.println(Math.abs(number));
                list.set(list.indexOf(number), Math.abs(number) );
            }
        }*/

        System.out.println(list);

    }
}
