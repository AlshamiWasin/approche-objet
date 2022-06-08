package tp_gestion_des_salaires;

public class Cadre extends Employe{

    public static final String mission = "Gérer les projets";

    public static double tauxJournalier;

    public Cadre(String nom, String prenom, int nbrSercuriteSociale, Adresse adresse, CordonneePerso cordonneePerso, CordonneePro cordonneePro, String matricule , double taux) {
        super(nom, prenom, nbrSercuriteSociale, adresse, cordonneePerso, cordonneePro, matricule);
        this.tauxJournalier = taux;
    }

    @Override
    public Double calculerBrutAnnuel() {
        int jourParAn = 212;
        return jourParAn*tauxJournalier;
    }

    @Override
    public String getMission() {
        return mission;
    }

}
