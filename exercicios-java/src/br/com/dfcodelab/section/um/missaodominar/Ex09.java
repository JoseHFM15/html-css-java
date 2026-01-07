package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite a altura do triangulo: ");
        double altura = input.nextDouble();

        System.out.println("digite a base do triangulo: ");
        double base = input.nextDouble();

        double area = base * altura / 2;

        System.out.println("a area do triangulo é: " + area);
    }
}

