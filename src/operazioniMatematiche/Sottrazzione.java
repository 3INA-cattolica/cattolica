package operazioniMatematiche;


public class Sottrazzione {
    private double n1;
    private double n2;
    
    public Sottrazzione(double numero1, double numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    public double getN1(){
        return this.n1;
    }
    
    public void setN1(double n1){
        this.n1 = n1;
    }
    
    public double getN2(){
        return this.n2;
    }
    
    public void setN2(double n2){
        this.n2 = n2;
    }
    
    public double esegui(){
        double ritorno;
        ritorno = n1 - n2;
        return ritorno;
    }
    
    public String info(){
        String stringa;
        stringa = "\n" + "primo numero : " + this.n1 + "\n" + 
              "secondo numero: " + this.n2 ;
        return stringa;
    }
    
}
