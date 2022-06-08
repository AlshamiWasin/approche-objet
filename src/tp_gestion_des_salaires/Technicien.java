package tp_gestion_des_salaires;

public class Technicien extends Employe{

    public static final String mission = "Fabriquer et contrôler les produits de l’entreprise";

    public static double tauxHoraire;


    public Technicien(String nom, String prenom, int nbrSercuriteSociale, Adresse adresse, CordonneePerso cordonneePerso, CordonneePro cordonneePro, String matricule , double taux) {
        super(nom, prenom, nbrSercuriteSociale, adresse, cordonneePerso, cordonneePro, matricule);
        this.tauxHoraire = taux;
    }

    @Override
    public Double calculerBrutAnnuel() {
        int heureParAn = 1607;
        return heureParAn * tauxHoraire;
    }

    @Override
    public String getMission() {
        return mission;
    }


}
