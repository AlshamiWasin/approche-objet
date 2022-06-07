package tp09_difficile.entites;

public class CompteTaux extends Compte {

    int tauxRemuneration;

    public CompteTaux(int numeroCompte, int soldeCompte , int tauxRemuneration) {
        super(numeroCompte, soldeCompte);
    }

    public int getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(int tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "tauxRemuneration=" + tauxRemuneration +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}
