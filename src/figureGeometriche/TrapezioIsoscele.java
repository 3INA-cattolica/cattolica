
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
    
    
}
