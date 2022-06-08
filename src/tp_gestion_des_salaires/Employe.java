package tp_gestion_des_salaires;

public abstract class Employe extends Personne {

    String matricule;
    public Employe(String nom, String prenom, int nbrSercuriteSociale, Adresse adresse, CordonneePerso cordonneePerso, CordonneePro cordonneePro, String matricule) {
        super(nom, prenom, nbrSercuriteSociale, adresse, cordonneePerso, cordonneePro);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public abstract Double calculerBrutAnnuel ();

    public Double calculerNetAnnuel(){
        Double brutAnnuel = calculerBrutAnnuel ();
        return brutAnnuel - (24/100 * brutAnnuel);
    };

    public Double calculerNetMensuel(){
        Double netAnnuel = calculerNetAnnuel();
        return (netAnnuel / 12);
    };

    public Double calculerBrutMensuel(){
        Double brutAnnuel = calculerBrutAnnuel();
        return (brutAnnuel / 12);
    };

    public abstract String getMission();

}
