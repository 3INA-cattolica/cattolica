package Esercizi;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class StudenteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome,cognome;
        double voto;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("inserire il nome:");
        nome = in.nextLine();
        System.out.print("inserire il cognome:");
        cognome = in.nextLine();
        System.out.print("inserire il voto:");
        voto = in.nextDouble();
        
        Studente s = new Studente(nome,cognome,voto);
        System.out.println(s.info());
        
        System.out.print("\n");
        
        System.out.print("inserire un nuovo voto:");
        voto = in.nextDouble();
        s.setVoto(voto);
        
        System.out.println(s.info());
    }
}
