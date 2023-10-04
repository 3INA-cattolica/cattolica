package figureGeometriche;


public class Cerchio {
    public double r;
    public double p;
    
    
    
    public Cerchio(double raggio){
        r = raggio;
        p = 3.14;
        
    }
    
    public double area(){
        double ritorno;
        ritorno = p * (r*r);
        return ritorno;
    }
    
    public double circonferenza(){
        double ritorno;
        ritorno = 2* p* r;
        return ritorno;
    }
    
    
}
