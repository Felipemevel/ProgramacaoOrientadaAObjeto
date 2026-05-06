package Sintaxe.Lista02.H_PegadinhadeEvergreen;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int k = 0; k < n; k++) {
                String l1 = scanner.nextLine();
                String l2 = scanner.nextLine();
                StringBuilder res = new StringBuilder();

                for (int i = 0; i < l1.length(); i += 2) {
                    res.append(l1.charAt(i));

                    if (i + 1 < l1.length()) {
                        res.append(l1.charAt(i + 1));
                    }

                    if (i < l2.length()) {
                        res.append(l2.charAt(i));
                    }

                    if (i + 1 < l2.length()) {
                        res.append(l2.charAt(i + 1));
                    }
                }

                System.out.println(res.toString());
            }
        }

        scanner.close();
    }
}