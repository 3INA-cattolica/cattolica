package operazioniMatematiche;


public class Somma {
    public double n1;
    public double n2;
    
    public Somma(double numero1,double numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    public double esegui(){
        double somma;
        somma = n1 + n2;
        return somma;
    }
}
