package Questao_3;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.10;
    }
}
