package Lista04.A_Imprimivel;

public class Livro implements  Imprimivel{

    private String autor;
    private String titulo;

    public Livro(){}
    public Livro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public void imprimir(){
        System.out.println("Título do Livro: " +
                titulo +
                " Autor: " +
                autor);
    }
}
