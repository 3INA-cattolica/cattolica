package figureGeometriche;

public class Quadrato {
    public float base;
    
    public Quadrato(float lato1){
        base = lato1;
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
    
}
