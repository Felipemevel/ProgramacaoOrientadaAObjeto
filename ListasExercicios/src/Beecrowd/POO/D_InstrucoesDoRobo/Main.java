package POO.D_InstrucoesDoRobo;

import java.util.Scanner;

class Robo {
    private int posicao = 0;

    public int getPosicao(){
        return posicao;
    }
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    void movimentacao (String movimento){
        switch (movimento){
            case "LEFT":
                posicao -= 1;
                break;
            case "RIGHT":
                posicao += 1;
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        int numInstrucoes;

        Robo robozinho = new Robo();

        for (int i = 0; i < numCasos; i++){
            numInstrucoes = sc.nextInt();
            sc.nextLine();
            String[] listaPassos = new String[numInstrucoes];

            for (int j = 0; j < numInstrucoes; j++){
                String novoPasso = sc.nextLine();
                listaPassos[j] = novoPasso;

                if (novoPasso.startsWith("SAME AS ")){
                    int idx = Integer
                            .parseInt(novoPasso
                                    .substring(8)
                                    .trim());
                    listaPassos[j] = listaPassos[idx-1];
                } else {
                    listaPassos[j] = novoPasso;
                }
                robozinho.movimentacao(listaPassos[j]);
            }
            System.out.println(robozinho.getPosicao());
            robozinho.setPosicao(0);
        }
    }

}
