import java.util.Scanner;
public class operacoes {
	public static void main(String[] args) {
		int operacao;
		int num1 = 0;
		int num2 = 0;
		int res;
		System.out.println("-----Nesse programa você podera, ao escolher uma operação e fornecer dois numeros, realizar uma operação matematica de sua escolha.---");
		System.out.println("-----Para realizar uma soma digite 1.");
		System.out.println("-----Para realizar uma subtração digite 2.");
		System.out.println("-----Para realizar uma multiplicação digite 3.");
		System.out.println("-----Para realizar uma divisão digite 4.");
		System.out.println("-----Para parar o programa digite: 0.");
		while (true) {
			try (Scanner operator = new Scanner(System.in)) {
                System.out.print("Digite a operação desejada: ");
                operacao = operator.nextInt(); 
            if (operacao == 0) {
                	System.out.print("-----Programa finalizado. ");
                	break;    }
                System.out.print("-----Digite o primeiro numero: ");
                num1 = operator.nextInt();			
                System.out.print("-----Digite o segundo numero: ");
                num2 = operator.nextInt();    }
			if (operacao == 1) {
	    	  res = num1 + num2;
	    	  System.out.println("O resultado é: " + res);	
	    	} else if (operacao == 2) {	    		
	    		res = num1 - num2;
		    	System.out.println("O resultado é: " + res);	    	  
	    	} else if (operacao == 3) {	    		
	    		res = num1 * num2;
		    	System.out.println("O resultado é: " + res);	    	  
	    	} else if (operacao == 4) {	    		
	    		res = num1 / num2;
		    	System.out.println("O resultado é igual a: " + res);	} 
	    }	}	}
