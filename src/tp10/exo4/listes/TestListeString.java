package tp10.exo4.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {




    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Nice");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");
        list.add("Carcassonne");

        Iterator<String> iter = list.iterator();

        String word = "";

        while(iter.hasNext()){

            String str = iter.next();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)))
                    count++;
            }

            if (word.length() < count){
                word =str;
            }
        }

        System.out.println(word);

        Iterator<String> iter2 = list.iterator();

        while(iter2.hasNext()){

            String str = iter2.next();
            str = str.toUpperCase();

        }

        System.out.println(list);

        Iterator<String> iter3 = list.iterator();

        while(iter3.hasNext()){
            String str = iter3.next();
            if (str.charAt(0) == 'N'){
                iter3.remove();
            }
        }

        System.out.println(list);
    }
}
