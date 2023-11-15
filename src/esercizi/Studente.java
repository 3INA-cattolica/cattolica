package Esercizi;

/**
 *
 * @author stefano.cattolica
 */
public class Studente {
    private String nome,cognome;
    private double voto;
    private String esito;
    
    public Studente(String nome,String cognome,double voto){
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
        
        if(this.voto >= 6){
            Studente.this.setEsito(" positivo");
        }else{
            Studente.this.setEsito(" negativo");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public double getVoto(){
        return this.voto;
    }
    
    public void setVoto(double voto){
        this.voto = voto;
        
        if(this.voto >= 6){
            Studente.this.setEsito(" positivo");
        }else{
            Studente.this.setEsito(" negativo");
        }
    }
    
    public String getEsito(){
        return this.esito;
    }
    
    public void setEsito(String esito){
        this.esito = esito;
    }
    
    public String info(){
        String rit;
        rit = "\n" + "nome   : " + this.nome + "\n" + 
              "cognome: " + this.cognome + "\n" +
              "voto   : " + this.voto + "\n"  + 
              "esito  :" + this.esito;
        return rit;
    }
    
    
}
