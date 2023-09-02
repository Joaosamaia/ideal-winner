import java.util.Scanner;
public class primo_ou_nao {
	public static void main(String[] args) {
		int num;
		boolean a = true;
		System.out.println("-----Nesse programa você podera, ao digitar um numero, você recebera a resposta se o numero é ou não primo.---");
		try (Scanner primo = new Scanner(System.in)) {
			System.out.print("Digite o numero desejado: ");
			num = primo.nextInt();	}
		if (num > 2) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				a = false;	}	}   }
		if (a == true) {
			System.out.println("O número é primo");
		} else {
			System.out.println("O número não é primo");	
		}   }	}
