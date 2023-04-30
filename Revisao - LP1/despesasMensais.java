public class despesasMensais {
    public static void main (String[] args){
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int total = janeiro + fevereiro + marco;
        int media = total/3;

        System.out.printf("A despesa total é %d e a média mensal de gastos é %d", total, media);
    }
}
