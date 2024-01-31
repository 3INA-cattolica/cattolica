/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author stefano.cattolica
 */
public class Frequenza3 {
    
    
    private final int NUMERI = 9;
    private int totnumeri;
    

    public Frequenza3() {
    }

    public Frequenza3(int totnumeri) {
        this.totnumeri = totnumeri;
    }

    public int getTotnumeri() {
        return totnumeri;
    }

    public void setTotnumeri(int totnumeri) {
        this.totnumeri = totnumeri;
    }

    

    
   
    
    
    public String frequenza2(){
        Formatter f = new Formatter();
        Random r1 = new Random();
        
        int n = 0;
        String testo="";
        totnumeri = 100;
        for(int i = 1;i<totnumeri;i++){
            n = r1.nextInt(NUMERI)+1;
            
            testo += " "+ n;
            
        }
        
        return testo;
    }
    
    
    
    
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totElementi,nElementi;
       
        /*System.out.print("Inserisci il numero totale: ");
        totElementi=in.nextInt();
       
        System.out.print("Inserisci il numero di elementi: ");
        nElementi=in.nextInt();
*/

        Frequenza3 f= new Frequenza3();
        System.out.println(f.frequenza2());
    }
}
