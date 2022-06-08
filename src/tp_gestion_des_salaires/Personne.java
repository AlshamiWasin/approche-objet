package tp_gestion_des_salaires;

public abstract class Personne {

    String nom;
    String prenom;
    int nbrSercuriteSociale;
    Adresse adresse;
    CordonneePerso cordonneePerso;
    CordonneePro cordonneePro;


    public Personne(String nom, String prenom, int nbrSercuriteSociale, Adresse adresse, CordonneePerso cordonneePerso, CordonneePro cordonneePro) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbrSercuriteSociale = nbrSercuriteSociale;
        this.adresse = adresse;
        this.cordonneePerso = cordonneePerso;
        this.cordonneePro = cordonneePro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbrSercuriteSociale() {
        return nbrSercuriteSociale;
    }

    public void setNbrSercuriteSociale(int nbrSercuriteSociale) {
        this.nbrSercuriteSociale = nbrSercuriteSociale;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public CordonneePerso getCordonneePerso() {
        return cordonneePerso;
    }

    public void setCordonneePerso(CordonneePerso cordonneePerso) {
        this.cordonneePerso = cordonneePerso;
    }

    public CordonneePro getCordonneePro() {
        return cordonneePro;
    }

    public void setCordonneePro(CordonneePro cordonneePro) {
        this.cordonneePro = cordonneePro;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbrSercuriteSociale=" + nbrSercuriteSociale +
                ", adresse=" + adresse +
                ", cordonneePerso=" + cordonneePerso +
                ", cordonneePro=" + cordonneePro +
                '}';
    }
}
