package Sintaxe.Lista01.F_OMaior;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static int maior(int a, int b, int c){
        int maiorAB = ((a+b + Math.abs(a-b))/2);
        int maiorNum = ((maiorAB+c + Math.abs(maiorAB-c))/2);
        return maiorNum;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(maior(a, b, c) + " eh o maior");
    }

}
