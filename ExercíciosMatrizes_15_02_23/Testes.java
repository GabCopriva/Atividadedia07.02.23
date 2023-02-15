package ExercíciosMatrizes_15_02_23;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in); 
		
		int matrizInteiros [][] = {{1,2,3} , {4,5,6} , {7,8,9}};
		int soma = 0;
		
		for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
				
				System.out.println("\nO valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " +matrizInteiros[indiceLinha][indiceColuna]);
				/*System.out.println("\nA diagonal princilpal é: ");
				
				soma += matrizInteiros[linha][coluna];
				
				vetorSoma[coluna] = soma;
				
				soma = 0;
			}
			for (int coluna = 0; coluna <3; coluna++) {
				System.out.println("\nA soma de todos os números da coluna principal" + (coluna + 1) + "é: " + vetorSoma[coluna]);
			}
			}
			} 
		} 
		*/
 
	}   

}
}
}
