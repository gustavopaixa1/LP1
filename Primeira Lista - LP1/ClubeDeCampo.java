/*
 * Exercício 05 - ClubeDeCampo
 * Aluno: Luiz Gustavo Paixão da Gama - Matrícula: 20220005834
 * Aluno: Lucas Rondineli Lucena Fragoso - Matrícula: 20220005932
 */

import javax.swing.JOptionPane;

public class ClubeDeCampo {
    public static void main(String[] Args) {
        int n;

        // Entrada do Número de Pessoas
        while (true)
            try {
                n = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Entre com o número de pessoas cadastradas: (Entre 1 e 10)",
                                "ClubeDeCampo", 3));
                if (1 <= n && n <= 10)
                    break;
                throw new NumberFormatException();
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas um número maior entre 1 e 10.",
                        "ClubeDeCampo", 0);
            }

        // Entrada do Idade e Altura das Pessoas
        int[] idade = new int[n];
        float[] altura = new float[n];
        float altura10 = 0f, altura1015 = 0f, altura1521 = 0f, altura21 = 0f;
        int total10 = 0, total1015 = 0, total1521 = 0, total21 = 0;

        for (int i = 0; i < n; i++) {
            // Recebe a Idade da Pessoa
            while (true)
                try {
                    idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                            String.format("Entre com a idade da %do pessoa:", i + 1), "ClubeDeCampo", 3));
                    if (idade[i] > 0)
                        break;
                    throw new NumberFormatException();
                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite uma idade válida.", "ClubeDeCampo", 0);
                }

            // Recebe a Altura da Pessoa
            while (true)
                try {
                    altura[i] = Float.parseFloat(JOptionPane.showInputDialog(null,
                            String.format("Entre com a altura da %do pessoa:", i + 1), "ClubeDeCampo", 3));
                    if (altura[i] > 0)
                        break;
                    throw new NumberFormatException();
                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite uma altura válida.", "ClubeDeCampo", 0);
                }

            // Calcula as Médias das Alturas
            if (idade[i] <= 10) {
                total10++;
                altura10 += altura[i];
            } else if (idade[i] <= 15) {
                total1015++;
                altura1015 += altura[i];
            } else if (idade[i] <= 21) {
                total1521++;
                altura1521 += altura[i];
            } else {
                total21++;
                altura21 += altura[i];
            }
        }

        // Mostra as Médias das Alturas na Tela
        JOptionPane.showMessageDialog(null,
                String.format("Média da Altura para Pessoas com Menos de 10 anos:\n%.2f", altura10 / total10),
                "ClubeDeCampo", 1);
        JOptionPane.showMessageDialog(null,
                String.format("Média da Altura para Pessoas entre 10 e 15 anos:\n%.2f", altura1015 / total1015),
                "ClubeDeCampo", 1);
        JOptionPane.showMessageDialog(null,
                String.format("Média da Altura para Pessoas entre 15 e 21 anos:\n%.2f", altura1521 / total1521),
                "ClubeDeCampo", 1);
        JOptionPane.showMessageDialog(null,
                String.format("Média da Altura para Pessoas com Mais de 21 anos:\n%.2f", altura21 / total21),
                "ClubeDeCampo", 1);
    }
}