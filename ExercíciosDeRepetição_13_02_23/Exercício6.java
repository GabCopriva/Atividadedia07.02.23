package Exerc�ciosDeRepeti��o_13_02_23;

import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		/*Exerc�cio 6. Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

		//Var
		int numero, quanti = 0, media = 0, p1 = 0;
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//DO
		
		do {
			System.out.println("\nDigite um n�mero:");
			numero = leia.nextInt();
			
			if (numero%3 == 0 && numero!= 0) {
					p1+=numero;
					quanti++;
				}
		}  while (numero!=0);
		   		 	media = p1 / quanti;
           		 	System.out.println("\nA m�dia de todos os n�meros m�ltiplode de 3 � de: "+media);
	}

}
