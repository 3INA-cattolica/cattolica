/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi;

/**
 *
 * @author stefano.cattolica
 */
public class Bigliettoferroviario {
    private String passeggero;
    private double prezzoBiglietto;

    public Bigliettoferroviario() {
    }

    public Bigliettoferroviario(String passeggero, double prezzoBiglietto) {
        this.passeggero = passeggero;
        this.prezzoBiglietto = prezzoBiglietto;
    }

    public String getPasseggero() {
        return passeggero;
    }

    public void setPasseggero(String passeggero) {
        this.passeggero = passeggero;
    }

    public double getPrezzoBiglietto() {
        return prezzoBiglietto;
    }

    public void setPrezzoBiglietto(double prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }
    
   public String info(){
        String testo;
        testo = "\n" + "passeggero: " + this.passeggero + "\n" +
                "biglietto prezzo: " + this.prezzoBiglietto + "\n" ;
        return testo;
    }
   
   public double sconto(){
       if(this.passeggero.equals("P"))
           prezzoBiglietto = (prezzoBiglietto)-(prezzoBiglietto/100)*10 ;
       if(this.passeggero.equals("S"))
   }
   
    
    
}
