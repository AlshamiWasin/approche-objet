package tp17.exo1;

public enum EnumSaison {

    PRINTEMPS(new Saison("PRINTEMPS",0)),

    ETE(new Saison("ETE",1)),

    AUTOMNE(new Saison("AUTOMNE",2)),

    HIVER(new Saison("HIVER",3));

    public Saison saison;
    EnumSaison(Saison saison) {
        this.saison = saison;
    };

    public static Saison findSaison (String nomDeSaison){
        for (EnumSaison value : EnumSaison.values()) {
            if (value.saison.libelle.equals(nomDeSaison)){
                return value.saison;
            }
        }
        return null;
    };


}

