import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        while(true){

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();


            if(x1+x2+y1+y2 == 0){
                break;
            }

            if(x1 == x2 && y1 == y2){
                System.out.println(0);
            } else if (x1 == x2 ||
                    y1 == y2 ||
                    (x1 + y1) == (x2 + y2) ||
                    Math.abs(x1-x2) == Math.abs(y1-y2)){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

    }

}
