package Lista03.A_AgendaTarefas;

public class Tarefa {

    String descricao;
    int prioridade;

    public Tarefa(){}
    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "| Tarefa: "
                + descricao
                + " --- Prioridade: "
                + prioridade;
    }
}
