package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor do produto: ");
        double valor = ler.nextDouble();
        System.out.println("digite o valor do desconto: ");
        int desconto = ler.nextInt();
        double valdesc = desconto * valor / 100;
        System.out.println("o valor do desconto é: " + valdesc);

        double valCDesc = valor - valdesc;
        System.out.println("o valor com desconto é: " + valCDesc);

    }
}
