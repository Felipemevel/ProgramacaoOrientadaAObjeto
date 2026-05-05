package Lista01.C_Retangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo primeiroRetangulo = new Retangulo(3.0, 4.0);
        Retangulo segundoRetangulo = new Retangulo(5.0, 12.0);
        Retangulo terceiroRetangulo = new Retangulo(10.0, 10.0);
        Retangulo quartoRetangulo = new Retangulo(15.0, 30.0);
        Retangulo quintoRetangulo = new Retangulo(0.0, 50.0);
        Retangulo sextoRetangulo = new Retangulo();
        Retangulo setimoRetangulo = new Retangulo();

        System.out.println("<=======================================================");
        System.out.println("========== PRIMEIRO RETANGULO ==========");
        System.out.println(primeiroRetangulo);
        System.out.println("========== SEGUNDO RETANGULO ==========");
        System.out.println(segundoRetangulo);
        System.out.println("========== TERCEIRO RETANGULO ==========");
        System.out.println(terceiroRetangulo);
        System.out.println("========== QUARTO RETANGULO ==========");
        System.out.println(quartoRetangulo);
        System.out.println("========== QUINTO RETANGULO ==========");
        System.out.println(quintoRetangulo);
        System.out.println("=======================================================>");

        System.out.println("<=======================================================");
        sextoRetangulo.setB(-12.0);
        sextoRetangulo.setH(10.0);
        System.out.println("> Base: " + sextoRetangulo.getB());
        System.out.println("> Altura: " + sextoRetangulo.getH());

        setimoRetangulo.setB(10.0);
        setimoRetangulo.setH(-12.0);
        System.out.println("> Base: " + setimoRetangulo.getB());
        System.out.println("> Altura: " + setimoRetangulo.getH());
        System.out.println("=======================================================>");

    }
}
