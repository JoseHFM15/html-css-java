package br.com.dfcodelab.section.um.missaodominar;



import java.util.Scanner;

import static java.lang.Math.*;

public class Ex06 {
            public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

                System.out.println("digite a base: ");
                int base = input.nextInt();

                System.out.println("digite o expoente: ");
                int exp = input.nextInt();

                double resultado = (int) pow(base,exp);

                System.out.println("o resultado é: " + resultado);


            }
        }

