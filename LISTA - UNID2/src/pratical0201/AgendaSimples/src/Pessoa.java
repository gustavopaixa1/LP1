package AgendaSimples.src;

public abstract class Pessoa {
    protected String nome, email, telefone;

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTelefone(String telefone) {
        telefone.replaceAll("[^0-9]", "");
        switch (telefone.length()) {
            case 8:
                this.telefone = String.format("+55 (XX) 9%s-%s", telefone.substring(0, 4), telefone.substring(4));
                break;
            case 9:
                this.telefone = String.format("+55 (XX) %s-%s", telefone.substring(0, 5), telefone.substring(5));
                break;
            case 11:
                this.telefone = String.format("+55 (%s) %s-%s", telefone.substring(0, 2), telefone.substring(2, 7),
                        telefone.substring(7));
                break;
            case 13:
                this.telefone = String.format("+%s (%s) %s-%s", telefone.substring(0, 2), telefone.substring(2, 4),
                        telefone.substring(4, 9), telefone.substring(9));
                break;
            default:
                System.out.printf("Número informado inválido, armazenado como 'Indefinido'.\n\n");
                this.telefone = "Indefinido";
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    // Construtor
    public Pessoa(String nome, String email, String telefone) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }
}
