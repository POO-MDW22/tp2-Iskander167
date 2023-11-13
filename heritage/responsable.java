public class responsable extends employe{
    int prime;

    public responsable(){}
    public responsable(int id, String nom, String adresse, int nb,int prime){
        super(id, nom, adresse, nb);
        this.prime=prime;
    }
}
