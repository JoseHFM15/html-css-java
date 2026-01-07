package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a altura do retangulo: ");
        double altura = input.nextDouble();
        System.out.println("digite a base do retangulo: ");
        double base = input.nextDouble();
        double area = (base * altura);
        double perimetro = (altura * 2) + (base * 2);
        System.out.println("a area do retangulo é: " + area);
        System.out.println("o perimetro do retangulo é: " + perimetro);
    }
}
