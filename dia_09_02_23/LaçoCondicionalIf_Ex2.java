package dia_09_02_23;

import java.util.Scanner;

public class LaçoCondicionalIf_Ex2 {

	public static void main(String[] args) {
		// Exercício 2 da lista 1
		
		double número;
	
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite um número inteiro: ");
		
		número = leia.nextDouble();
		
				
		if (número < 0 && (número%2 !=0)) {
			System.out.printf("\nO número é negativo e ímpar.");
		}
		
		else if (número < 0 && (número%2) == 0) {
			System.out.printf("\nO número é negativo e par.");
		}
		else if (número > 0 && (número%2) !=0) {
			System.out.printf("\nO número é positivo e ímpar.");
		}
		else if (número > 0 && (número%2) == 0) {
			System.out.printf("\nO número é positivo e par.");
		}
		else {
			System.out.printf("\nDigite um número válido.");
		}
	    
	
	}
		
		
}


