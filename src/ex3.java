public class ex3 {
    public static void main(String[] args){

        livre book4=new livre("the miracle morning","Hal Elrod",15.14,2012);
        System.out.println(book4.toString());
    }
}
class livre{
    private String titre;
    private String auteur;
    private double prix;
    private int annee;
    livre (){}
    livre(String titre){

        this.titre=titre;
    }
    livre(String titre,String auteur){
        this(titre);
        this.auteur=auteur;
    }
    livre(String titre,String auteur,double prix){
        this(titre,auteur);
        this.prix=prix;
    }
    livre(String titre,String auteur,double prix,int annee){
        this(titre,auteur,prix);
        this.annee=annee;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }
    public void setPrix(double prix){
        this.prix=prix;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }
    public String getAuteur(){
        return auteur;
    }
    public double getprix(){
        return prix;
    }
    public String getTitre(){
        return titre;
    }
    public int getAnnee(){
        return annee;
    }
    livre(livre liv){
       this(liv.getTitre(),liv.getAuteur(),liv.getprix(),liv.getAnnee());
    }

public String toString(){
        return "titre :"+titre+", auteur: "+auteur+", prix: "+prix+", annee: "+annee;
    }

}
