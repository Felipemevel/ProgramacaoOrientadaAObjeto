package Lista03.A_TrocaEmVetorI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int aux = n[i];
            n[i] = n[19 - i];
            n[19 - i] = aux;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

        scanner.close();
    }
}