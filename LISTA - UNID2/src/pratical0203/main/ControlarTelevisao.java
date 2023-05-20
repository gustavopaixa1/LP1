/*
 * Exercício 03 - ControlarTelevisao
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */

package pratical0203.main;

import pratical0203.classes.ControleRemoto;
import pratical0203.classes.Televisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlarTelevisao {
    public static void main(String[] args) {

        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Controle Remoto ");

        while (true) {
            try {
                System.out.println("1. Aumentar volume ");
                System.out.println("2. Diminuir volume ");
                System.out.println("3. Aumentar Canal ");
                System.out.println("4. Diminuir Canal ");
                System.out.println("5. Ir para o Canal ");
                System.out.println("6. Mostrar informações ");
                System.out.println("0. Sair");
                System.out.print("Selecione uma opção: ");

                int opt = sc.nextInt();
                sc.nextLine();

                if (opt == 0)
                    break;

                switch (opt) {
                    case 1 -> controle.aumentarVolume(tv);
                    case 2 -> controle.diminuirVolume(tv);
                    case 3 -> controle.aumentarCanal(tv);
                    case 4 -> controle.diminuirCanal(tv);
                    case 5 -> {
                        System.out.print("Você deseja ir para qual canal? ");
                        int canal = sc.nextInt();
                        controle.alterarCanal(tv, canal);
                    }
                    case 6 -> controle.mostraInfo(tv);
                    default -> System.out.println("Por favor, digitar apenas números entre 1 a 6\n");
                }
            } catch (InputMismatchException error) {
                System.out.println("Por favor, digitar apenas números inteiros\n");
                sc.nextLine();
            }
        }
        System.out.println("Programa encerrado!");
        sc.close();
    }
}