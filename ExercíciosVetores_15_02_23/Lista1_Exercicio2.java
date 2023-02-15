package ExercíciosVetores_15_02_23;

import java.util.Scanner;

public class Lista1_Exercicio2 {

	public static void main(String[] args) {
		// Exercício 2 Vetores - dia 15.02.23
		
		//Scanner
				Scanner leia = new Scanner (System.in);
				
		//Digite
		System.out.printf("\nDigite um número: ");
				
	    //Var
				
	     int[] vetor = {2,5,1,3,4,9,7,8,10,6};
	     int valor = leia.nextInt();
		 int i, num = 0 , par = 0, impar = 0, soma = 0, media = 0;
		 
		 //FOR
		 for (i = 0; i < vetor.length-1; i++) {
				if (num%2 == 0){
					par++;
				}
				if (num%2 == 1){
					impar++;
				} 

	}

}
