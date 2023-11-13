public class vendeur extends employe {
    int taux;

    public vendeur (){}
    public vendeur( int id, String nom, String adresse, int nb,int taux){

        super( id,  nom,  adresse,  nb);
        this.taux=taux;
    }



}

