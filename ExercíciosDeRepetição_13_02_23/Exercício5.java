package Exerc�ciosDeRepeti��o_13_02_23;

import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		/*Exerc�cio 5.Crie um programa que leia um n�mero do teclado
		  at� que encontre um n�mero igual a zero. No final, mostre 
		  a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Var
		int num, soma = 0, cont;
 
		//DO
		do {
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			cont++;
			
			//While
			while (num > 0) {
				soma++;
				cont++;
				System.out.println("\nDigite um n�mero: ");
			}
			if(cont == 0) {
				System.out.println("\nNenhum n�mero foi encontrado.");}
			
				else 
					if(cont == 1) {
						System.out.printf("\nFoi encontrado %.0f n�mero", cont);}
						else {
							System.out.printf("\nForam encontrados %.0f n�meros", cont);
						if (cont != 0) {
							System.out.printf("\nA soma dos n�meros digitados � de: %f", soma/cont);
						}
						}
		}
	}
}


