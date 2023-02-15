package ExercíciosVetores_15_02_23;

import java.util.Scanner;

public class Lista1_Exercicio1 {

	public static void main(String[] args) {
		// Exercício 1 Vetores - dia 15.02.23
		
		//Scanner
		Scanner leia = new Scanner (System.in);
			
		//Var
				
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int num, aux=-1;
 		int x;
 		
 		//Digite
 				System.out.printf("\nDigite o número que deseja encontrar: ");
				num = leia.nextInt();	
		//FOR
			for (x = 0; x < 10; x++) {
				if (num == vetor[x]) {
					aux = x; // 
				}
			}
				 if (aux != -1) {
					 System.out.println("\nO número " + num + " está na posição " +aux);
				 } else {
				  System.out.println("\nNúmero não encontrado!");
				 }
							
	}

	}
	
	
