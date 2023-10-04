
package operazioniMatematiche;


public class Sottrazzione {
    public double n1;
    public double n2;
    
    public Sottrazzione(double numero1, double numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    public double esegui(){
        double ritorno;
        ritorno = n1 - n2;
        return ritorno;
    }
    
}
