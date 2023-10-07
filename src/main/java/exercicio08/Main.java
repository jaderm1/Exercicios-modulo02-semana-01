package exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insira o valor inicial");
        Scanner valorInicialInput = new Scanner(System.in);
        double valorInicial = valorInicialInput.nextDouble();

        System.out.println("Insira o valor da raiz");
        Scanner valorRaizInput = new Scanner(System.in);
        double valorRaiz = valorRaizInput.nextDouble();
        System.out.println("Voçê deseja calcular os 10 primeiros valores P.A ou P.G?");
        Scanner tipoInput = new Scanner(System.in);
        String tipo = tipoInput.nextLine();
        double resultado = 0;
        switch (tipo) {
            case "P.A":
                for (int i = 0; i < 10; i++) {
                    resultado = valorInicial + (i * valorRaiz);
                    System.out.println(resultado);
                }
                break;
            case "P.G":
                for (int i = 0; i < 10; i++) {
                    resultado = valorInicial * Math.pow(valorRaiz, i);
                    System.out.println(resultado);
                }
                break;
            default:
                System.out.println("Tipo inválido");
                break;
        }




    }
}
