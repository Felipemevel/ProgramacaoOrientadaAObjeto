package Lista03.AgendaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

class Main{

    public static void exibirTarefas(List<Tarefa> agendaTarefa){
        if (agendaTarefa.isEmpty()){
            System.out.println("A agenda está vazia! :0");
            return;
        }
        System.out.println("================AGENDA==================");
        for (Tarefa x : agendaTarefa){
            System.out.println(x);
        }
        System.out.println("========================================");
    }

    public static void removerTarefa(List<Tarefa> agenda, String descricao){
        for (Tarefa x: agenda){
            if (x.getDescricao().equals(descricao)){
                agenda.remove(x);
                System.out.println(">>> Tarefa removida com sucesso!");
                return;
            }
        }
        System.out.println("Não foi encontrada tarefa com esta descrição.");
    }

    public static void maiorPrioridade(List<Tarefa> agenda){
        List<Tarefa> maioresPrioridades = new ArrayList<>();

        OptionalInt maior = agenda.stream()
                .mapToInt(Tarefa::getPrioridade)
                .max();
        if (maior.isPresent()){
            int maiorValorInt = maior.getAsInt();

            for (Tarefa x : agenda){
                if (x.getPrioridade() == maiorValorInt){
                    maioresPrioridades.add(x);
                }
            }
        }
        for (Tarefa x : maioresPrioridades){
            System.out.println(x);
        }
    }

    public static void adicionarTarefa(List<Tarefa> agenda, Tarefa tarefa){
        agenda.add(tarefa);
        System.out.println(">>> Tarefa adicionada com sucesso!");
    }


    public static void tamanhoAgenda(List<Tarefa> agenda){
        System.out.println("A agenda tem " + agenda.size() + " tarefas!");
    }

    public static void main(String[] args) {

        ArrayList<Tarefa> agendaTarefas = new ArrayList<>();

        Tarefa tarefaUm = new Tarefa("Lavar louça", 3);
        Tarefa tarefaDois = new Tarefa("Derrotar o Grande Mal", 5);
        Tarefa tarefaTres = new Tarefa("Pagar conta", 1);
        Tarefa tarefaQuatro = new Tarefa("Passear com o cachorro", 5);

        agendaTarefas.addAll(List.of(tarefaUm, tarefaDois, tarefaTres, tarefaQuatro));

        exibirTarefas(agendaTarefas);
        maiorPrioridade(agendaTarefas);
        adicionarTarefa(agendaTarefas, new Tarefa("Derrotar o Bem", 5));
        removerTarefa(agendaTarefas, "Derrotar o Grande Mal");
        exibirTarefas(agendaTarefas);
        maiorPrioridade(agendaTarefas);
    }
}
