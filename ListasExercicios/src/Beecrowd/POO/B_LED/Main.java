package POO.B_LED;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Led {
    private int id;
    private int leds;

    public Led(){

    }

    public Led(int id, int leds){
        this.id = id;
        this.leds = leds;
    }

    public int getLeds() {
        return leds;
    }
}

public class Main {

    public static List<Integer> dividirInput(int painel, List<Integer> listaPainel){
        if (painel < 10){
            listaPainel.add(painel);
        } else {
            dividirInput((painel / 10), listaPainel);
            listaPainel.add(painel % 10);
        }
        return listaPainel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaPainel = new ArrayList<>();
        ArrayList<Led> ledsNums = new ArrayList<>();

        int qtdOperacoes = sc.nextInt();
        int[] qtdLeds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};



        for (int i = 0; i < qtdLeds.length; i++){
            ledsNums.add(new Led(i, qtdLeds[i]));
        }
        while (qtdOperacoes != 0){
            int painel = sc.nextInt();
            listaPainel.clear();

            dividirInput(painel, listaPainel);
            int totalLeds = 0;



            for (int i = 0; i < listaPainel.size(); i++){
                int digito = listaPainel.get(i);
                totalLeds += ledsNums.get(digito).getLeds();
            }
            System.out.println(totalLeds + " leds");
            qtdOperacoes--;

        }
    }
}
