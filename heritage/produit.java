import java.util.Date;

public class produit {
    Date date_ex;
    int identifier;
    String libelle;
    String marque;
    double prix;

    public produit(int i, String lait, String delice, int i1) {

    }

    public produit(int identifier, String libelle, String marque, double prix, Date d) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_ex = d;
    }

    void affiche() {
        System.out.println("le idntifier " + identifier + " le libelle" + " " + libelle + "le marque" + " " + marque + "le prix" + " " + prix + "la date est" + date_ex);
        System.out.println(date_ex);

    }

    public String toString() {
        return "identifier" + this.identifier + "libelle" + this.libelle + "marque" + this.marque + "prix" + this.prix;
    }

    public void setDat_ex(Date d) {
        this.date_ex = d;
    }

    public boolean comparer(produit p1) {
        return this.identifier == p1.identifier;
    }

    public boolean comparer(produit p1, produit p2) {
        return p1.identifier == p2.identifier;
    }
}

