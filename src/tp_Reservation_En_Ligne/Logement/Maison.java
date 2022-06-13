package tp_Reservation_En_Ligne.Logement;

public class Maison  extends Logement{

    boolean disposeJardin;


    public Maison(String adresse, Integer prixParNuit, Integer capaciteMax, boolean disposeJardin) {
        super(adresse, prixParNuit, capaciteMax);
        this.disposeJardin = disposeJardin;

    }


    public boolean isDisposeJardin() {
        return disposeJardin;
    }

    public void setDisposeJardin(boolean disposeJardin) {
        this.disposeJardin = disposeJardin;
    }
}
