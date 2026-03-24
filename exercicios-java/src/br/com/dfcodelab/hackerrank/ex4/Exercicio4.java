package br.com.dfcodelab.hackerrank.ex4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                String l = scanner.nextLine();
                int comeco = scanner.nextInt();
                int fim = scanner.nextInt();
                scanner.close();

                System.out.println(l.substring(comeco, fim + 1));



    }
}
