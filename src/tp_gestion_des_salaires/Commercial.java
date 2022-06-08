package tp_gestion_des_salaires;

public class Commercial extends Employe{

    public static final String mission = "trouver de nouveaux contacts";

    public static double chiffreAffaireAnneePres;

    public Commercial(String nom, String prenom, int nbrSercuriteSociale, Adresse adresse, CordonneePerso cordonneePerso, CordonneePro cordonneePro, String matricule , double chiffre) {
        super(nom, prenom, nbrSercuriteSociale, adresse, cordonneePerso, cordonneePro, matricule);
        this.chiffreAffaireAnneePres = chiffre;
    }

    @Override
    public Double calculerBrutAnnuel() {
        double taux = 5/100;
        return chiffreAffaireAnneePres * taux;
    }

    @Override
    public String getMission() {
        return mission;
    }


}
