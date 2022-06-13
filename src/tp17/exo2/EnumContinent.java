package tp17.exo2;

import tp17.exo1.Saison;

public enum EnumContinent {

    Europe(new Continent("Europe")),
    Afrique(new Continent("Afrique")),
    Asie(new Continent("Asie")),
    Amerique(new Continent("Amerique")),
    Oceanie(new Continent("Oceanie"));

    public Continent continent;

    EnumContinent(Continent continent) {
        this.continent = continent;
    }

}
