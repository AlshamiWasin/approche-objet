package tp_Reservation_En_Ligne.Logement;

public class Appartement extends Logement {

    String etage;

    public Appartement(String adresse, Integer prixParNuit, Integer capaciteMax, String etage) {
        super(adresse, prixParNuit, capaciteMax);
        this.etage = etage;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }


    @Override
    public String toString() {

        if (this.reserver == true){
            return "Appartement{" +
                    "adresse='" + adresse + '\'' +
                    ", PrixParNuit=" + prixParNuit +
                    ", nbrMaxPersonnes=" + capaciteMax +
                    ", etage='" + etage + '\'' +
                    ", reserver=" + reserver +
                    '}';
        }else {
            return "Appartement{" +
                    "adresse='" + adresse + '\'' +
                    ", PrixParNuit=" + prixParNuit +
                    ", nbrMaxPersonnes=" + capaciteMax +
                    ", etage='" + etage + '\'' +
                    '}';
        }
    }
}
