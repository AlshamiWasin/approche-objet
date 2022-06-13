package tp_Reservation_En_Ligne;

public class Appartement {

    String adresse;
    Integer PrixParNuit;
    Integer nbrMaxPersonnes;
    String etage;

    boolean reserver = false;
    Integer nbrPersonnesReservation;

    public Appartement(String adresse, Integer prixParNuit, Integer nbrMaxPersonnes, String etage) {
        this.adresse = adresse;
        PrixParNuit = prixParNuit;
        this.nbrMaxPersonnes = nbrMaxPersonnes;
        this.etage = etage;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getPrixParNuit() {
        return PrixParNuit;
    }

    public void setPrixParNuit(Integer prixParNuit) {
        PrixParNuit = prixParNuit;
    }

    public Integer getNbrMaxPersonnes() {
        return nbrMaxPersonnes;
    }

    public void setNbrMaxPersonnes(Integer nbrMaxPersonnes) {
        this.nbrMaxPersonnes = nbrMaxPersonnes;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public boolean isReserver() {
        return reserver;
    }

    public void setReserver(boolean reserver) {
        this.reserver = reserver;
    }

    public Integer getNbrPersonnesReservation() {
        return nbrPersonnesReservation;
    }

    public void setNbrPersonnesReservation(Integer nbrPersonnesReservation) {
        this.nbrPersonnesReservation = nbrPersonnesReservation;
    }

    public void reserverAppartement( int nbrpersonne ){

        if (this.reserver != true){

            if (nbrpersonne <= this.nbrMaxPersonnes){
                this.reserver = !this.reserver;
                this.nbrPersonnesReservation = nbrpersonne;
                System.out.printf("Apartment has been reserved for %d people" , this.nbrPersonnesReservation);
                System.out.println();
            }else {
                System.out.printf("this apartment only fits %d people" , this.nbrMaxPersonnes);
                System.out.println();
            }
        }
        else {
            System.out.println("this apartment is already reserved");
        }

    }

    public void libererApparement(){

        if (this.reserver == true){
            this.reserver = false;
            this.nbrPersonnesReservation = 0;
            System.out.println("this Apartment has been liberated");
        }
        else {
            System.out.println("this Apartment is not reserved");
        }
    }

    @Override
    public String toString() {

        if (this.reserver == true){
            return "Appartement{" +
                    "adresse='" + adresse + '\'' +
                    ", PrixParNuit=" + PrixParNuit +
                    ", nbrMaxPersonnes=" + nbrMaxPersonnes +
                    ", etage='" + etage + '\'' +
                    ", reserver=" + reserver +
                    ", nbrPersonnesReservation=" + nbrPersonnesReservation +
                    '}';
        }else {
            return "Appartement{" +
                    "adresse='" + adresse + '\'' +
                    ", PrixParNuit=" + PrixParNuit +
                    ", nbrMaxPersonnes=" + nbrMaxPersonnes +
                    ", etage='" + etage + '\'' +
                    '}';
        }
    }
}
