package Exerc�ciosDeRepeti��o_13_02_23;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		// Exerc�cio 1. Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		Scanner leia = new Scanner (System.in);
		
		//Vari�veis
		
		int i= 1000, resto = 0;
					
		// FOR
		for(i=1000;i<=1999;i++) {
			if (resto%11==5) {
				System.out.println("\nOs n�meros s�o: ");
				i = leia.nextInt();
						
			}

		}
	}
}



