public class ex5 {
    public static void main(String[] args){
        rectangle r=new rectangle(12,2);
        System.out.println(r.toString());


    }
}
class rectangle{
    private double longueur;
    private double largeur;
    rectangle(){}
    rectangle(double largeur,double longueur){
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public void setlargeur(double largeur){
        if(largeur>=0)
        this.largeur=largeur;
        else this.largeur=0;
    }
    public void setlongueur(double longueur){
        if(longueur>=0)
        this.longueur=longueur;
        else this.longueur=0;
    }
    public double getlargeur(){
        return largeur;
    }
    public double getlongueur(){
        return longueur;
    }
rectangle(rectangle rec){
        this(rec.getlargeur(),rec.getlongueur());
}
public double perimetre(){
        return 2*(largeur+longueur);
}
public double air(){
        return longueur * largeur;
}
public String isCarre(){
        if(longueur==largeur)
            return "yes";
        else return "non";

}
public String toString(){
        return "rectangle( largeur ="+largeur+" ,longueur ="+longueur+") "
                +"perimetre ="+perimetre()
                +", air ="+air()
                +", rectangle carree :"+isCarre();

}
}
