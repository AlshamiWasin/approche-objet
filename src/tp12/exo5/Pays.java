package tp12.exo5;

public class Pays {

    String nom;
    int nbrHabitants;
    String continent;

    public Pays(String nom, int nbrHabitants, String continent) {
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

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
