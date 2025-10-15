package Questao_3;

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor(3000.00);
        Funcionario sup = new Suporte(2500.00);

        System.out.println("Cálculo de Salários");
        System.out.println("Desenvolvedor - Salário Final: R$ " + dev.calcularSalarioFinal());
        System.out.println("Suporte - Salário Final: R$ " + sup.calcularSalarioFinal());
    }
}
