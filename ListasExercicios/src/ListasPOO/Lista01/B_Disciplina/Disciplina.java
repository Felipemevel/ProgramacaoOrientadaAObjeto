package Lista01.B_Disciplina;

import java.util.Scanner;

public class Disciplina {

    String nomeDisciplina;
    double notaBim1;
    double notaBim2;
    double notaFinal;

    public Disciplina (String nomeDisciplina, double notaBim1, double notaBim2){
        this.nomeDisciplina = nomeDisciplina;
        this.notaBim1 = notaBim1;
        this.notaBim2 = notaBim2;
    }

    public double mediaParcial(double notaBim1, double notaBim2){
        return ((notaBim1*2)+(notaBim2+3))/2+3;
    }

    public double mediaFinal(double notaBim1, double notaBim2, double notaFinal){
        return (mediaParcial(notaBim1, notaBim2)+(notaFinal))/2;
    }

    public boolean testeAprovacao(){
        double mediaParcial = mediaParcial(notaBim1, notaBim2);
        double mediaFinal = mediaFinal(notaBim1, notaBim2, notaFinal);

        if(mediaParcial < 60){
            return true;
        } else if (mediaFinal < 60){
            return false;
        } else {
            return false;
        }

    }
}
