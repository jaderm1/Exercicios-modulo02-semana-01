package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira sua altura");
        Scanner alturaInput = new Scanner(System.in);
        double altura = alturaInput.nextDouble();

        System.out.println("Insira o seu peso");
        Scanner pesoInput = new Scanner(System.in);
        double peso = pesoInput.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu imc é: %.2f",imc);
    }

}
