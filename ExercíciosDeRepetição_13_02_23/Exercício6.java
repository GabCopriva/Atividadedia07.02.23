package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		/*Exercício 6. Escrever um programa que receba vários números inteiros no teclado.
		 E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

		//Var
		int numero, quanti = 0, media = 0, p1 = 0;
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//DO
		
		do {
			System.out.println("\nDigite um número:");
			numero = leia.nextInt();
			
			if (numero%3 == 0 && numero!= 0) {
					p1+=numero;
					quanti++;
				}
		}  while (numero!=0);
		   		 	media = p1 / quanti;
           		 	System.out.println("\nA média de todos os números múltiplode de 3 é de: "+media);
	}

}
