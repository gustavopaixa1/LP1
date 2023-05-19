package pratical0202.classes;

import java.util.Scanner;

public class BoletoBancario implements Pagamentos {
    private boolean pago = true;
    private Scanner sc;

    public void realizarPagamento(float valor) {
        System.out.println("Pagamento do boleto realizado!\n");
    }

    public void gerarBoleto(float valor){
        System.out.printf("Código do boleto no valor de: %.2f\n", valor);
        System.out.printf("xxxx-xxxxx-xxxxx-xxxx-x-xxxxxx\n");
        System.out.printf("Realizar pagamento? \n" +
                "Digite S para pagar ou N para voltar: \n");
    }

    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Boleto Bancário\n");
        System.out.printf("Valor: %.2f\n", valor);
        System.out.printf("Código do Boleto: xxxx-xxxxx-xxxxx-xxxx-x-xxxxxx\n");
        System.out.printf("Pago no dia xx/xx/20xx\n");
        System.out.printf("---------------------\n\n");
    }
}
