package Lista02.E_LED;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < n; i++) {
            String valor = scanner.next();
            int totalLeds = 0;

            for (int j = 0; j < valor.length(); j++) {
                int digito = valor.charAt(j) - '0';
                totalLeds += ledsPorDigito[digito];
            }

            System.out.println(totalLeds + " leds");
        }

        scanner.close();
    }
}