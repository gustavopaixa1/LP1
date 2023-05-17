package pratical0202.classes;

import java.util.Scanner;

public class BoletoBancario implements Pagamentos {
    boolean pago = true;
    Scanner sc = new Scanner(System.in);

    @Override
    public void realizarPagamento(float valor) {
        while (pago) {
            System.out.printf("Código do boleto no valor de: %.2f\n", valor);
            System.out.printf("xxxx-xxxxx-xxxxx-xxxx-x-xxxxxx\n");

            System.out.printf("Realizar pagamento? (s/n)\n");
            char c = sc.nextLine().charAt(0);

            if (c == 's' || c == 'S') {
                System.out.printf("Pagamento realizado!\n\n");
                pago = false;
                gerarRecibo(valor);
                System.out.printf("Digite 'enter' para continuar\n");
                sc.nextLine();

            } else if (c == 'n' || c == 'N') {
                System.out.printf("Digite 'enter' para continuar\n");
                sc.nextLine();
                continue;

            } else {
                System.out.printf("Opção inválida\n");
                System.out.printf("Digite 'enter' para continuar\n");
                sc.nextLine();
                continue;
            }
        }
        pago = true;
    }

    @Override
    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Boleto Bancário\n");
        System.out.printf("Valor: %.2f\n", valor);
        System.out.printf("Código do Boleto: xxxx-xxxxx-xxxxx-xxxx-x-xxxxxx\n");
        System.out.printf("Pago no dia xx/xx/20xx\n");
        System.out.printf("---------------------\n\n");
    }
}
