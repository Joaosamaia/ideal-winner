import java.util.Scanner;
public class lista_1_quarto {
    public static void main(String[] args) {
        float a = 0; float b = 0; float c = 0;
        System.out.println("-----Nesse programa você podera, ao digitar tres numeros reais, verificar se o primeiro e maior que a soma dos outros dois.---");
        try (Scanner numb = new Scanner(System.in)) {
			System.out.print("Digite o primeiro numero real: ");
			a = numb.nextFloat();     
            System.out.print("Digite o segundo numero real: ");
			b = numb.nextFloat();
            System.out.print("Digite o terceiro numero real: ");
			c = numb.nextFloat();    }
        if (a > b+c) {
            System.out.println(a +" e maior do que a soma de "+ b +" com "+ c);
        } else if (a < b+c) {
            System.out.println(a +" e menor do que a soma de "+ b +" com "+ c);
        } else if (a == b+c){
            System.out.println(a +" e igual a soma de "+ b +" com "+ c);
        }   }   }