package tp08.fr.diginamic.banque.entites;

public abstract class Operation {

    String date;
    int montant;

    public Operation(String date, int montant) {
        this.date = date;
        this.montant = montant;
    }


    public int getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }

    public abstract String getType();

}
