import javax.swing.JOptionPane;

public class pontuacaoCandidato {
    public static void main(String[] args) {
        String aux;
        int pontos;

        aux = JOptionPane.showInputDialog("Por favor, digite a pontuação: ");
        pontos = Integer.parseInt(aux);

        if (pontos > 700) {
            System.out.println("Parabéns, você foi aprovado.");
        } else if (pontos > 600 && pontos < 700) {
            System.out.println("Você tem chances de passar");
        } else {
            System.out.println("Provavelmente, precisará fazer a prova novamente");
        }
    }
}
