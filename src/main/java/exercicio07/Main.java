package exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        double valor1 = input.nextDouble();
        System.out.println("Insira o segundo valor");
        double valor2 = input.nextDouble();
        System.out.println("Insira a opração");
        String operacao = input.next();
        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                if(valor2 == 0){
                    System.out.println("Não é possível dividir por 0");
                    break;
                }
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println("O resultado é: " + resultado);


    }


}
