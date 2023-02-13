package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		/*Exercício 5.Crie um programa que leia um número do teclado
		  até que encontre um número igual a zero. No final, mostre 
		  a soma dos números digitados.(DO...WHILE)
		 */
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Var
		int num, soma = 0, cont;
 
		//DO
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			cont++;
			
			//While
			while (num > 0) {
				soma++;
				cont++;
				System.out.println("\nDigite um número: ");
			}
			if(cont == 0) {
				System.out.println("\nNenhum número foi encontrado.");}
			
				else 
					if(cont == 1) {
						System.out.printf("\nFoi encontrado %.0f número", cont);}
						else {
							System.out.printf("\nForam encontrados %.0f números", cont);
						if (cont != 0) {
							System.out.printf("\nA soma dos números digitados é de: %f", soma/cont);
						}
						}
		}
	}
}


