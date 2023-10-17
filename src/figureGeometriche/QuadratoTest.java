package figureGeometriche;

public class QuadratoTest {

    public static void main(String[] args) {
        Quadrato q1 = new Quadrato(5);
        float area = q1.area();
        float perimetro = q1.perimetro();
        
        System.out.println("l'area del quadrato è       : " + q1.info());
        System.out.println("l'area del quadrato è       : " + area);
        System.out.println("il perimetro del quadrato è : " + perimetro);
    }
    
}
