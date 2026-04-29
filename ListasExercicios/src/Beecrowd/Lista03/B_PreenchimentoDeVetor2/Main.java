package Lista03.B_PreenchimentoDeVetor2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[1000];

        for (int i = 0; i < 1000; i++) {
            n[i] = i % t;
            System.out.println("N[" + i + "] = " + n[i]);
        }

        scanner.close();
    }
}