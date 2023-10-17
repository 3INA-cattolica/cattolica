package figureGeometriche;

public class Cerchio {
    private double r;
    private double p;
    
    public Cerchio(double raggio){
        r = raggio;
        p = Math.PI;
    }
    
     public double getR(){
        return this.r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getp(){
        return this.p;
    }
    
    public void setP(double p){
        this.p = p;
    }
    
    public double area(){
        double ritorno;
        ritorno = p * (r*r);
        return ritorno;
    }
    
    public double circonferenza(){ //funzione per calcolare la circenferenza
        double ritorno;
        ritorno = 2* p* r;
        return ritorno;
    }
    
    public String info(){
        String stringa;
        stringa =  "raggio: " + this.r ;
        return stringa;
    }
    
    
}
