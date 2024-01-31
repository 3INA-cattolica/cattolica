/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi;



import java.util.Scanner;
import java.util.Formatter;
import java.util.Random;


public class Frequenza2Test {
Random r = new Random();  
    private int totElementi;
    private int nElementi;

    public Frequenza2Test() {
    }

    public Frequenza2Test(int totElementi, int nElementi) {
        this.totElementi = totElementi;
        this.nElementi = nElementi;
    }

    public int getTotElementi() {
        return totElementi;
    }

    public void setTotElementi(int totElementi) {
        this.totElementi = totElementi;
    }

    public int getnElementi() {
        return nElementi;
    }

    public void setnElementi(int nElementi) {
        this.nElementi = nElementi;
    }
   
    public int randomElementi(){
        totElementi=r.nextInt(1000);
        return totElementi;
    }
   
    public int randomNElementi(){
        nElementi=r.nextInt(10);
        return nElementi;
    }

    public String frequenza() {
        Formatter f = new Formatter();
        Random r1 = new Random();

        String testo = "N. - FA -  FR  - FP\n";

       
        int contatore = 0;
        int differenza = totElementi;

        for (int i = 0; i < nElementi; i++) {

            if (i < nElementi-1) {
                contatore = r1.nextInt(differenza);
            } else {
                contatore = differenza;
            }

            double fR = (double) contatore / totElementi;
            double fP = fR * 100;

            f.format("%d   %2d    %4.2f    %5.2f\n", i, contatore, fR, fP);

            differenza = differenza - contatore;
        }
       
        testo += f;

        return testo;
    }
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totElementi,nElementi;
       
        System.out.print("Inserisci il numero totale: ");
        totElementi=in.nextInt();
       
        System.out.print("Inserisci il numero di elementi: ");
        nElementi=in.nextInt();

        Frequenza2Test f= new Frequenza2Test(totElementi,nElementi);
        System.out.println(f.frequenza());
    }
}
