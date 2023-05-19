package pratical0202.classes;

import java.util.Scanner;

public class CartaoDeCredito implements Pagamentos {

    public void realizarPagamento(float valor) {
        System.out.println("Realizando pagamento com cartão de crédito...");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Pagamento realizado! \n");
    }


    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Cartao de crédito\n");
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("Pago no dia xx/xx/20xx\n");
        System.out.printf("---------------------\n\n");
    }
}
