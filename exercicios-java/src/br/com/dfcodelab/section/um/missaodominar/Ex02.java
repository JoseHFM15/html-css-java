package br.com.dfcodelab.section.um.missaodominar;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite o valor de sua compra: ");
        double valorCompra = ler.nextDouble();
        System.out.println("Digite o valor que voce pagou:");
        double valorEntregue = ler.nextDouble();

        if (valorCompra < valorEntregue) {
            double troco = valorEntregue - valorCompra;
            System.out.println("seu troco sera de " + troco);
        }else if (valorCompra == valorEntregue) {
            System.out.println("não recebera troco");
        }else {

            double devendo = valorCompra - valorEntregue;

            System.out.println("voce esta devendo " + devendo);
        }

    }
}
