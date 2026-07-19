package br.com.dfcodelab.section.dois.missaodominar.ex6;

public class Test6 {
    public static void main(String[] args) {
        // Criando alunos (apenas com nome)
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        // Gerando matrículas
        aluno1.GerarMatriculas();
        aluno2.GerarMatriculas();
        aluno3.GerarMatriculas();

        // Mostrando os dados
        System.out.println("Aluno 1: " + aluno1.getnome() + " - Matrícula: " + aluno1.getMatricula());
        System.out.println("Aluno 2: " + aluno2.getnome() + " - Matrícula: " + aluno2.getMatricula());
        System.out.println("Aluno 3: " + aluno3.getnome() + " - Matrícula: " + aluno3.getMatricula());
    }
}

