package figureGeometriche;


public class TrapezioIsoscele {
    private double baseMaggiore;
    private double baseMinore;
    private double lato;
    
    public TrapezioIsoscele(double baseMaggiore, double baseMinore, double lato){
        this.baseMaggiore = baseMaggiore;
        this.baseMinore = baseMinore;
        this.lato = lato;
    }
    
    
    public double getBaseMaggiore(){
        return this.baseMaggiore;
    }
    
    public void setBaseMaggiore(double baseMaggiore){
        this.baseMaggiore = baseMaggiore;
    }
    
    public double getBaseMinore(){
        return this.baseMinore;
    }
    
    public void setBaseMinore(double baseMinore){
        this.baseMinore = baseMinore;
    }
    
    public double getLato(){
        return this.lato;
    }
    
    public void setLato(double lato){
        this.lato = lato;
    }
    
    public double perimetro(){
        double rit;
        rit= (this.lato*2)+this.baseMaggiore+this.baseMinore;
        return rit;
    }
    
    
    public double trovaH(){
        double rit;
        rit = Math.sqrt (this.lato*this.lato - Math.pow(((this.baseMaggiore-this.baseMinore)/2), 2));
        return rit;
    }
    
    public double area(){
        double rit;
        rit= (this.baseMaggiore+this.baseMinore)*TrapezioIsoscele.this.trovaH()/2;
        return rit;
    }
    
    public String info(){
        String rit;
        rit = "\n" + "base maggiore: " + this.baseMaggiore + "\n" + 
              "base minore  : " + this.baseMinore + "\n" +
              "lato         : " + this.lato + "\n"  + 
              "altezza      :" + TrapezioIsoscele.this.trovaH();
        return rit;
    }
    
    
    
    
}
