package tp10.exo5;

public class Ville implements Comparable<Ville>{

    String nom;
    Integer nbrHabitants;


    public Ville(String nom, Integer nbrHabitants) {
        this.nom = nom;
        this.nbrHabitants = nbrHabitants;
    }

    public Integer getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(Integer nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int compareTo(Ville ville) {
        return Integer.compare(this.nbrHabitants , ville.nbrHabitants);
    }
}
