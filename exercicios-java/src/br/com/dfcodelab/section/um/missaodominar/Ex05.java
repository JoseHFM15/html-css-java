package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor de a:");
        int a = input.nextInt();
        System.out.println("digite o valor de b:");
        int b = input.nextInt();
        System.out.println("digite o valor de c:");
        int c = input.nextInt();
        System.out.println(a + "x + " + b + "=" + c);
        float x = (float) (c - b) / a;
        System.out.println("o valor de x é:" + x );


    }
}
