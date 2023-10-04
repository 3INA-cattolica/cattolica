package operazioniMatematiche;

public class SommaTest {

    public static void main(String[] args) {
        
        Somma somma = new Somma(8,9.3);
        double s = somma.esegui();
        double n1  = somma.n1;
        double n2 = somma.n2;
        
        System.out.println(s);
        System.out.println(somma.esegui());
        System.out.println("numero1 : " + n1);
        System.out.println("numero2 : " + n2);
        System.out.println("somma   : " + s);
        
        

        
        
    }
    
    
    
}
