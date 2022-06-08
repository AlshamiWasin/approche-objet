package tp_gestion_des_salaires;

public class CordonneePerso {

    String numeroTelephone;
    String mail;

    public CordonneePerso(String numeroTelephone, String mail) {
        this.numeroTelephone = numeroTelephone;
        this.mail = mail;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
