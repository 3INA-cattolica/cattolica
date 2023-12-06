/*
Dati i dati di un triangolo, stabilire il tipo, perimetro e area
dati tre segmenti qualsiasi(a,b,c) è possibile costruire un triangolo solo se la lunghezza do ciascuno è minore della somma degli alri due
*/
package figureGeometriche;

public class Triangolo {
    final private double NF_TE;
    private double l1;
    private double l2;
    private double l3;
    private String unitaMisura;

    public Triangolo() {
        NF_TE= 0.289;
        unitaMisura = "";
    }
    
    public Triangolo(double l1, double l2, double l3) {
        this();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        
    }

    public double getNF_TE() {
        return NF_TE;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
    
    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }
    
    public String info(){
        String testo;
        testo = "\n" + "l1: " + this.l1 + "\n" +
                "l2: " + this.l2 + "\n" +
                "l3: " + this.l3 + "\n";
        return testo;
    }
    
    public double perimetro(){
        double rit=0;
        if(tipo().equals("equilatero")||tipo().equals("isoscele")||tipo().equals("scaleno"))
            rit = this.l1 + this.l2 +this.l3;   
        return rit;
    }
    
    public double area(){
        double rit = 0;
        if(tipo().equals("equilatero")||tipo().equals("isoscele")||tipo().equals("scaleno")){
            double sp = perimetro()/2;
            rit = Math.sqrt(sp*(sp -l1)*(sp-l2)*(sp-l3));
        }
        
        return rit;
    }
    
    public String tipo(){
        String tipo = "";
        
        if((l1 == l2)&&((l1 == l3)))
            tipo = "equilatero";
        
        if((l1 != l2)&&((l1 != l3))&&((l2!=l3)))
            tipo = "scaleno";
        
        if((l1 == l2 && l2!=l3)||((l1 == l3 && l1!=l2))||(l3 == l2 && l3!=l1))
            tipo = "isoscele";
        return tipo;
    }

    public String tipoV2(){
        String tipo ;
        
        if((l1 == l2)&&((l1 == l3)))
            tipo = "equilatero";
            else
                if((l1 == l2 && l2!=l3)||((l1 == l3 && l1!=l2))||(l3 == l2 && l3!=l1))
                    tipo = "isoscele";
                        else
                            tipo = "scaleno";
        
        return tipo;
    }
    
    public boolean isTriangolo(){
        boolean v = false;
        if((l2+l3>l1)&&(l2< l3+l1)&&(l3<l1+l2))
            v=true;
        return v;
    }
    
    public double apotema(){
        double rit;
        if(tipo().equals("equilatero"))
            rit = l1*NF_TE;
        else
            rit=0;
        return rit;
    }
    
    public double altezza(){
        double rit;
        rit = apotema()*2;
        return rit;
    }
    
}
