package Sintaxe.Lista02.C_SenhaFixa;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int tentativaSenha = sc.nextInt();

        while(tentativaSenha != senha){
            System.out.println("Senha Invalida");
            tentativaSenha = sc.nextInt();

        }

        System.out.println("Acesso Permitido");


    }

}