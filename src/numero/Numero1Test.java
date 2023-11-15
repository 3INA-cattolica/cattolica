/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class Numero1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("inseire il numero :");
        n1 = tastiera.nextInt();
        
        Numero1 n = new Numero1(n1);
        
        System.out.println(n.info());
        System.out.println(n.pariODispari());
        System.out.println(n.minoreOMaggiore());
    }
    
}
