import java.util.Scanner;
public class lista_1_terceiro {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("-----Nesse programa você podera, ao digitar um numero, recebera a resposta se o numero é par ou impar.---");
        try (Scanner numb = new Scanner(System.in)) {
			System.out.print("Digite o numero desejado: ");
			num = numb.nextInt();	}
        if (num % 2 ==0) {
            System.out.println("O numero digitado "+ num +" é par");
        } else if (num == 0) {
            System.out.println("O numero digitado é o"+ num);
        }
        else {
            System.out.println("O numero digitado "+ num +" é impar");
        }    }   }