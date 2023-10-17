package figureGeometriche;

public class TriangoloScaleno {
    private double l1;
    private double l2;
    private double l3;
     
    public TriangoloScaleno(double l1,double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    public double getL1(){
        return this.l1;
    }
    
    public void setL1(double l1){
        this.l1 = l1;
    }
    
    public double getL2(){
        return this.l2;
    }
    
    public void setL2(double l2){
        this.l2 = l2;
    }
    
    public double getL3(){
        return this.l3;
    }
    
    public void setL3(double l3){
        this.l3 = l3;
    }
    
    public double perimetro(){
        double rit;
        rit= l1+l2+l3;
        return rit;
    }
    
    public double area(){
        double rit;
        rit = Math.sqrt(TriangoloScaleno.this.perimetro()/2*(TriangoloScaleno.this.perimetro()/2 -l1)*(TriangoloScaleno.this.perimetro()/2-l2)*(TriangoloScaleno.this.perimetro()/2-l3));
        return rit;
    }
    
    public double trovaAltezza(){
        double rit;
        rit= TriangoloScaleno.this.area() *2 / l1;
        return rit;
        
    }
    
    public String info(){
        String rit;
        rit = "\n" + "primo lato        : " + this.l1 + "\n" + 
              "secondo lato      : " + this.l2 + "\n" +
              "terzo lato        : " + this.l3 ;
        return rit;
    }
    //informazioni della classe
    
    
}
