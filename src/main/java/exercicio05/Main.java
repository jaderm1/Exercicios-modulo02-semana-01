package exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o valor da primeira nota");
        Scanner primeiraNotaInput = new Scanner(System.in);
        double primeiraNota = primeiraNotaInput.nextDouble();

        System.out.println("Insira o valor da segunda nota");
        Scanner segundaNotaInput = new Scanner(System.in);
        double segundaNota = segundaNotaInput.nextDouble();

        System.out.println("Insira o valor da terceira nota");
        Scanner terceiraNotaInput = new Scanner(System.in);
         double terceiraNota = terceiraNotaInput.nextDouble();

         double media = (primeiraNota+segundaNota+terceiraNota)/3;

        System.out.printf("O valor da média é : %.2f", media);
    }
}
