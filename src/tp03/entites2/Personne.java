package tp03.entites2;


import tp03.entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void afficherNomPrenom(){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }

    public void changerNom(String nom){
        this.nom = nom;
    }

    

    public void changerPrenom(String prenom){
        this.prenom = prenom;
    }

    public void changerAdresse(AdressePostale adressePostale){
        this.adressePostale = adressePostale;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public AdressePostale getAdresse(){
        return this.adressePostale;
    }

}
