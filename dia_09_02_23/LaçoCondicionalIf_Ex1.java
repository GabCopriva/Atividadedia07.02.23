package dia_09_02_23;

import java.util.Scanner;

public class La�oCondicionalIf_Ex1 {

	public static void main(String[] args) {
		// Exerc�dio 1 da Lista 1
		
		double A = 2,B = 4,C = 5,soma;		
			
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		A = leia.nextDouble();
		System.out.println("\nEntre com o valor de B: ");
		B = leia.nextDouble();
		System.out.println("\nEntre com o valor de C: ");
		C = leia.nextDouble();
		
		soma = A+B;
		
		if ((A+B)<C) {
			System.out.printf("\nA soma de A+B � menor que C ");
		}
		
		else if ((A+B)>C) {
			System.out.printf("\nA soma de A+B � maior que C ");
		}
		else if ((A+B)==C) {
			System.out.printf("\nA soma de A+B � igual a C ");
		}
		
        

		
	}

}
