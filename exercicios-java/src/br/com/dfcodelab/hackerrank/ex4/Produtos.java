package br.com.dfcodelab.hackerrank.ex4;

import java.util.Scanner;

public class Produtos {
static Scanner sc = new Scanner(System.in);
private String prod;
private int cod;

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Produtos(String prod, int cod){
        this.prod = prod;
        this.cod = cod;

    }

    public static void criarArray(Produtos[] produ) {

        for (int i = 0; i < produ.length ; i++){

            System.out.println("digite um produto");
            String nome = sc.nextLine().toLowerCase();
            produ[i] = new Produtos(nome, i);
            System.out.println("produto cadastrado com sucesso codigo de busca: "+ produ[i].getCod());



        }
    }
    public static void procurarItemNoArray(Produtos[] produ){
        System.out.println("digite uma das opções abaixo");
        System.out.println("1- procurar por codigo");
        System.out.println("2- procurar por nome");
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1){
                System.out.println("digite o codigo do produto que deseja procurar");
                int proc = sc.nextInt();
                sc.nextLine();
            if (proc >= 0 && proc < produ.length){
                System.out.println("Produto encontrado! " + produ[proc].getProd() );
            }else {
                System.out.println("codigo invalido digite novamente!");
            }
        } else if (opcao == 2) {
            System.out.println("digite o nome do produto que deseja procurar");

            String proc = sc.nextLine().toLowerCase();
            boolean enc = false;
            int i = 0;
            for (; i < produ.length ; i++) {
                if (produ[i].getProd().equals(proc)){
                    System.out.println("produto encontrado! nome: "+ produ[i].getProd()+" codigo: "+ produ[i].getCod());
                   enc = true;
                   break;
                }


            }

            if (!enc){
                System.out.println("Produto não foi encontrado!");
            }
        }else {
            System.out.println("erro opção inválida");
        }
    }

}
