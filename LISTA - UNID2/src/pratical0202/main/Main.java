package pratical0202.main;

import pratical0202.classes.BoletoBancario;
import pratical0202.classes.CartaoDeCredito;
import pratical0202.classes.TransferenciaBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BoletoBancario boleto = new BoletoBancario();
        CartaoDeCredito cartao = new CartaoDeCredito();
        TransferenciaBancaria transf = new TransferenciaBancaria();

        boolean executar = true;

        while (executar) {
            try {
                System.out.println("-- Sistema de Pagamentos Integrado --");
                System.out.println("Digite o valor do pagamento, com vírgula: ");
                Float valor = sc.nextFloat();
                sc.nextLine();

                System.out.println("Selecione a forma de pagamento: ");
                System.out.println("1. Cartão de crédito");
                System.out.println("2. Transferência Bancária");
                System.out.println("3. Boleto Bancário");
                System.out.println("4. Voltar");
                System.out.println("0. Encerrar programa");

                int opt = sc.nextInt();
                sc.nextLine();

                switch (opt) {
                    case 1: {
                        cartao.mostrarParcelas(valor);
                        cartao.realizarPagamento(valor);
                        break;
                    }

                    case 2: {
                        transf.realizarPagamento(valor);
                        break;
                    }

                    case 3:{
                        boleto.realizarPagamento(valor);
                        boleto.gerarRecibo(valor);
                        break;
                    }

                    case 4:
                        continue;

                    case 0: {
                        executar = false; break;
                    }

                    default:
                        System.out.println("Por favor, selecionar uma opção de 1 a 4");
                }
            } catch (InputMismatchException error) {
                System.out.println("Por favor, digitar apenas números.\n");
                sc.nextLine();
            }

        }
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
