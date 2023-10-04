
package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        double base;
        double altezza;
        
        System.out.println("inseire la base : ");
        base = tastiera.nextDouble();
        System.out.println("inseire l'altezza : ");
        altezza = tastiera.nextDouble();
        
        Rettangolo r1 = new Rettangolo(base,altezza);
        
        double area = r1.area();
        double perimetro = r1.perimetro();
        
        System.out.println("l'area del cerchio è di       : " +area);
        System.out.println("il perimetro del cerchio è di : " +perimetro);

        
    }
    
}
