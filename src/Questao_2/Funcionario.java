package Questao_2;

public class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double calcularSalario() {
        return 1500.00;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("------------------------");
    }
}
