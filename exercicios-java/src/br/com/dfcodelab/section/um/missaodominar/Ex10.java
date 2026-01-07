package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o numeros de funcionarios: ");
        int numeroDeFuncionarios = input.nextInt();
        double salariosTotal = 0;
        for (int i = 0; i < numeroDeFuncionarios; i++) {

            System.out.println("digite o salario dos funcionarios: ");
            double salario = input.nextDouble();

            salariosTotal = salario + salariosTotal;


        }
        if (numeroDeFuncionarios > 0){

            double media =  (salariosTotal / numeroDeFuncionarios);
            System.out.println("a media do salario dos funcionarios é " + media);


        }else {

            System.out.println("nao foi possivel realizar a media!");
        }

    }
}
