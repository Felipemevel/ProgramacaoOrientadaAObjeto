package Lista03.B_HistoricoDeNotas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void inserirNota(List<Double> historicoNotas, double nota){
        historicoNotas.add(nota);
    }

    public static double calcularMedia(List<Double> historicoNotas){
        double media;
        double soma = 0;
        int qtdNotas = 0;

        for (Double nota : historicoNotas) {
            qtdNotas += 1;
            soma += nota;
        }

        media = soma/qtdNotas;

        return media;
    }
    public static double maiorNota(List<Double> historicoNotas){
        double maiorNota = 0;

        for(Double nota : historicoNotas){
            if (nota > maiorNota){
                maiorNota = nota;
            }
        }
        return maiorNota;
    }
    public static double menorNota(List<Double> historicoNotas){
        double menorNota = historicoNotas.getFirst();

        for (Double nota : historicoNotas){
            if (nota < menorNota){
                menorNota = nota;
            }
        }
        return menorNota;
    }
    public static int notasAcimaMédia(List<Double> historicoNotas){
        int acimaMedia = 0;

        for (Double nota : historicoNotas){
            if (nota > 7.0){
                acimaMedia += 1;
            }
        }
        return acimaMedia;
    }


    public static void main(String[] args) {

        List<Double> historicoNotas = new ArrayList<>();

        inserirNota(historicoNotas, 5.8);
        inserirNota(historicoNotas, 9.2);
        inserirNota(historicoNotas, 8.9);
        inserirNota(historicoNotas, 7.1);
        inserirNota(historicoNotas, 10.0);
        inserirNota(historicoNotas, 4.2);

        System.out.println("Notas acima da média: " + notasAcimaMédia(historicoNotas));
        System.out.println("Maior nota: " + maiorNota(historicoNotas));
        System.out.println("Menor nota:  " + menorNota(historicoNotas));
        System.out.printf("Media: %.2f", calcularMedia(historicoNotas));
    }
}
