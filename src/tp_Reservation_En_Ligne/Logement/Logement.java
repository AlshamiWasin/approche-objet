package tp_Reservation_En_Ligne.Logement;

public abstract class Logement {

    String adresse;
    Integer prixParNuit;
    Integer capaciteMax;
    boolean reserver = false ;


    public Logement(String adresse, Integer prixParNuit, Integer capaciteMax) {
        this.adresse = adresse;
        this.prixParNuit = prixParNuit;
        this.capaciteMax = capaciteMax;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getPrixParNuit() {
        return prixParNuit;
    }

    public void setPrixParNuit(Integer prixParNuit) {
        this.prixParNuit = prixParNuit;
    }

    public Integer getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(Integer capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public boolean isReserver() {
        return reserver;
    }

    public void setReserver(boolean reserver) {
        this.reserver = reserver;
    }

}
