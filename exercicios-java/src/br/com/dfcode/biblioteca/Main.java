package br.com.dfcode.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0) {

            System.out.println("===== SISTEMA DE BIBLIOTECA DFCODE =====");
            System.out.println(" ");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar revista");
            System.out.println("3 - Cadastrar aluno");
            System.out.println("4 - Cadastrar professor");
            System.out.println("5 - Listar todos os itens");
            System.out.println("6 - Listar itens indisponiveis");
            System.out.println("7 - Realizar emprestimo");
            System.out.println("8 - Realizar devolução");
            System.out.println("9 - Listar emprestimos ativos");
            System.out.println("10 - Gerar relatorio");
            System.out.println("0 - sair");

            System.out.println("Digite alguma das opções acima:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:

            }
        }
    }

}
