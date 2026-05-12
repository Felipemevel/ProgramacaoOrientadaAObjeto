package POO.B_LED;

import java.util.ArrayList;
import java.util.Scanner;

class Led {
    private char id;
    private int leds;

    public Led(){

    }

    public Led(char id, int leds){
        this.id = id;
        this.leds = leds;
    }

    public int getLeds() {
        return leds;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaPainel = new ArrayList<>();
        ArrayList<Led> ledsNums = new ArrayList<>();

        int qtdOperacoes = sc.nextInt();
        sc.nextLine();
        int[] qtdLeds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < qtdLeds.length; i++){
            char idTemp = (char) i;
            ledsNums.add(new Led(idTemp, qtdLeds[i]));
        }
        while(qtdOperacoes != 0){
            String painel = sc.nextLine();
            int ledsTotais = 0;

            for (int i = 0; i < painel.length(); i++){
                char algarismo = painel.charAt(i);
                int indice = algarismo - '0';
                ledsTotais += ledsNums.get(indice).getLeds();
            }
            System.out.println(ledsTotais + " leds");
            qtdOperacoes--;
        }
    }
}
