package numero;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class NumeroTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        Scanner tastiera = new Scanner(System.in);
        System.out.print("inserire il primo valore: ");
        n1 = tastiera.nextInt();
        System.out.print("inserire il secondo valore: ");
        n2 = tastiera.nextInt();
        
        Numero n = new Numero(n1,n2);
        System.out.println("la differenza è di: " + n.differenza());
        System.out.println(n.info());
    }
    
}
