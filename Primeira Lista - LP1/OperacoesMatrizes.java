/*
 * Exercício 08 - Anagrama
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */

import java.util.Scanner;
public class OperacoesMatrizes {
    public static void main (String[] args){
        long[][] matriz = new long[4][4];
        long total = 0;
        long diagonal = 0;
        long diagonalInferior= 0;
        long diagonalSuperior = 0;


        Scanner sc = new Scanner(System.in);

        //Recebendo dados da matriz
        for (int i=0; i<4; i++)
            for (int j=0; j<4; j++){
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }

        long menor = matriz[0][0];

        //Mostrando a matriz na tela
        System.out.println("--- MATRIZ ---\n");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++){
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println("\n");
        }

        //Somando todos os valores abaixo da diagonal principal
        for(int i=1; i<4; i++)
            for (int j=0; j<=i-1; j++) {
                diagonalInferior = diagonalInferior + matriz[i][j];
            }
        System.out.println("A) Soma dos elementos abaixo da diagonal principal:" + diagonalInferior);

        //Somando todos os elementos acima da diagonal principal
        for (int i=0; i<3; i++)
            for(int j=i+1; j<=3; j++){
                diagonalSuperior = diagonalSuperior + matriz [i][j];
            }
        System.out.println("\nB) Soma dos elementos acima da diagonal principal:" + diagonalSuperior);

        //Soma dos elementos da diagonal principal
        for(int i=0;i<4;i++)
            for (i=0;i<4;i++)
                if (matriz[i][i] == matriz[i][i]) {
                    diagonal = diagonal + matriz[i][i];
                }
        System.out.println("\nC) Soma dos elementos da diagonal principal:" + diagonal);

        //Encontrar o menor valor da matriz
        for(int i=0;i<4;i++)
            for (int j=0; j<4;j++)
                if (menor>matriz[i][j])
                    menor = matriz[i][j];
        System.out.println("\nD) O menor elemento da matriz é: " + menor);

        //Somar todos os valores da matriz
        for(int i=0; i<4; i++)
            for (int j=0; j<4; j++)
                total = total + matriz[i][j];

        System.out.println("\nE) A soma de todos os elementos da matriz é: " + total);
    }
}