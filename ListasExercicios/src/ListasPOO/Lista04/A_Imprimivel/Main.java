package Lista04.A_Imprimivel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa felipe = new Pessoa("Felipe", 21);
        Pessoa rafael = new Pessoa("Rafael", 29);

        Livro livro1 = new Livro("William Shakespeare", "Hamlet ");
        Livro livro2 = new Livro("Antoine de Saint-Exupéry", "O Pequeno Príncipe");

        List<Imprimivel> lista = new ArrayList<>(List.of(felipe, rafael, livro1, livro2));

        System.out.println("<====================================");
        for (Imprimivel x : lista){
            x.imprimir();
        }
        System.out.println("====================================>");


    }
}
