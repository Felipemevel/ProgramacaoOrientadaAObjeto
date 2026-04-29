package Lista02.A_SequenciaIJ2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int i = 1;
        int j = 7;

        while (true) {

            System.out.printf("I=%d J=%d\n", i, j);
            j--;

            if(j == 4){
                i+=2;
                j = 7;
            }

            if (i >= 10){
                break;
            }
        }

    }

}
