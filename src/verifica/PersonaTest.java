package verifica;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class PersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome,cognome,email;
        Scanner tastiera = new Scanner(System.in);
        
        System.out.print("inserire il valore del nome   : ");
        nome = tastiera.nextLine();
        System.out.print("inserire il valore del cognome: ");
        cognome = tastiera.nextLine();
        System.out.print("inserire il valore dell'email : ");
        email = tastiera.nextLine();
        
        Persona p = new Persona(nome,cognome,email);
        System.out.println("\n");
        System.out.println(p.registrazione());
        System.out.println(p.info());
        
        
        
    }
    
}
