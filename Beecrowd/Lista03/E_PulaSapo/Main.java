package Lista03.E_PulaSapo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int p = scanner.nextInt();
            int n = scanner.nextInt();

            int[] canos = new int[n];
            for (int i = 0; i < n; i++) {
                canos[i] = scanner.nextInt();
            }

            boolean win = true;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(canos[i + 1] - canos[i]) > p) {
                    win = false;
                    break;
                }
            }

            if (win) {
                System.out.println("YOU WIN");
            } else {
                System.out.println("GAME OVER");
            }
        }

        scanner.close();
    }
}