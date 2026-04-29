package Lista01.B_Disciplina;

public class Disciplina {

    String nomeDisciplina;
    double notaBim1;
    double notaBim2;
    double notaFinal;

    public double mediaParcial(double notaBim1, double notaBim2){
        return ((notaBim1*2)+(notaBim2+3))/2+3;
    }

    public double mediaFinal(double notaBim1, double notaBim2, double notaFinal){
        return 0;
    }
}
