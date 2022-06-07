package tp09_facile;

public class Rectangle implements ObjetGeometrique{

    int largeur;
    int  longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double perimetre() {
        return ((largeur+longueur) * 2);
    }

    @Override
    public double surface() {
        return (largeur*longueur);
    }

}
