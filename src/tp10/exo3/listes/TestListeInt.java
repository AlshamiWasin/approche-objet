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

        for (Object o : list) {
            System.out.println("list object : " + o);
        }

        System.out.println("size : " + list.size());

        Collections.sort(list);

        System.out.println("biggest : " +list.get(list.size() - 1));

        System.out.println("smallest : " +list.get(0));

        Iterator<Integer> iter = list.iterator();
        List<Integer> modifiedlist = new ArrayList<>();

        while(iter.hasNext()){
            Integer number = iter.next();
            if (number < 0){
                iter.remove();
                modifiedlist.add( Math.abs(number) );
            }
        }
        list.addAll(modifiedlist);
        Collections.sort(list);

        System.out.println(list);

    }
}
