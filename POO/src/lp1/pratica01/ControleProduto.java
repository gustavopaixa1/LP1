package lp1.pratica01;

import java.util.Scanner;

public class ControleProduto {
    public static void main(String[] args) {
        int qtd = 0;
        int opt = 2;
        Produto[] produtos = new Produto[10];

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("\nPor favor, selecione uma opção: ");
            System.out.print("1. Efetua venda\n");
            System.out.print("2. Cadastra produto\n");
            System.out.println("3. Visualizar produto");
            System.out.println("0. Para encerrar o programa");

            opt = sc.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("Selecione o número do produto que deseja vender: ");
                    int vender = sc.nextInt();
                    if (produtos[vender] == null) {
                        System.out.println("Esse produto não está cadastrado");
                        continue;
                    } else {
                        System.out.println("Quantas unidades você deseja?");
                        int quantidade = sc.nextInt();
                        efetuaVenda(produtos, vender, quantidade);
                    }
                }

                case 2 -> {
                    produtos[qtd] = new Produto();
                    cadastraProduto(produtos, qtd);
                    qtd++;
                }

                case 3 -> {
                    System.out.println("Qual o número do produto que deseja visualizar? (De 0 a 9)");
                    int visualizar = sc.nextInt();
                    if (produtos[visualizar] == null) {
                        System.out.println("Esse produto ainda não foi cadastrado");
                    } else {
                        System.out.println(produtos[visualizar].toString());
                    }
                    System.out.println();
                }

                default -> {
                    System.out.println("Opção inválida, por favor, digite novamente");
                    continue;
                }
            }


            sc.nextLine();
        } while (opt != 0);
        System.out.println("Programa encerrado");

    }

    public static void efetuaVenda(Produto[] produtos, int vender, int i) {
        int quantidadeOriginal = produtos[vender].getQuantidade();
        produtos[vender].setQuantidade(produtos[vender].getQuantidade() - i);
        if (produtos[vender].getQuantidade() < 0) {
            System.out.println("Não há estoque disponível, é necessário escolher um número menor");
            produtos[vender].setQuantidade(quantidadeOriginal);
        } else {
            System.out.println("Compra efetuada com sucesso!");
        }
    }


    public static Produto cadastraProduto(Produto[] produtos, int i) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o nome do produto [%d]: ", i);
        produtos[i].setNome(sc.nextLine());

        System.out.print("Digite a quantidade dos produtos: ");
        produtos[i].setQuantidade(sc.nextInt());

        System.out.print("Digite o preço do produto (com vírgula): ");
        produtos[i].setPreco(sc.nextFloat());
        sc.nextLine();

        return produtos[i];
    }

}
