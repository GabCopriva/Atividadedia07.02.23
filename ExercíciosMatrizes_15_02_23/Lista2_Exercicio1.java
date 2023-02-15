package ExercíciosMatrizes_15_02_23;

import java.util.Scanner;

public class Lista2_Exercicio1 {

	public static void main(String[] args) {
		//Exercício 1 Matrizes - dia 15.02.23
		
		//Scanner
				Scanner leia = new Scanner (System.in);
				
		// Var
				int [][] valor = new int [3][3];
				int linha, coluna, sPrincipal = 0, sSecundario = 0;
				int [] numPrincipal = new int [3];
				int [] numSecundario = new int [3];
				
	  
	   // For
				for (linha = 0; linha < 3; linha++);
				for (coluna = 0; coluna < 3; coluna++);
				
				System.out.println("\nDigite um valor na posição [%d][%d]: ",linha,coluna);
				valor [linha][coluna] = leia.nextInt();
				
					if (linha == coluna) {
						sPrincipal = sPrincipal + valor [linha][coluna];
						numPrincipal [linha] = valor [linha][coluna];
					}
					else if (linha + coluna == 2) {
						sSecundario += valor [linha][coluna];
						numSecundario [linha] = valor [linha][coluna];
					}
					System.out.println("\nDiagonal Principal: " +numPrincipal);
					System.out.println("\nDiagonal Secundária: " +numSecundario);
					System.out.println("\nSoma dos números da diagonal principal: " +sPrincipal);
					System.out.println("\nSoma dos números da diagonal secundária: " +sSecundario);
}
}
					