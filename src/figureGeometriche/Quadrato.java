package figureGeometriche;

public class Quadrato {
    private float base;
    
    public Quadrato(float lato1){
        base = lato1;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float area(){
        float area;
        area = base*base;
        return area;
    }
    
    public float perimetro(){
        float perimetro;
        perimetro = base*4;
        return perimetro;
    }
    
     public String info(){
        String stringa;
        stringa = "\n" + "baseo: " + this.base ;
        return stringa;
     }
    
}
