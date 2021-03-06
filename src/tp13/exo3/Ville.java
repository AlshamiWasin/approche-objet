package tp13.exo3;

public class Ville {

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
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbrHabitants=" + nbrHabitants +
                '}';
    }
}
