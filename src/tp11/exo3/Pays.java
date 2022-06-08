package tp11.exo3;

public class Pays {

    private String nom;
    private int nbrHabitants;
    private double pibParHabitant;

    public Pays(String nom, int nbrHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbrHabitants = nbrHabitants;
        this.pibParHabitant = pibParHabitant;
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

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public void setPibParHabitant(double pibParHabitant) {
        this.pibParHabitant = pibParHabitant;
    }
}
