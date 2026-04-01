import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static double delta(double a, double b, double c){
        return (b*b) - 4*a*c;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1 = (-b + Math.sqrt(delta(a, b, c)))/(2*a);
        double x2 = (-b - Math.sqrt(delta(a, b, c)))/(2*a);

        if (delta(a, b, c) < 0 || a == 0){
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
    }

}
