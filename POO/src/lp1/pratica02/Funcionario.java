package lp1.pratica02;

public class Funcionario {
    String nome;
    Float salarioBruto;
    Float imposto;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(Float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setImposto(Float imposto) {
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public Float getSalarioBruto() {
        return salarioBruto;
    }

    public Float getImposto() {
        return imposto;
    }

    public float salarioLiquido(float salarioBruto, float imposto){
        float salarioLiquido = salarioBruto - (salarioBruto * imposto);
        return salarioLiquido;
    }

    public float aumento(float salarioBruto, float aumento) {
        this.salarioBruto = salarioBruto + (salarioBruto * aumento);
        return salarioBruto;
    }
}
