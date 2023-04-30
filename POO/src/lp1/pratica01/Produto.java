package lp1.pratica01;

public class Produto {
    String nome;
    int quantidade;
    float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nnome :'" + nome + '\'' +
                "\nquantidade: " + quantidade +
                "\npreco: R$" + preco;
    }
}
