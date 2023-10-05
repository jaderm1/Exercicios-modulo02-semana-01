package exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira sua data de nascimento: (dd/mm/yy)");
        Scanner idadeInput = new Scanner(System.in);
        String idade = idadeInput.nextLine();
        LocalDate data = LocalDate.now();
        DateTimeFormatter dataFormattedObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatted = data.format(dataFormattedObj);
        String[] dataSplit = dataFormatted.split("/");
        String[] idadeSplit = idade.split("/");
        int idadeAnos = Integer.parseInt(dataSplit[2]) - Integer.parseInt(idadeSplit[2]);


        if(idadeAnos>=18 && idadeAnos<=59){
            System.out.printf("Voçê tem %d anos, e é obrigado a votar %n",idadeAnos);
        }
        else if(idadeAnos<16){
            System.out.printf("Você tem %d anos ainda não pode votar %n",idadeAnos);
        }
        else{
            System.out.printf("Você tem %d anos e não é obrigado a votar",idadeAnos);
        }



    }
}
