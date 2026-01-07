package br.com.dfcodelab.section.um.missaodominar;



import java.util.Scanner;

        public class ex06 {
            public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

                System.out.println("digite a base: ");
                int base = input.nextInt();

                System.out.println("digite o expoente: ");
                int exp = input.nextInt();

                int resultado = 1;

                for (int i = 0; i < exp; i++) {

                    resultado *= base;;
                    System.out.println("o resultado é:" + resultado);

                }

            }
        }


