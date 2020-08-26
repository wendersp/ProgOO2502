package aula01;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno01.nome = "Joao";
        aluno01.nota01 = 5.0;
        aluno01.nota02 = 8.8;
        aluno01.nota03 = 3.0;
        aluno01.nota04 = 10.0;

        aluno02.nome = "Maria";
        aluno02.nota01 = 8.0;
        aluno02.nota02 = 8.8;
        aluno02.nota03 = 9.0;
        aluno02.nota04 = 10.0;

        aluno01.calcMedia();
        aluno02.calcMedia();

        aluno01.imprimirMedia();
        aluno02.imprimirMedia();

    }

}
