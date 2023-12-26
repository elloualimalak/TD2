public class ex6 {
    public static void main(String[] args){
        banque b=new banque( 1, 5000.75F, "AB 1200");
        System.out.println(b.avoirInf());
        System.out.println(b.avoirsolde());
        b.deposer(500);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirsolde());
        b.retirer(200);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirsolde());

    }
}
class banque{
    private int Ncompte;
    private float solde;
    private String CIN;
    banque(int Ncompte,float solde,String CIN){
        this.Ncompte=Ncompte;
        this.solde=solde;
        this.CIN=CIN;
    }
    public void setNcompte(int Ncompte){
        this.Ncompte=Ncompte;
    }
    public void setsolde(float solde){
        this.solde=solde;
    }
    public void setCIN(String CIN){
        this.CIN=CIN;
    }
    public int getNcompte(){
        return Ncompte;
    }
    public float getsolde(){
        return solde;
    }
    public String getCIN(){
        return CIN;
    }
    public void deposer(float somme){
        this.setsolde(this.getsolde()+somme);
    }
    public void retirer(float somme){
        this.setsolde(this.getsolde()-somme);
    }
    public float avoirsolde(){
        return solde;
    }
    public String avoirInf(){
        return "CIN "+CIN+", Ncompte "+Ncompte+", solde "+solde;
    }
}
