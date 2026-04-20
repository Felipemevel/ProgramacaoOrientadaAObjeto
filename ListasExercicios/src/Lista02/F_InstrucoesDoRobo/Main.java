package Lista02.F_InstrucoesDoRobo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            for (int k = 0; k < t; k++) {
                int n = scanner.nextInt();
                int[] instrucoes = new int[n + 1];
                int posicao = 0;

                for (int i = 1; i <= n; i++) {
                    String comando = scanner.next();

                    if (comando.equals("LEFT")) {
                        instrucoes[i] = -1;
                    } else if (comando.equals("RIGHT")) {
                        instrucoes[i] = 1;
                    } else if (comando.equals("SAME")) {
                        scanner.next();
                        int indice = scanner.nextInt();
                        instrucoes[i] = instrucoes[indice];
                    }

                    posicao += instrucoes[i];
                }

                System.out.println(posicao);
            }
        }

        scanner.close();
    }
}