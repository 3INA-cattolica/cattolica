/*
costruire una classe che dato un numero intero, stabilisca se è pari o dispari e se maggiore o minore o uguale a zero.
 */
package numero;

/**
 *
 * @author stefano.cattolica
 */
public class Numero1 {
    
    private int n1;
    
    public Numero1(){
        
    }
    
    public Numero1(int n1){
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public String info(){
        String rit;
        rit = "\n" + "n1: " + this.n1;
        return rit;
    }
    
    public String pariODispari(){
       String rit;
       if(n1%2 == 0){
           rit = "pari";
       }else{
           rit = "dispari";
       }
       
       return rit;
    }
    
    public String minoreOMaggiore(){
        String rit;
        
        if(this.n1 >= 0)
            if(this.n1 == 0)
                rit = "zero";
            else
                rit = "positivo";
        else
            rit = "negativo";
        
        return rit;
    }
    
    
    public String positivoNegativo0(){
        String rit = "";
        
        if(this.n1 == 0){
            rit = "è uguale a zero";
        }
        
        if(!((this.n1 == 0))&&(this.n1 >= 0)&&(!(this.n1 <= 0))){
            rit = "è maggiore di zero";
        }
        
        if(!((this.n1 == 0))&&(!(this.n1 >= 0))&&(this.n1 <= 0)){
            rit = "è minore di zero";
        }
        
        return rit;
    }
    
    public String pNZ(){
        String rit = "";
        if(this.n1 == 0){
            rit = "uguale a 0";
        }else if (this.n1 >= 0){
            rit = "maggiore di 0";
        }else{
            rit= "minore di 0";
        }
        return rit;
        
    }
    
}
