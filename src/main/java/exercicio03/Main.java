package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira um numero");
        Scanner numeroInput = new Scanner(System.in);
        int numero =numeroInput.nextInt();


        if (numero % 2 ==0){
            System.out.printf("o numero %d e par",numero);
        }
        else {
            System.out.printf("O numero %d é impar",numero);
        }



    }
}
