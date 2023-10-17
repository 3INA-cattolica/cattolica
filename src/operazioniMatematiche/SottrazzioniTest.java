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
        
        System.out.println("\n");
        
        Sottrazzione sottrazzione = new Sottrazzione(n1,n2);
        s = sottrazzione.esegui();
        n1  = sottrazzione.getN1();
        n2 = sottrazzione.getN2();
        String info = sottrazzione.info();
        
        System.out.println("info          : " + info);
        System.out.println("sottrazzione  : " + s);
                
        }
    
}
