package lp1.praticaheranca03;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Produto[] produto = new Produto[10];

        int qtd = 0;


        Scanner sc = new Scanner(System.in);
        int opt = 2;

        do {

            sc = new Scanner(System.in);

            System.out.println("\nPor favor, selecione uma opção: ");
            System.out.print("1. Adicionar produtos\n");
            System.out.print("2. Cadastra produto\n");
            System.out.println("0. Para encerrar o programa");

            opt = sc.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("Quais produtos deseja adicionar?" +
                            "1. Monitores;" +
                            "2. Computadores");
                    int opcao = sc.nextInt();

                    if (opcao == 1) {
                        adicionarProduto(produto, qtd, opcao);
                    } else if (opcao == 2) {
                        produto[qtd] = new Computador("", 0f, "", 0, 0);
                        adicionarProduto(produto, qtd, opcao);
                    } else {
                        System.out.println("Opção inválida, digitar 1 ou 2.");
                        continue;
                    }
                }

                case 2 -> {
                    System.out.println("Digite o produto que deseja verificar");

                }

                default -> {
                    System.out.println("Opção inválida, por favor, digite novamente");
                    continue;
                }
            }


            sc.nextLine();
        } while (opt != 0);
        System.out.println("Programa encerrado");
        sc.close();
    }

    public static Produto adicionarProduto(Produto[] produto, int i, int opcao) {
        Scanner sc = new Scanner(System.in);

        if (opcao == 1){
            System.out.println("Digite o nome do produto");
            produto[i].setNome(sc.nextLine());
            sc.nextLine();

            System.out.println("Digite o preço do produto (com vírgula)");
            produto[i].setPreco(sc.nextFloat());
            sc.nextLine();

            System.out.println("Descreva o produto: ");
            produto[i].setDescricao(sc.nextLine());
            sc.nextLine();

        }

        System.out.println();
        return produto[i];
    }


}
