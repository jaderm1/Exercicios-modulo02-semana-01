package exercicio09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o salário do funcionário");
        Scanner salarioInput = new Scanner(System.in);
        double salario = salarioInput.nextDouble();
        double novoSalario ;

        if (salario <= 1200) {
            novoSalario = salario + (salario * 0.2);
            System.out.printf("O salário antes do reajuste era de R$%.2f, o percentual de aumento aplicado foi de 20%%, o valor do aumento foi de R$%.2f e o novo salário é de R$%.2f", salario, (salario * 0.2), novoSalario);
        } else if (salario > 1200 && salario <= 1700) {
            novoSalario = salario + (salario * 0.15);
            System.out.printf("O salário antes do reajuste era de R$%.2f, o percentual de aumento aplicado foi de 15%%, o valor do aumento foi de R$%.2f e o novo salário é de R$%.2f", salario, (salario * 0.15), novoSalario);
        } else if (salario > 1700 && salario <= 2500) {
            novoSalario = salario + (salario * 0.1);
            System.out.printf("O salário antes do reajuste era de R$%.2f, o percentual de aumento aplicado foi de 10%%, o valor do aumento foi de R$%.2f e o novo salário é de R$%.2f", salario, (salario * 0.1), novoSalario);
        } else if (salario > 2500) {
            novoSalario = salario + (salario * 0.05);
            System.out.printf("O salário antes do reajuste era de R$%.2f, o percentual de aumento aplicado foi de 5%%, o valor do aumento foi de R$%.2f e o novo salário é de R$%.2f", salario, (salario * 0.05), novoSalario);
        }

    }
}
