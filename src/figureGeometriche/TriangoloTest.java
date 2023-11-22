package figureGeometriche;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class TriangoloTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double l1,l2,l3;
        Scanner tastiera = new Scanner(System.in);
        
        System.out.print("inserire il primo lato  : ");
        l1 = tastiera.nextDouble();
        System.out.print("inserire il secondo lato: ");
        l2 = tastiera.nextDouble();
        System.out.print("inserire il terzo lato  : ");
        l3 = tastiera.nextDouble();
        
        Triangolo t = new Triangolo(l1,l2,l3);
        
        System.out.print("\n");
        
        System.out.println("il perimetro è di: " + t.perimetro());
        System.out.println("l'area è di      : " + t.area());
        System.out.println("il triangolo è   : " + t.tipoV2());
        System.out.println(t.info());
        
        System.out.print("\n");
        
        System.out.print("inserire un altro valore per il primo lato  : ");
        l1 = tastiera.nextDouble();
        t.setL1(l1);
        System.out.print("inserire un altro valore per il secondo lato: ");
        l2 = tastiera.nextDouble();
        t.setL2(l2);
        System.out.print("inserire un altro valore per il terzo lato  : ");
        l3 = tastiera.nextDouble();
        t.setL3(l3);
        
        System.out.print("\n");
        
        System.out.println("il perimetro è di: " + t.perimetro());
        System.out.println("l'area è di      : " + t.area());
        System.out.println("il triangolo è   : " + t.tipoV2());
        System.out.println(t.info());
        
        System.out.print("\n");
        
        System.out.print("inserire un altro valore per il primo lato  : ");
        l1 = tastiera.nextDouble();
        t.setL1(l1);
        System.out.print("inserire un altro valore per il secondo lato: ");
        l2 = tastiera.nextDouble();
        t.setL2(l2);
        System.out.print("inserire un altro valore per il terzo lato  : ");
        l3 = tastiera.nextDouble();
        t.setL3(l3);
        
        System.out.print("\n");
        
        System.out.println("il perimetro è di: " + t.perimetro());
        System.out.println("l'area è di      : " + t.area());
        System.out.println("il triangolo è   : " + t.tipoV2());
        System.out.println(t.info());
        
    }
    
}
