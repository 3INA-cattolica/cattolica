package figureGeometriche;

import java.util.Scanner;

public class TrapezioIsosceleTest {

    
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        double baseMaggiore,baseMinore,lato;
        System.out.println("base maggiore: ");
        baseMaggiore = tastiera.nextDouble();
        System.out.println("base minore  : ");
        baseMinore = tastiera.nextDouble();
        System.out.println("lato         : ");
        lato = tastiera.nextDouble();
        
        
        TrapezioIsoscele t1 = new TrapezioIsoscele(baseMaggiore, baseMinore, lato);
        double p = t1.perimetro();
        double a = t1.area();
        
        System.out.println(t1.info());
        System.out.println("perimetro    : " +p);
        System.out.println("area         : " +a);
        
        System.out.println("\n");
        
        System.out.println("cambiare valore della base maggiore: ");
        baseMaggiore = tastiera.nextDouble();
        t1.setBaseMaggiore(baseMaggiore);
        System.out.println("cambiare valore della base minore  : ");
        baseMinore = tastiera.nextDouble();
        t1.setBaseMinore(baseMinore);
        System.out.println("cambiare valore del lato           :");
        lato =tastiera.nextDouble();
        t1.setLato(lato);
        
        System.out.println(t1.info());
        System.out.println("perimetro    : " +t1.perimetro());
        System.out.println("area         : " +t1.area());;
    }
    
}
