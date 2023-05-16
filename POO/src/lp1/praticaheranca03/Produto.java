package lp1.praticaheranca03;

public class Produto {
    public String nome;
    public float preco;
    public String descricao;

    public Produto(String nome, float preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String mostreInfo() {
        return String.format("Nome: %s\n" +
                "Preço: %.2f" +
                "Descrição: %s", nome, preco, descricao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
