package tp17.exo2;

public class Ville {

    String nom;
    Integer nbrHabitants;

    Continent continent;

    public Ville(String nom, Integer nbrHabitants, Continent continent) {
        this.nom = nom;
        this.nbrHabitants = nbrHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(Integer nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbrHabitants=" + nbrHabitants +
                ", continent=" + continent.libeller +
                '}';
    }
}
