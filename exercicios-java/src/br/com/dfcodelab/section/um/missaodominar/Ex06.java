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

<<<<<<< HEAD
                double resultado = (int) pow(base,exp);

                System.out.println("o resultado é: " + resultado);

=======
                int resultado = 1;

                for (int i = 0; i < exp; i++) {

                    resultado *= base;;
                    System.out.println("o resultado é:" + resultado);

                }
>>>>>>> 5829068d91a973f8bd3cf6c052c2e1599554b09e

            }
        }


