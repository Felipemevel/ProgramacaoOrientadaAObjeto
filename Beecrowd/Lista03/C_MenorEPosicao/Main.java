package Lista03.C_MenorEPosicao;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int menor = Integer.MAX_VALUE;
        int posicao = 0;

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        scanner.close();
    }
}