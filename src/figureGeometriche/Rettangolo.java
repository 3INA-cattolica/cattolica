
package figureGeometriche;


public class Rettangolo {
    public double base;
    public double altezza;
    
    public Rettangolo(double b, double a){
        this.base = b;
        this.altezza = a;
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
    
}
