/*
 * Exercício 08 - Anagrama
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */
import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        int opcao, numero;

        Scanner sc = new Scanner(System.in);


        System.out.print("--- TABUADA ---\n" +
                "1. SOMA\n" +
                "2. SUBTRAÇÃO\n" +
                "3. MULTIPLICAÇÃO\n" +
                "4. DIVISÃO\n" +
                "Selecione uma opção: ");
        opcao = sc.nextInt();

        if (opcao>=1 && opcao <=4)
        {
            System.out.print("Digite um número de 1 a 9: ");
            numero = sc.nextInt();

            if (numero<1 || numero>9)
            {
                System.out.println("Número inválido. Digite um número de 1 a 9. ");
            }

            else {
                switch (opcao) {
                    case 1: {
                        System.out.println("Tabela de SOMA de " + numero);
                        for (int i= 1; i<11; i++) {
                            System.out.printf("%d + %d = %d\n", i, numero, i+numero);
                        } break;
                    }

                    case 2: {
                        System.out.println("Tabela de SUBTRAÇÃO de " + numero);
                        for (int i = 1; i < 11; i++) {
                            System.out.printf("%d - %d = %d\n", i, numero, i - numero);
                        }
                        break;
                    }

                    case 3: {
                        System.out.println("Tabela de MULTIPLICAÇÃO de " + numero);
                        for (int i = 1; i < 11; i++) {
                            System.out.printf("%d * %d = %d\n", i, numero, i * numero);
                        }
                        break;
                    }

                    case 4: {
                        System.out.println("Tabela de DIVISÃO de " + numero);
                        for (int i = 1; i < 11; i++) {
                            System.out.printf("%d / %d = %.2f\n", i, numero, (double) i / numero);
                        }
                        break;
                    }
                }
            }
        }

        else{

            System.out.println("Operação inválida. Digitar um número de 1 a 4");
        }
        sc.close();

    }
}
