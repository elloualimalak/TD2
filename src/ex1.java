public class ex1 {
  public static void main(String[] args){
      Point p=new Point("omar",2);
      p.affiche();
      p.translate( 3);
      p.affiche();
  }
}
class Point{
    private String nom;
    private double abscisse;
    public Point(String nom,double abscisse){
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void nomset(String nom){
        this.nom=nom;
    }
    public String nomget(){
        return nom;
    }
    public void abscisseset(double abscissse){
        this.abscisse=abscissse;
    }
    public double abscisseget(){
        return abscisse;
    }
    public void affiche(){
        System.out.println("le nom :"+nomget()+" l abscisse :"+abscisseget());
    }
    public void translate(double newa){
        newa+=abscisse;
    }


}
