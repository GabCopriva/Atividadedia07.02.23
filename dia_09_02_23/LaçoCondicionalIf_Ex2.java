package dia_09_02_23;

import java.util.Scanner;

public class La�oCondicionalIf_Ex2 {

	public static void main(String[] args) {
		// Exerc�cio 2 da lista 1
		
		double n�mero;
	
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite um n�mero inteiro: ");
		
		n�mero = leia.nextDouble();
		
				
		if (n�mero < 0 && (n�mero%2 !=0)) {
			System.out.printf("\nO n�mero � negativo e �mpar.");
		}
		
		else if (n�mero < 0 && (n�mero%2) == 0) {
			System.out.printf("\nO n�mero � negativo e par.");
		}
		else if (n�mero > 0 && (n�mero%2) !=0) {
			System.out.printf("\nO n�mero � positivo e �mpar.");
		}
		else if (n�mero > 0 && (n�mero%2) == 0) {
			System.out.printf("\nO n�mero � positivo e par.");
		}
		else {
			System.out.printf("\nDigite um n�mero v�lido.");
		}
	    
	
	}
		
		
}


