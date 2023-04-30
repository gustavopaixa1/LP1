import javax.swing.JOptionPane;
import java.util.Scanner;

public class caixaDeDialogo {
    public static void main(String[] args) {
        String aux;
        float largura, comprimento, area, perimetro;

        aux = JOptionPane.showInputDialog("Digite o comprimento: ");
        comprimento = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Digite a largura: ");
        largura = Float.parseFloat(aux);

        area = comprimento * largura;
        perimetro = 2 * comprimento + 2 * largura;

        JOptionPane.showMessageDialog(null, "Área: " + area + "\n Perímetro: " +
                perimetro);

    }
}
