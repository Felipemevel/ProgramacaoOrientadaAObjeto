package Sintaxe.Lista01.B_SomaSimples;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int soma(int a, int b){
        int x = a + b;
        return x;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();

        System.out.println("SOMA = " + soma(a, b));

    }

}