/*
 * Exercício 08 - Anagrama
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */
public class CensoAltura {
    public static void main(String[] args){
        double[] altura = {1.70, 1.80, 1.52, 1.90, 1.94, 1.01, 1.04, 1.87, 1.42, 1.04,
                1.95,2.42,2.41, 1.85, 1.23, 1.45, 2.43, 2.12, 2.44, 1.92};
        char[] sexo = {'f', 'm', 'f', 'f', 'f', 'm', 'm', 'f', 'm', 'f',
                'f', 'm', 'm', 'm', 'f', 'm', 'm', 'm', 'f', 'f'};

        int i, qtdm = 0, qtdh = 0;
        double maior, menor, alturam = 0, alturah = 0;

        maior = altura[0];
        menor = altura[0];

        //Verificar menor e maior altura
        for(i=0; i<20; i++){
            if(maior < altura[i]) {
                maior = altura[i];
            }
            if(menor > altura[i]){
                menor = altura[i];
            }
        }
        System.out.println("A) A maior e a menor altura do grupo: ");
        System.out.println("A maior altura é: " + maior);
        System.out.println("A menor altura é: " + menor +"\n");

        //Verificar o número de mulheres e homens
        for(i=0; i<20; i++){
            if (sexo[i] == 'f'){
                qtdm += 1;
                alturam += altura[i];
            }
            else {
                qtdh += 1;
                alturah += altura[i];
            }
        }
        System.out.println(" B) A média das alturas das mulheres: ");
        System.out.printf("A média da altura das mulheres é: %.2f%n%n", alturam/qtdm);

        System.out.println("C) A média das alturas dos homens: ");
        System.out.printf("A média da altura das homens é: %.2f%n\n", alturah/qtdh);

        System.out.println("D) Número de mulheres e E) Número de homens");
        System.out.printf("A quantidade de mulheres é %d e a quantidade de homens é %d\n\n", qtdm, qtdh);

        System.out.println("F) A porcentagem de pessoas do sexo feminino(f)");
        System.out.printf("%d por cento\n\n", (qtdm*100/20));

        System.out.println("G) A porcentagem de pessoas do sexo masculino(m)");
        System.out.printf("%d por cento", (qtdh*100/20));

    }
}
