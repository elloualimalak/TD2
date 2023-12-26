public class ex4 {
    public static void main(String[] args){
        temps tem=new temps(2,32,45);
        System.out.println(tem.toString());
        tem.ajouterminutes(30);
        System.out.println(tem.toString());
        tem.ajoutersecondes(20);
        System.out.println(tem.toString());
    }
}
class temps{
    private int hours;
    private int minutes;
    private int secondes;
    temps(){}
    temps(int hours){
        this();
        this.hours =hours;
    }
    temps(int hours,int minutes){
        this(hours);
        this.minutes=minutes;
    }
    temps(int hours,int minutes,int secondes){
        this(hours,minutes);
        this.secondes=secondes;
    }
    public int gethours(){
        return hours;
    }
    public int getminutes(){
        return minutes;
    }

    public int getsecondes(){
        return secondes;
    }
    public void sethours(int hours){
        this.hours=hours;
    }
    public void setminutes(int minutes){
        this.minutes=minutes;
    }
    public void setsecondes(int secondes){
        this.secondes=secondes;
    }
    temps(temps t){
        this(t.gethours(),t.getminutes(),t.getsecondes());
    }
    public void ajouterhours(int hours){
        this.sethours(this.gethours()+hours);
    }
    public void ajouterminutes(int minutes){
        minutes+=this.getminutes();
        ajouterhours(minutes/60);
        this.setminutes(minutes%60);
    }
    public void ajoutersecondes(int secondes){
        secondes+=this.getsecondes();
        ajouterminutes(secondes/60);
        this.setsecondes(secondes%60);
    }


    public String toString() {
        return "hours: "+hours+" minutes: "+minutes+" secondes: "+secondes;
    }
}

