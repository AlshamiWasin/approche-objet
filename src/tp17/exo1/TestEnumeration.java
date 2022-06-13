package tp17.exo1;

public class TestEnumeration {

    public static void main(String[] args) {

        EnumSaison[] list = EnumSaison.values();

        for (EnumSaison enumSaison : list) {
            System.out.println(enumSaison.saison.libelle);
            System.out.println(enumSaison.saison.nbrOrdre);
        }

        String nom = "ETE";
        System.out.println(EnumSaison.valueOf(nom));

        String nom2 = "Hiver";
        System.out.println(EnumSaison.findSaison(nom2.toUpperCase()));


    }

}
