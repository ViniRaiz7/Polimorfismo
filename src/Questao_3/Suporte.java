package Questao_3;

public class Suporte extends Funcionario {

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + 200.00;
    }
}
