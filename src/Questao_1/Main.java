package Questao_1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(10, 20);
        System.out.println("Soma de dois inteiros (10 + 20): " + resultado1);

        int resultado2 = calc.somar(5, 10, 15);
        System.out.println("Soma de três inteiros (5 + 10 + 15): " + resultado2);

        double resultado3 = calc.somar(4.5, 3.7);
        System.out.println("Soma de dois doubles (4.5 + 3.7): " + resultado3);
    }
}
