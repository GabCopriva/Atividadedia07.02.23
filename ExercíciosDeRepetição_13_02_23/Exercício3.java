package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		/* Exercício 3. Solicitar a idade de várias pessoas e imprimir:
		Total de pessoas com menos de 21 anos. Total de pessoas com 
		mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		*/
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Var
		int num = 0, somaIdadeMenor=0, somaIdadeMaior=0;
		int cont =0;
		
		//Função
		
		
		//WHILE
		while (num!=-99) {
			System.out.println("\nDigite aqui a idade: ");
			num = leia.nextInt();
			
			if (num<=21) {
				somaIdadeMenor++;
			} if (num <=50) {
				somaIdadeMaior++;
			}
			}
			System.out.println("\nO total de pessoas com menos de 21 é de: "+somaIdadeMenor);
			System.out.println("\nO total de pessoas com mais de 50 é de: "+somaIdadeMaior);

	}

}
