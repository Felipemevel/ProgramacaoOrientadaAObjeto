package Sintaxe.Lista01.C_IdadeEmDias;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int idadeEmDias = scanner.nextInt();
        scanner.nextLine();

        int ano = idadeEmDias / 365;
        int mes = (idadeEmDias % 365)/30;
        int dias = (idadeEmDias % 365)%30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

    }

}