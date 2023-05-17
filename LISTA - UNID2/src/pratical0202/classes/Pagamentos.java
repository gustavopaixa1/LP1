package pratical0202.classes;

public interface Pagamentos {
    int quantidade = 1;
    void realizarPagamento(float valor);
    void gerarRecibo(float valor);
}
