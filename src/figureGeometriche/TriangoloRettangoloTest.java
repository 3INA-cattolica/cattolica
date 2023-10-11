
package figureGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        double b,a,i;
        System.out.println("base     : ");
        b=tastiera.nextDouble();
        System.out.println("altezza  : ");
        a=tastiera.nextDouble();
        System.out.println("ipotenusa: ");
        i=tastiera.nextDouble();
        TriangoloRettangolo t1 = new TriangoloRettangolo(b,a,i);
        
        double p = t1.perimetro();
        double area = t1.area();
        
        System.out.println(t1.info());
        System.out.println("perimetro: " +p);
        System.out.println("area     : " +area);
    
        System.out.println("\n");
        
        System.out.println("cambiare valore della base    : ");
        b=tastiera.nextDouble();
        t1.setBase(b);
        System.out.println("cambiare valore dell'altezza  : ");
        a=tastiera.nextDouble();
        t1.setAltezza(a);
        System.out.println("cambiare valore dell'ipotenusa :");
        i=tastiera.nextDouble();
        t1.setIpotenusa(i);
    
        System.out.println(t1.info());
        System.out.println("perimetro: " +p);
        System.out.println("area     : " +area);
    }
    
}
