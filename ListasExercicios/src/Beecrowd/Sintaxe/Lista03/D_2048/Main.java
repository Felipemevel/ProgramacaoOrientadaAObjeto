package Sintaxe.Lista03.D_2048;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int k = 0; k < n; k++) {
                int[][] board = new int[4][4];
                boolean has2048 = false;

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        board[i][j] = scanner.nextInt();
                        if (board[i][j] == 2048) {
                            has2048 = true;
                        }
                    }
                }

                if (has2048) {
                    System.out.println("NONE");
                    continue;
                }

                boolean canDown = false;
                boolean canLeft = false;
                boolean canRight = false;
                boolean canUp = false;

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (board[i][j] != 0) {
                            if (i < 3 && (board[i + 1][j] == 0 || board[i + 1][j] == board[i][j])) {
                                canDown = true;
                            }
                            if (j > 0 && (board[i][j - 1] == 0 || board[i][j - 1] == board[i][j])) {
                                canLeft = true;
                            }
                            if (j < 3 && (board[i][j + 1] == 0 || board[i][j + 1] == board[i][j])) {
                                canRight = true;
                            }
                            if (i > 0 && (board[i - 1][j] == 0 || board[i - 1][j] == board[i][j])) {
                                canUp = true;
                            }
                        }
                    }
                }

                StringBuilder sb = new StringBuilder();
                if (canDown) sb.append("DOWN ");
                if (canLeft) sb.append("LEFT ");
                if (canRight) sb.append("RIGHT ");
                if (canUp) sb.append("UP ");

                if (sb.length() == 0) {
                    System.out.println("NONE");
                } else {
                    System.out.println(sb.toString().trim());
                }
            }
        }

        scanner.close();
    }
}