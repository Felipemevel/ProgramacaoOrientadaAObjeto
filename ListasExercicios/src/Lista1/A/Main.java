public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(23);

        System.out.printf("Circulo: %.2f\n", circulo.calcularArea(circulo.raio, circulo.pi));
        System.out.printf("Diâmetro: %.2f\n", circulo.diametro(circulo.raio));
    }
}
