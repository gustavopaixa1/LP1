package lp1.luiz;

import java.io.*;
import java.util.Scanner;



abstract class Produto {

    String nome;
    double preco;
    String descricao;

    public Produto () {};
    public Produto (String nome) {
        this.nome = nome;
    };
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public abstract void getInformacao();

    public abstract String mostreInfo();
}

class Computador extends Produto {

    double quantidadeMemoria;
    double quantidadeArmazenamento;

    public Computador() {}

    public Computador(String nome) {
        super(nome);
    }

    public Computador(String nome, double preco, String descricao, double quantidadeMemoria, double quantidadeArmazenamento) {
        super(nome, preco, descricao);
        this.quantidadeMemoria = quantidadeMemoria;
        this.quantidadeArmazenamento = quantidadeArmazenamento;
    }

    public void getInformacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço teu Computador? Digite em reais (com ponto ao invés de vírgula): ");
        this.preco = Double.parseDouble(sc.nextLine());

        System.out.println("Você quer adicionar qual descrição para teu Computador? Digite: ");
        this.descricao = sc.nextLine();

        System.out.println("O teu Computador tem quantos gigabytes de memória? Digite (com ponto ao invés de vírgula): ");
        this.quantidadeMemoria = Double.parseDouble(sc.nextLine());

        System.out.println("O teu Computador tem quantos gigabytes de armazenamento? Digite (com ponto ao invés de vírgula): ");
        this.quantidadeArmazenamento = Double.parseDouble(sc.nextLine());
        sc.nextLine();

    }

    public String mostreInfo () {
        return String.format("Nome: %s,\nPreço: R$%.2f,\nDescrição: %s,\nQuantidade de Memória: %f, Quantidade de Armazenamento: %f", nome, preco, descricao, quantidadeMemoria, quantidadeArmazenamento);
    }

}

class Monitor extends Produto {

    String tipoDeTela;
    double polegadas;

    public Monitor(String nome) {
        super(nome);
    }
    public Monitor(String nome, double preco, String descricao, String tipoDeTela, double polegadas) {
        super(nome, preco, descricao);
        this.tipoDeTela = tipoDeTela;
        this.polegadas = polegadas;
    }

    public void getInformacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço teu Monitor? Digite em reais (com ponto ao invés de vírgula): ");
        this.preco = Double.parseDouble(sc.nextLine() + "d");

        System.out.println("Você quer adicionar qual descrição para teu Monitor? Digite: ");
        this.descricao = sc.nextLine();

        System.out.println("Teu Monitor possui qual tipo de tela? Digite: ");
        this.tipoDeTela = sc.nextLine();

        System.out.println("Quantas polegadas tem o teu Monitor? Digite (com ponto ao invés de vírgula): ");
        this.polegadas = Double.parseDouble(sc.nextLine() + "d");

        sc.close();
    }

    public String mostreInfo () {
        return String.format("\"Nome: %s,\nPreço: R$%.2f,\nDescrição: %s,\nTipo de Tela: %f, Polegadas: %f\"", nome, preco, descricao, tipoDeTela, polegadas);
    }
}

public class Loja {


    final int CONTAGEM = 2;
    Produto[] produtos = new Produto[CONTAGEM];

    public void adicionarProduto(int i, String nome) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer qual produto? Digite 'Computador' ou 'Monitor': ");


        if ((nome = sc.nextLine()).equalsIgnoreCase("Monitor")) {

            Produto Monitor = new Monitor("Monitor");
            produtos[i] = Monitor;

        }else if (nome.equalsIgnoreCase("Computador")){

            Produto Computador = new Computador("Computador");
            produtos[i] = Computador;

        }

        produtos[i].getInformacao();
    }

    public void listarProdutos() {

        for (Produto produtoAtual: produtos) {
            produtoAtual.mostreInfo();
        }

    }

}
