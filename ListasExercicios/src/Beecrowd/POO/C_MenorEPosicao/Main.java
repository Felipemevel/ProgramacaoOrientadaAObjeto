package POO.C_MenorEPosicao;

import java.util.Scanner;

class Vetor {
    private int[] lista;
    private int menor;
    private int posicaoDoMenor;

    public Vetor(){

    }
    public Vetor(int[] lista){
        this.lista = lista;
    }

    public void encontrarValorEPosicao(){
        int recordeMenor = lista[0];
        int idxMenor = 0;

        for (int i = 1; i < lista.length; i++){
            if (lista[i] < recordeMenor){
                recordeMenor = lista[i];
                idxMenor = i;

            }
        }

        System.out.println("Menor valor: " + recordeMenor + "\nPosicao: " + idxMenor);
    }

}



public class Main {

    public static int[] montarLista(int qtdElementosDaLista, Scanner sc){
        int[] listaMontada = new int[qtdElementosDaLista];

        for (int i = 0; i < qtdElementosDaLista; i++){
            listaMontada[i] = sc.nextInt();
        }

        return listaMontada;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdElementos = sc.nextInt();
        int[] lista = montarLista(qtdElementos, sc);

        Vetor novoVetor = new Vetor(lista);

        novoVetor.encontrarValorEPosicao();
    }

}
