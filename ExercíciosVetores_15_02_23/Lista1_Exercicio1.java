package Exerc�ciosVetores_15_02_23;

import java.util.Scanner;

public class Lista1_Exercicio1 {

	public static void main(String[] args) {
		// Exerc�cio 1 Vetores - dia 15.02.23
		
		//Scanner
		Scanner leia = new Scanner (System.in);
			
		//Var
				
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int num, aux=-1;
 		int x;
 		
 		//Digite
 				System.out.printf("\nDigite o n�mero que deseja encontrar: ");
				num = leia.nextInt();	
		//FOR
			for (x = 0; x < 10; x++) {
				if (num == vetor[x]) {
					aux = x; // 
				}
			}
				 if (aux != -1) {
					 System.out.println("\nO n�mero " + num + " est� na posi��o " +aux);
				 } else {
				  System.out.println("\nN�mero n�o encontrado!");
				 }
							
	}

	}
	
	
