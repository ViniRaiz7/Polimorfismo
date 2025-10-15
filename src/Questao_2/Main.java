package Questao_2;

public class Main {
    public static void main(String[] args) {

        Funcionario[] listaDePagamento = new Funcionario[3];

        listaDePagamento[0] = new Funcionario("Lucas Almeida", "111.222.333-44");
        listaDePagamento[1] = new Gerente("Mariana Silva", "555.666.777-88");
        listaDePagamento[2] = new Programador("João Pedro", "999.888.777-66");

        System.out.println("=== Lista de Pagamento ===");

        for (Funcionario f : listaDePagamento) {
            f.exibirDados();
        }
    }
}
