package Lista02.B_EventoParticipantes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{

    static void addParticipante(Set<Participante> participanteSet,
                                String cpf,
                                String nome,
                                String email){
        Participante participante = new Participante(cpf, nome, email);
        participanteSet.add(participante);
    }

    static void exibirParticipantes(Set<Participante> participanteSet){
        for(Participante x : participanteSet){
            System.out.println(x);
        }
    }
    
    static Participante buscarParticipante(String cpf, Set<Participante> participanteSet){
        for (Participante x : participanteSet){
            if (x.getCpf().equals(cpf)){
                return x;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Set<Participante> participanteSet = new HashSet<>();

        Participante felipe = new Participante("123.345.789-10", "Felipe Nascimento", "felipe@gmail.com");
        Participante jhonata = new Participante("111.213.141-30", "Jhonata Freitas", "jhonata@gmail.com");
        Participante gustavo = new Participante("114.523.364-63", "Gustavo Jacome", "gustavo@gmail.com");
        participanteSet.addAll(List.of(felipe, jhonata, gustavo));

        addParticipante(participanteSet, "128.933.321-80", "Guilherme Briggs", "cabecinha@gmail.com");
        System.out.println(buscarParticipante("128.933.321-80", participanteSet));
        exibirParticipantes(participanteSet);
    }
}
