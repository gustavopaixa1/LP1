package pratical0202.classes;

import java.util.Scanner;

public class CartaoDeCredito implements Pagamentos {
    Scanner sc = new Scanner(System.in);
    float limite = 10000f;
    int nParcelas;

    public void realizarPagamento(float valor) {
        boolean executar = true;

        while (executar) {
            System.out.println("Deseja parcelar em quantas vezes?");
            nParcelas = sc.nextInt();

            if (nParcelas > 10 || nParcelas < 1) {
                System.out.println("O produto só pode ter de 1 a 10 parcelas. ");
                continue;
            } else {
                float limiteOriginal = limite;
                this.limite = this.limite - valor;

                if (limite < 0) {
                    System.out.printf("Você não tem limite para realizar essa transação \n");
                    this.limite = limiteOriginal;
                    System.out.printf("Limite atual: %.2f\n\n", this.limite);
                } else {
                    System.out.println("Pagamento realizado!");
                    System.out.printf("Limite atual: R$ %.2f \n\n", this.limite);
                    gerarRecibo(valor);
                }
            executar = false;
            }

        }
    }


    @Override
    public void gerarRecibo(float valor) {
        System.out.printf("------ RECIBO ------\n");
        System.out.printf("Forma de Pagamento: Cartao de crédito\n");
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("%d vezes de %.2f \n", nParcelas, valor / nParcelas);
        System.out.printf("Pago no dia xx/xx/20xx\n");
        System.out.printf("---------------------\n\n");
    }

    public void mostrarParcelas(float valor) {
        System.out.println("Opções de parcelamento: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("* %d vezes de %.2f.\n", i, valor / i);
        }
    }
}
