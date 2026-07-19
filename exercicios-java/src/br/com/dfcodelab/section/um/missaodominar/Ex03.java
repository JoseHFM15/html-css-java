package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite uma medida em metros que sera convertida em centimetros e milimertros: ");

        float metros = ler.nextFloat();

        float centimetros = metros * 100;

        float milimetros = centimetros * 10;

        System.out.println("medida em centimetros: " + centimetros);

        System.out.println("medida em milimetros" + milimetros);
    }
}

