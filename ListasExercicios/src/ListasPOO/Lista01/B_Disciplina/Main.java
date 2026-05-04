package Lista01.B_Disciplina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o nome da disciplina: \n");
        String nome = scanner.nextLine();
        scanner.nextLine();
        System.out.printf("Digite a nota do primeiro bimestre: \n");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Digite a nota do segundo bimestre: \n");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();

        Disciplina disciplina = new Disciplina(nome, nota1, nota2);

        if (!disciplina.testeAprovacao()){
            System.out.println("Nota abaixo da média: " + disciplina.mediaParcial(nota1, nota2));
            System.out.printf("Digite a nota da prova final: ");
            double notaFinal = scanner.nextDouble();
            disciplina.notaFinal = notaFinal;
            if (!disciplina.testeAprovacao()){
                System.out.println("==== REPROVADO ====");
                System.out.println("= Nota: " + disciplina.mediaFinal(nota1, nota2, notaFinal));
                System.out.println("===================");
            } else {
                System.out.println("==== APROVADO ====");
                System.out.println("= Nota: " + disciplina.mediaFinal(nota1, nota2, notaFinal));
                System.out.println("==================");
            }
        } else {
            System.out.println("==== APROVADO ====");
            System.out.println("= Nota: " + disciplina.mediaParcial(nota1, nota2));
            System.out.println("==================");
        }
    }
}
