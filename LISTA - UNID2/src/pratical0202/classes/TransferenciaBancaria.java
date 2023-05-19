package pratical0202.classes;

import java.util.Scanner;

public class TransferenciaBancaria implements Pagamentos {

    public void realizarPagamento(float valor) {
        System.out.println("Realizando transferência...");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Transferência realizada!\n ");

    }


    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Transferência Bancária\n");
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("Transferido para a Conta: xxxxx-x e Agência: xxxx-x\n");
        System.out.printf("Pago no dia xx/xx/202x\n");
        System.out.printf("---------------------\n\n");
    }
}
