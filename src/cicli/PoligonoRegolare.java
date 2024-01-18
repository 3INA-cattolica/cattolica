package esercizi;

/**
 *
 * @author Stefano.Cattolica
 */
public class PoligonoRegolare {
    /**
     * variabili di istanza
     */
    private int nLati;
    private int vLati;

    /**
     * metodo costruttore senza parametri
     */
    public PoligonoRegolare() {
    }

    /**
     * metodo costruttore con parametri
     * @param nLati
     * @param vLati 
     */
    public PoligonoRegolare(int nLati, int vLati) {
        this.nLati = nLati;
        this.vLati = vLati;
    }

    /**
     * metodo getter nLati
     * @return il valore di nLati
     */
    public int getNLati() {
        return nLati;
    }

    /**
     * metodo setter nLati
     * @param nLati 
     */
    public void setNLati(int nLati) {
        this.nLati = nLati;
    }

    /**
     * metodo getter di vLati
     * @return il valore di vLati
     */
    public int getVLati() {
        return vLati;
    }

    /**
     * metodo setter di vLati
     * @param vLati 
     */
    public void setVLati(int vLati) {
        this.vLati = vLati;
    }
    
    /**
     * metodo info
     * @return il valore delle variabili di istanza
     */
    public String info(){
        String str;
        str = "\n" + "numero dei lati:" + this.nLati +
              "\n" + "valore dei lati:" + this.vLati;
        return str;
    }
    
    /**
     * metodo isVerificaNLati
     * @return verifica il numero dei lati 
     */
    public boolean isVerificaNLati(){
        boolean str = false;
        if(!(nLati <3 && nLati > 6))
            switch(this.nLati){
                case 3: case 4: case 5: case 6:
                    str = true;
                    break;

                default:
                    str = false;
        }
        return str;
    }
    
    /**
     * metodo isVerificaVLati
     * @return verifica che il valore dei lati sia maggiore a 0
     */
    public boolean isVerificaVLati(){
        boolean str = false;
        if(vLati > 0)
            switch(this.vLati){
               case 0:
                   str = false;
                   break;

               default:
                   str = true;
        }
        return str;
    }
    
    /**
     * metodo isPoligono
     * @return verifica se è un poligono con il numero e il valore dei lati possibili
     */
    public boolean isPoligono(){
        boolean rit;
        if(isVerificaNLati() == true && isVerificaVLati() == true)
            rit = true;
        else
            rit = false;
        return rit;
    }
    
    /**
     * metodo tipoPoligono
     * @return il tipo del poligono
     */
    public String tipoPoligono(){
        String str= "";
        if(isPoligono()== true)
            switch(nLati){
                case 3:
                    str = "triangolo";
                    break;
                
                case 4:
                    str = "quadrato";
                    break;
                    
                case 5:
                    str = "pentagono";
                    break;
                    
                case 6:
                    str = "esagono";
                    break;
            }
              
        else
                str = "non è un poligono avente dai 3 ai 6 lati";
            
        return str;
    }
    
    /**
     * metodo perimetro
     * @return il perimetro
     */
    public int perimetro(){
        int rit=0;
        switch(tipoPoligono()){
            case "triangolo":
                rit = vLati*3;
                break;
                
            case "quadrato":
                rit = vLati*4;
                break;
                
            case "pentagono":
                rit = vLati*5;
                break;
                
            case "esagono" :
                rit = vLati*6;
                break;
                
            case "non è un poligono avente dai 3 ai 6 lati" :
                rit = 999999;
                break;
                
        }
        return rit;
    }
    
    
}
