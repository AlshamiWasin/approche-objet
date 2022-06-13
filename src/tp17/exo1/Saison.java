package tp17.exo1;


public class Saison {

    String libelle;
    int nbrOrdre;

    public Saison(String libelle, int nbrOrdre) {
        this.libelle = libelle;
        this.nbrOrdre = nbrOrdre;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbrOrdre() {
        return nbrOrdre;
    }

    public void setNbrOrdre(int nbrOrdre) {
        this.nbrOrdre = nbrOrdre;
    }


}
