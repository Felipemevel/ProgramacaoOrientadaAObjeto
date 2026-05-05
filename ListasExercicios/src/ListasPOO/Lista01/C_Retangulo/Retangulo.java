package Lista01.C_Retangulo;

public class Retangulo {
    private double b;
    private double h;

    public Retangulo(){

    }

    public Retangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public void setB (double b){
        if (b >= 0){
            this.b = b;
        } else {
            System.out.println("Valor inválido! Digite um valor positivo.");
        }
    }

    public void setH (double h){
        if (h >= 0){
            this.h = h;
        } else {
            System.out.println("Valor inválido! Digite um valor positivo.");
        }
    }

    public double getB (){
        return this.b;
    }

    public double getH (){
        return this.h;
    }

    public double calcArea(){
        return b*h;
    }

    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2)));
    }

    public String toString(){
        return "Base: " + b + " \nAltura: " + h + "\nÁrea: " + calcArea() + "\nDiagonal: " + calcDiagonal();
    }
}
