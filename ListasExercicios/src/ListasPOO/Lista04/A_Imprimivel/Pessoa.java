package Lista04.A_Imprimivel;

public class Pessoa implements Imprimivel{

    private String nome;
    private int idade;

    public Pessoa(){}
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void imprimir(){
        System.out.println("Nome: " +
                nome +
                " Idade: ");
    }
}
