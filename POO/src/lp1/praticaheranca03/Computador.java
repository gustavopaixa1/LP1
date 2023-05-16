package lp1.praticaheranca03;

public class Computador extends Produto {
    int memoria;
    int armazenamento;

    public Computador(String nome, float preco, String descricao, int memoria, int armazenamento) {
        super(nome, preco, descricao);
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

    public String mostreInfo(){
        return String.format("Monitor. Memória: %d\n. " +
                "Armazenamento: %d.\n" +
                "Nome: %s\n" +
                "Preço: %.2f" +
                "Descrição: %s", memoria, armazenamento, nome, preco, descricao);
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
