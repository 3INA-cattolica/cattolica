package esercizi;

import java.util.Scanner;


public class EquazioneTest {

   
    public static void main(String[] args) {
        double a,b,x;
        Scanner tastiera = new Scanner(System.in);
        System.out.print("inserire il primo valore  : ");
        a = tastiera.nextDouble();
        System.out.print("inserire il secondo valore: ");
        b = tastiera.nextDouble();
        System.out.print("Inserisci il terzo valore :");
        x = tastiera.nextDouble();
       
        Equazione e = new Equazione(a,b,x);
        System.out.println("il risultato dell'equazione è: " + e.equazione1());
        System.out.println(e.info());
    }
   
}
