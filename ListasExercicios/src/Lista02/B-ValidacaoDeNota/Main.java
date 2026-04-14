import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double notasValidas = 0;
        List<Double> notas = new ArrayList<>();
        double media = 0;

        while (notasValidas < 2){

            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            if (nota1 >= 0
            && nota1 <= 10){
                notas.add(nota1);
                notasValidas += 1;
            } else {
                System.out.println("nota invalida");
            }

            if (nota2 >= 0
            && nota2 <= 10){
                notas.add(nota2);
                notasValidas += 1;
            } else {
                System.out.println("nota invalida");
            }


        }

        if (notas.size() >= 3){
            notas.remove(0);
        }

        double soma = 0;
        for (double valor : notas){
            soma += valor;
        }

        media = soma/2;
        System.out.printf("media = %.2f\n", media);

    }
}
