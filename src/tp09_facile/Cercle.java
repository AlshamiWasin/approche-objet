package tp09_facile;

public class Cercle implements ObjetGeometrique{

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return (2 * Math.PI * rayon);
    }

    @Override
    public double surface() {
        return (Math.PI * Math.pow(rayon , 2));
    }
}
