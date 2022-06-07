package tp09_facile;

import java.util.ArrayList;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ArrayList<ObjetGeometrique > list = new ArrayList<>(2);
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle( 3 ,3 );

        list.add(cercle);
        list.add(rectangle);

        for (ObjetGeometrique objet: list){
            System.out.println(objet);
            System.out.println(objet.perimetre());
            System.out.println(objet.surface());
        }

    }
}
