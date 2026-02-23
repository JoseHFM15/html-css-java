package br.com.dfcodelab.section.dois.missaodominar.ex3;

public class Test3 {
    public static void main(String[] args) {
        //criando um retangulo com os valores pradrão
        Retangulo retangulo1 = new Retangulo();
        //calculando área e exibindo ela
        double area = retangulo1.calcArea();
        System.out.println("Área do retângulo 1: " + area);
        //criando um retangulo com altura 4,6 e largura 7,4
        Retangulo retangulo2 = new Retangulo(4.6, 7.4);
        System.out.println(" ");
        area = retangulo2.calcArea();
        System.out.println("Área do retângulo 2: " + area);
    }
}
