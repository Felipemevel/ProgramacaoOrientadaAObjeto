package POO.A_Lanche;

import java.util.Scanner;

class Lanche {

    int qtd;
    int codigo;
    double valor;
    String nome;

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public int getQtd(){
        return qtd;
    }

    public Lanche(){

    }

    public Lanche(int codigo, double valor, String nome){
        this.codigo = codigo;
        this.valor = valor;
        this.nome = nome;
    }

    public double calcPagamento(){
        return qtd*valor;
    }

    public String toString(){
        return String.format("Total: R$ %.2f", calcPagamento());
    }


}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Lanche cachorroQuente = new Lanche(1, 4.0, "Cachorro Quente");
       Lanche xSalada = new Lanche(2, 4.50, "X-Salada");
       Lanche xBacon = new Lanche(3, 5.0, "X-Bacon");
       Lanche torradaSimples = new Lanche(4, 2.0, "Torrada Simples");
       Lanche refrigerante = new Lanche(5, 1.50, "Refrigerante");

       int option = sc.nextInt();


        switch(option){
            case 1:
                cachorroQuente.setQtd(sc.nextInt());
                System.out.println(cachorroQuente);
                break;
            case 2:
                xSalada.setQtd(sc.nextInt());
                System.out.println(xSalada);
                break;
            case 3:
                xBacon.setQtd(sc.nextInt());
                System.out.println(xBacon);
                break;
            case 4:
                torradaSimples.setQtd(sc.nextInt());
                System.out.println(torradaSimples);
                break;
            case 5:
                refrigerante.setQtd(sc.nextInt());
                System.out.println(refrigerante);
                break;
            default:
                System.out.println("Pedido inválido!");
        }
    }
}

