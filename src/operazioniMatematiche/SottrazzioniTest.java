package operazioniMatematiche;
import java.util.Scanner;


public class SottrazzioniTest {

    
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        double s = 0;
        double n1 =0;
        double n2 =0;
        
        System.out.println("inserisci il primo numero :");
        n1 = tastiera.nextDouble();
        System.out.println("inserisci il secondo numero :");
        n2 = tastiera.nextDouble();
        
        Sottrazzione sottrazzione = new Sottrazzione(n1,n2);
        s = sottrazzione.esegui(); 
        
        System.out.println("sottrazzione : " + s);
                
        }
    
}
