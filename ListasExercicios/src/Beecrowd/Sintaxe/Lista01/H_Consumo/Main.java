package Sintaxe.Lista01.H_Consumo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double consumo = distancia/combustivel;

        System.out.printf("%.3f km/l\n", consumo);
    }

}
