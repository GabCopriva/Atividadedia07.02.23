package ExercíciosMatrizes_15_02_23;

import java.util.Scanner;

public class Lista2_Exercicio1 {

	public static void main(String[] args) {
		//Exercício 1 Matrizes - dia 15.02.23
		
		//Scanner
				Scanner leia = new Scanner (System.in);
				
		// Var
				int vetorSoma [] = new int [3]; // Cria um vetor de 3 posições
				int matrizInteiros [][] = {{1,2,3} , {4,5,6} , {7,8,9}}; // Cria uma matriz 3x3
				int soma = 0, somaDP = 0, somaDS = 0; 
				
		//FOR		
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
						if (linha == coluna);
						System.out.printf("%d\t!", matrizInteiros[linha][coluna]);
					} else {
						System.out.printf("\t");
					}
						
					}
					
					
}
					
}		

/*System.out.println("\nA diagonal principal é : ");

soma += matrizInteiros[linha][coluna];

vetorSoma[coluna] = soma;

soma = 0;*/

/*for (int coluna = 0; coluna <3; coluna++) {
System.out.println("\nA soma de todos os números da coluna principal " + (coluna + 1) + " é: " + vetorSoma[coluna]);*/
