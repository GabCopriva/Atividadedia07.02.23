package Lista03LaçodeRepetiçãoDo;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		// Exercício 2 da lisa 3
		
		int numero, quantidade = 0, media = 0,p1=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("\nDigite um número:");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				p1+=numero;
				quantidade++;
			}
			
		} while (numero!=0);
		 	media = p1 / quantidade;
		 	System.out.println("\nA média de todos os números múltiplode de 3 é de:"+media);

	}

}
