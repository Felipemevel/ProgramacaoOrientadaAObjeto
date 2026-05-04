package Lista01.D_EquacaoSegundoGrau;

public class CalculoEquacao {

    private double a;
    private double b;
    private double c;

    public CalculoEquacao (){

    }

    public CalculoEquacao (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta(){
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public double calcX1(){
        double delta = delta();

        double x1 = ((-b+Math.sqrt(delta))/(2*a));
        return x1;
    }

    public double calcX2(){
        double delta = delta();

        double x2 = ((-b-Math.sqrt(delta)/(2*a)));
        return x2;
    }

    public double[] raizesReais(){
        double x1 = calcX1();
        double x2 = calcX2();
        double[] raizes = new double[2];

        raizes[0] = x1;
        raizes[1] = x2;

        return raizes;
    }

    @Override
    public String toString() {
        int formatacaoA = (int) Math.round(a);
        int formatacaoB = (int) Math.round(b);
        int formatacaoC = (int) Math.round(c);
        return formatacaoA + "x² + " + formatacaoB + "x + " + formatacaoC + " = 0";
    }
}
