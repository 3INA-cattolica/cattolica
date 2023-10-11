package figureGeometriche;

public class TriangoloRettangolo {
    private double base;
    private double altezza;
    private double ipotenusa;
    
    public TriangoloRettangolo(double base, double altezza, double ipotenusa){
        this.base      = base;
        this.altezza   = altezza;
        this.ipotenusa = ipotenusa;
    }
    
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltezza(){
        return this.base;
    }
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    public double getIpotenusa(){
        return this.ipotenusa;
    }
    
    public void setIpotenusa(double ipotenusa){
        this.ipotenusa = ipotenusa;
    }
   
    
    public double perimetro(){
        double rit;
        rit = this.base+this.altezza+this.ipotenusa;
        return rit;
    }
    
    public double area(){
        double rit;
        rit = (this.base*this.altezza)/2;
        return rit;
    }
    
    public String info(){
        String rit;
        rit = "\n" + "base     : " + this.base + "\n" + 
              "altezza  : " + this.altezza + "\n" +
              "ipotenusa: " + this.ipotenusa ;
        return rit;
    }
    
    //rettangolo
}
