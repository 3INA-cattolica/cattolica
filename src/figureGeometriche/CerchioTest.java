package figureGeometriche;

public class CerchioTest {

     public static void main(String[] args) {
        Cerchio c1 = new Cerchio(8);
        double area = c1.area();
        double circonferenza = c1.circonferenza();
        
        System.out.println("info                           : "+c1.info());
        System.out.println("l'area del cerchio è           : "+area);
        System.out.println("la circonferenza del cerchio è : "+circonferenza);
    }
    
}
