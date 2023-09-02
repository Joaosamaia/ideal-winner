import java.util.Scanner;
public class lista_1_quinto {
	public static void main(String[] args) {
		float num1 = 0; float num2 = 0; float res;
		System.out.println("--Nesse programa você, ao fornecer dois numeros reais, recebera os valores da soma destes valores, do produto deles e do quociente entre eles.");
			try (Scanner operator = new Scanner(System.in)) {
            System.out.print("-----Digite o primeiro numero: "); num1 = operator.nextInt();			
            System.out.print("-----Digite o segundo numero: "); num2 = operator.nextInt();    }
	    	res = num1 + num2;
	    	System.out.println("O resultado da soma de " +num1+ " com "+ num2 +" é: " + res);	
	        res = num1 * num2;
		    System.out.println("O resultado da multiplicação de " +num1+ " com "+ num2 +" é: " + res);
		    res = num1 / num2;
		    System.out.println("O resultado da divisão de " +num1+ " por "+ num2 +" é: " + res);
    }	}