package POO.E_2048;

import java.util.Scanner;
import java.util.Vector;

class Jogo {
    int[][] gradeJogo;

    public Jogo(){

    }
    public Jogo(int[][] gradeJogo){
        this.gradeJogo = gradeJogo;
    }

    public Vector<String> testarMovimentacao(){
        Vector<String> movimentos = new Vector<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gradeJogo[i][j] == 2048) {
                    movimentos.add("NONE");
                    return movimentos;
                }
            }
        }

        if (down()){movimentos.add("DOWN");}
        if (left()){movimentos.add("LEFT");}
        if (right()){movimentos.add("RIGHT");}
        if (up()){movimentos.add("UP");}

        if(movimentos.isEmpty()){movimentos.add("NONE");}

        return movimentos;
    }

    public boolean down(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (gradeJogo[i+1][j] == 0 && gradeJogo[i][j] > 0) {
                    return true;
                }
                if (gradeJogo[i][j] > 0 && gradeJogo[i][j] == gradeJogo[i+1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean up(){
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gradeJogo[i-1][j] == 0 && gradeJogo[i][j] > 0) {
                    return true;
                }
                if (gradeJogo[i][j] > 0 && gradeJogo[i][j] == gradeJogo[i-1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean right(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (gradeJogo[i][j+1] == 0 && gradeJogo[i][j] > 0) {
                    return true;
                }
                if (gradeJogo[i][j] > 0 && gradeJogo[i][j] == gradeJogo[i][j+1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean left(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (gradeJogo[i][j-1] == 0 && gradeJogo[i][j] > 0) {
                    return true;
                }
                if (gradeJogo[i][j] > 0 && gradeJogo[i][j] == gradeJogo[i][j-1]) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        if (!sc.hasNextInt()) return;
        int qtdJogos = sc.nextInt();

        while (qtdJogos != 0){
            int[][] gradeJogo = new int[4][4];
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    gradeJogo[i][j] = sc.nextInt();
                }
            }
            Jogo jogo = new Jogo(gradeJogo);
            System.out.println(String.join(" ", jogo.testarMovimentacao()));
            qtdJogos--;
        }
        sc.close();
    }
}