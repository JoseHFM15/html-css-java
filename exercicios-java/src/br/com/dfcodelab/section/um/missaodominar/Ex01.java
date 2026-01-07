package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        int num2 = ler.nextInt();
        int num3 = ler.nextInt();

        int soma = num + num2 + num3;

        float media = (float) soma / 3;
        System.out.println(media);

    }

}
