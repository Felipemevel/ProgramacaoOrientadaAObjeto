package Lista02.B_EventoParticipantes;

import java.util.Objects;

public class Participante{

    private String cpf;
    private String nome;
    private String email;

    public Participante(){}

    public Participante(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public String toString(){
        return "| Nome: "
                + nome
                + " - E-mail: "
                + email
                + " - CPF: "
                + cpf;
    }
}
