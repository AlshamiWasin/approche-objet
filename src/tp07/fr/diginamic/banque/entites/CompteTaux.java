package tp07.fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    int tauxRemuneration;

    public CompteTaux(int numeroCompte, int soldeCompte , int tauxRemuneration) {
        super(numeroCompte, soldeCompte);
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
