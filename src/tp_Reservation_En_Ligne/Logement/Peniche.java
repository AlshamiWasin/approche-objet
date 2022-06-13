package tp_Reservation_En_Ligne.Logement;

public class Peniche extends Logement{

    long longueur;


    public Peniche(String adresse, Integer prixParNuit, Integer capaciteMax, long longueur) {
        super(adresse, prixParNuit, capaciteMax);
        this.longueur = longueur;
    }

    public long getLongueur() {
        return longueur;
    }

    public void setLongueur(long longueur) {
        this.longueur = longueur;
    }
}
