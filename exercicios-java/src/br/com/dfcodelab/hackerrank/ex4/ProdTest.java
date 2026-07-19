package br.com.dfcodelab.hackerrank.ex4;

import static br.com.dfcodelab.hackerrank.ex4.Produtos.criarArray;
import static br.com.dfcodelab.hackerrank.ex4.Produtos.procurarItemNoArray;

public class ProdTest {

    public static void main(String[] args) {

        Produtos[] produ = new Produtos[5];
        criarArray(produ);
        procurarItemNoArray(produ);


    }
}
