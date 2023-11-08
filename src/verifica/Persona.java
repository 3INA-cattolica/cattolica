package verifica;

/**
 *
 * @author stefano.cattolica
 */
public class Persona {
    private String nome,cognome,email;
    
    public Persona(){
        
    }
    
    public Persona(String nome, String cognome, String email){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
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
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String info(){
        String rit;
        rit = "\n" + "nome   : " + this.nome + "\n" + 
              "cognome: " + this.cognome + "\n" +
              "email  : " + this.email + "\n";
        return rit;
    }
    
    public String registrazione(){
        String rit;
        if(this.nome.equals(" ")||(this.cognome.equals(" "))||(this.email.equals(" "))){
            rit = "La registrazione non è avvenuta.";
        }else{
            rit = "La registrazione è avvenuta";
        }
        return rit;
    }
}
