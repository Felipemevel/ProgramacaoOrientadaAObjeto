package Lista02.I_SubstituicaoEmVetorI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scanner.nextInt();

            if (x[i] <= 0) {
                x[i] = 1;
            }

            System.out.println("X[" + i + "] = " + x[i]);
        }

        scanner.close();
    }
}