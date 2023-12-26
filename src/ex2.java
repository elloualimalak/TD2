public class ex2{
    public static void main(String[] args){
        point M =new point("A", 2.5);
       M.setX(2);
       M.setY(3);
       M.setName("omar");
        System.out.println(M);

    }

}
class point {
    private double x, y;
    private String name;
point(String a, double v){};
    point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double norme(){
  return Math.sqrt(getX()*getX()+getY()*getY());
    }
    public String toString() {
       return "Point ("+" x="+x+", y="+y+"), nom= "+name+", norme="+norme();



    }


}
