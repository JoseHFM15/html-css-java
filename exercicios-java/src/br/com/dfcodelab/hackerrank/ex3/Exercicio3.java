package br.com.dfcodelab.hackerrank.ex3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("digite o numero que deseja a tabuada: ");
        int num = numero.nextInt();
        int resultado;
        for (int i = 1; i <= 10 ; i++){
            resultado = num * i;
            System.out.println(num +" * "+ i +" = "+ resultado );
        }
    }
}
