package Sintaxe.Lista02.J_PreenchimentoDeVetorI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            n[i] = v;
            System.out.println("N[" + i + "] = " + n[i]);
            v *= 2;
        }

        scanner.close();
    }
}