package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira seu nome completo");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        String nameFormated = name.replaceAll(" ", "");

        System.out.printf("Seu nome é %s, e seu nome tem %d caracteres", name, nameFormated.length());
    }
}