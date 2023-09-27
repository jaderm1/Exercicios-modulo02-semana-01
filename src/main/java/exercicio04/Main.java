package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
        Scanner numeroInput = new Scanner(System.in);
        int numero = numeroInput.nextInt();

        double random = Math.random();

        double randomRange = random*(5-1)+1;

        int randomConverted = (int) randomRange;

        if (randomConverted==numero){
            System.out.printf("Você acertou o numero é: %d",randomConverted);
        }
        else {
            System.out.printf("Você errou, o número correto era : %d",randomConverted);

        }


    }
}
