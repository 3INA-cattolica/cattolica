package figureGeometriche;

public class Rettangolo {
    private double base;
    private double altezza;
    
    public Rettangolo(double b, double a){
        this.base = b;
        this.altezza = a;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltezza(){
        return this.altezza;
    }
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    public double area(){
        double rit;
        rit= this.base*this.altezza;
        return rit;
    }
    
    public double perimetro(){
        double rit;
        rit = (this.base*2)+(this.altezza*2);
        return rit;
    }
    
    public String info(){
        String stringa;
        stringa = "\n" + "base: " + this.base + "\n" + 
              "altezza  : " + this.altezza ;
        return stringa;
    }
}
