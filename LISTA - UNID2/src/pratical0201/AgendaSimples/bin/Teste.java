package AgendaSimples.bin;

import AgendaSimples.src.Aluno;
import AgendaSimples.src.Escola;

import java.util.ArrayList;
import tools.Validator;

public class Teste {
    public static void main(String[] args) {
        Validator vd = new Validator(System.in);
        Escola ecl;
        
        String aux = vd.validateString("Deseja usar o banco de dados já pronto? (S/N) ",
        "Erro! Por favor, digite apenas 'S'(Sim) ou 'N'(Não)\n\n",
        (n) -> {
            char c = n.toLowerCase().charAt(0);
            return (c == 's' || c == 'n');
        });
        
        if (aux.toLowerCase().charAt(0) == 's')
            ecl = new Escola(true);
        else
            ecl = new Escola();
    }
}
