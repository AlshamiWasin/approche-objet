package tp_gestion_des_salaires;

public class CordonneePro extends CordonneePerso{

    String service;
    Adresse adresse;

    public CordonneePro(String numeroTelephone, String mail, String service, Adresse adresse) {
        super(numeroTelephone, mail);
        this.service = service;
        this.adresse = adresse;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }



}
