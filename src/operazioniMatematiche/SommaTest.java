package operazioniMatematiche;

public class SommaTest {

    public static void main(String[] args) {
        
        Somma somma = new Somma(8,9.3);
        double s = somma.esegui();
        double n1  = somma.getN1();
        double n2 = somma.getN2();
        String info = somma.info();
        
        System.out.println(s);
        System.out.println(somma.esegui());
        System.out.println("numero1 : " + n1);
        System.out.println("numero2 : " + n2);
        System.out.println("somma   : " + s);
        
        somma.setN1(10);
        somma.setN2(17);
        System.out.println(info);
        System.out.println("somma   : " + s);
        
        

        
        
    }
    
    
    
}
