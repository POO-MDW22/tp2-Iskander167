public class testmagasin {
    public static void main(String[] args) {
        produit p1=new produit(1021,"Lait","Delice",800);
        produit p2=new produit(2510,"Yaourt","Vitalait",500);
        produit p3=new produit(3250,"Tomate","Sicam",1200);
        magasin MG1=new magasin(5000,"Bouzid",9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombre du magazine est"+MG1.num);

        p1.comparer(p2);
       vendeur v1=new vendeur(7,"Bassma","sidibouzid",8,20);

       responsable r1=new responsable(1,"iskander","tunis",5,1000);
       responsable r2=new responsable(2,"baha","tunis",5,1000);
       
        caissier c1=new caissier(3,"rayen","sousse",12,24);


    }

    }


