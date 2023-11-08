
package numero;

/**
 *
 * @author stefano.cattolica
 */
public class Numero {
    int n1,n2;
    
    public Numero(){
    
    }
    
    public Numero(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public int getN1(){
        return this.n1;
    }
    
    public void setN1(int n1){
        this.n1 = n1;
    }
    
    public int getN2(){
        return this.n2;
    }
    
    public void setN2(int n2){
        this.n2 = n2;
    }
    
    public int differenza(){
        int dif;
        if(n1>n2){
            dif = this.n1-this.n2;
        }else{
            dif = this.n2-this.n1;
        }
        return dif;
    }
    
    public String info(){
        String stringa;
        stringa = "\n" + "primo numero: " + this.n1 + "\n" + 
              "secondo numero  : " + this.n2 ;
        return stringa;
    }
    
}
