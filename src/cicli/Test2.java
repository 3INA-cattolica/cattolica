package verifica;
import java.util.Scanner;

/**
 * Vai a prendere PoligonoRegolare.java
 * @author stefano.cattolica
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PoligonoRegolare p = new PoligonoRegolare();
        
        int uscita = 1;
        int nLati;
        int vLati;
        
        
        do {
            System.out.println("\n");
            System.out.println("1:verifica se è un poligono");
            System.out.println("2:dice che tipo di poligono è");
            System.out.println("3:calcola il perimetro");
            System.out.println("4:costruttore senza parametri");
            System.out.println("5:costruttore con parametri");
            System.out.println("6:per uscire");
            System.out.println("\n");
            System.out.print("Inserire un numero da 1 a 5:");
            int n = in.nextInt();
            System.out.println("\n");
            
            
                switch(n){
                    case 1:
                        System.out.println(p.isPoligono());
                        break;

                    case 2:
                        System.out.println(p.tipoPoligono());
                        break;

                    case 3:
                        System.out.println(p.perimetro());
                        break;
                        
                    case 4:
                        p = new PoligonoRegolare();
                        
                    case 5:
                        System.out.println("inserire il numero dei lati");
                        nLati = in.nextInt();
                        System.out.println("inserire il valore dei lati");
                        vLati = in.nextInt();
                        
                        p = new PoligonoRegolare(nLati,vLati);
                        
                    case 6:
                        uscita = 0;
                        break;
                        
                    default:
                        System.out.println("scelta errata!");
                }
            
               
        }while(uscita != 0);
        
    }
}
