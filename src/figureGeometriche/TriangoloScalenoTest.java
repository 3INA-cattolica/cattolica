
package figureGeometriche;


public class TriangoloScalenoTest {

    
    public static void main(String[] args) {
        TriangoloScaleno t1 = new TriangoloScaleno(3,4,5);
        double t = t1.perimetro();
        System.out.println("il perimetro è di : "+ t);
        
        double a = t1.area();
        System.out.println("l'area è di       : " + a);
        
        double h = t1.trovaAltezza();
        System.out.println("l'altezza è di    : " + h);
    }
    
}
