/*
 * Exercício 08 - Anagrama
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */

import java.util.Scanner;

public class EleicaoSindical {
    public static void main (String[]args){
        int A, B, C;
        int nulos, brancos, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de votos válidos do candidato A: ");
        A = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos do candidato B: ");
        B = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos do candidato C: ");
        C = sc.nextInt();

        System.out.print("Digite a quantidade de votos em branco:");
        brancos = sc.nextInt();

        System.out.print("Digite a quantidade de votos nulos:");
        nulos = sc.nextInt();

        total = A + B + C + brancos + nulos;
        System.out.println("\n\nQuantidade total de votos: " + total);

        System.out.println("\n\nPercentual do candidato A em relação ao total:" + (A*100)/total + "%.");
        System.out.println("Percentual do candidato B em relação ao total:" + (B*100)/total + "%.");
        System.out.println("Percentual do candidato C em relação ao total:" + (C*100)/total + "%.");
        System.out.println("Percentual de votos nulos em relação ao total:" + (nulos*100)/total + "%.");
        System.out.println("Percentual do votos em branco em relação ao total:" + (brancos*100)/total + "%.");

        sc.close();
    }
}
