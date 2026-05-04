package Lista01.B_Disciplina;

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
        return ((notaBim1*2)+(notaBim2*3))/(2+3);
    }

    public double mediaFinal(double notaBim1, double notaBim2, double notaFinal){
        return (mediaParcial(notaBim1, notaBim2)+(notaFinal))/2;
    }

    public boolean testeAprovacao() {
        double mp = mediaParcial(notaBim1, notaBim2);

        if (this.notaFinal == 0) {
            return mp >= 60;
        }

        return mediaFinal(notaBim1, notaBim2, notaFinal) >= 60;
    }


}
