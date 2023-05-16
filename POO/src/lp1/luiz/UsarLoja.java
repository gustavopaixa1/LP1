package lp1.luiz;

import java.util.*;

public class UsarLoja {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Loja informatica = new Loja();

        informatica.adicionarProduto(0, "teste");
        informatica.adicionarProduto(1, "teste");

        sc.close();

        informatica.listarProdutos();

    }

}
