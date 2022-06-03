package tp02.entites;

public class AdressePostale {


    public Integer numeroRue;
    public Integer codePostal;
    public String LibelleRue;
    public String ville;

    public AdressePostale(Integer numeroRue, Integer codePostal, String libelleRue, String ville) {
        this.numeroRue = numeroRue;
        this.codePostal = codePostal;
        LibelleRue = libelleRue;
        this.ville = ville;
    }
}
