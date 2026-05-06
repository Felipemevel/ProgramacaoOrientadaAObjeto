package Sintaxe.Lista02.D_Tuitando;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        if (texto.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }

        scanner.close();

    }
}
