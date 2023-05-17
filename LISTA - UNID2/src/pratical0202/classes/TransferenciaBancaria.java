package pratical0202.classes;

import java.util.Scanner;

public class TransferenciaBancaria implements Pagamentos {
    float saldoBancario = 10000f;
    boolean pago = true;
    Scanner sc = new Scanner(System.in);

    @Override
    public void realizarPagamento(float valor) {
        while (pago) {
            System.out.println("Dados para a transferência bancária: ");
            System.out.println("Conta: xxxxx-x");
            System.out.println("Agência: xxxx-x");

            System.out.println("Realizar pagamento? (s/n)");
            char c = sc.nextLine().charAt(0);

            if (c == 's' || c == 'S') {
                float saldoOriginal = saldoBancario;
                this.saldoBancario = this.saldoBancario - valor;

                if (saldoBancario < 0) {
                    System.out.printf("Você não tem saldo para realizar essa transação \n");
                    this.saldoBancario = saldoOriginal;
                    System.out.printf("Saldo atual: %.2f\n\n", this.saldoBancario);
                } else {
                    System.out.println("Pagamento realizado!");
                    System.out.printf("Saldo atual: R$ %.2f \n\n", this.saldoBancario);
                    gerarRecibo(valor);
                }

                System.out.printf("Digite 'enter' para continuar\n");
                sc.nextLine();
                pago = false;
            } else if (c == 'n' || c == 'N') {
            } else {
                System.out.println("Opção inválida");
            }
        } pago = true;


    }

    @Override
    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Transferência Bancária\n");
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("Transferido para a Conta: xxxxx-x e Agência: xxxx-x\n");
        System.out.printf("Pago no dia xx/xx/202x\n");
        System.out.printf("---------------------\n\n");
    }
}
