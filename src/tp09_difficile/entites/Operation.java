package tp09_difficile.entites;

import java.util.Date;

public abstract class Operation {

    Date date;
    int montant;

    Compte compte;

    public Operation(Date date, int montant, Compte compte) {
        this.date = date;
        this.montant = montant;
        this.compte = compte;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
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
