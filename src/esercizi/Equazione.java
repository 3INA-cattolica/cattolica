package esercizi;


public class Equazione {
    private double a;
    private double b;
    private double x;
   
    public Equazione() {
       
    }
       
    public Equazione(double a, double b, double x) {
        this.a =a;
        this.b =b;
        this.x =x;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
   
    public String equazione1 () {
        String testo1 = "";

        if(a>0){
            testo1 = "" + b/a ;
        }
        if(a == 0 && b== 0){
            testo1= "indeterminata";
        }
        if ((a == 0) && (b != 0 )) {
            testo1 = "impossibile";
        }
           
        return testo1;
    }
   
        public String info() {
        String testo;
       
        testo = "\n" + "a  : " + a  + "\n" + 
                "b  : " + b  + "\n" +
                "x  : " + x  ;
       
        return testo;
       
    }
       
   
}
