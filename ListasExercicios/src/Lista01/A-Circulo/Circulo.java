public class Circulo {

    public static final double pi = 3.14;
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(double raio, double pi){
        return pi*(Math.pow(raio, 2));
    }

    public double diametro(double raio){
        return raio*2;
    }
}
