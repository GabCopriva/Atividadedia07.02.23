package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		/* Exercírcio 4. Uma empresa desenvolveu uma pesquisa para saber as
		   características psicológicas dos indivíduos de uma região. Para tanto,
		   a cada uma das pessoas era perguntado: idade, identificação de gênero 
		   (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma;
		   2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar
		   um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE) */
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Var
		int idade, identificação, opções, calma = 0, nervosa = 0, agressiva = 0, pCalma = 0, mNervosas = 0, hAgressivos =0, pNervosasMQuarenta = 0, pCalmasMDezoito = 0;
		
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		
		int pessoas = 0;
		
		
		//While
		while (pessoas < 3) {
			System.out.println("\nDigite como você se identifica: ");
			System.out.println("\nCódigo 1 - Masculino");
			System.out.println("\nCódigo 2 - Feminino");
			System.out.println("\nCódigo 3 - Outro");
			identificação = leia.nextInt();
			
			System.out.println("\nDigite uma das opções em que você se enquadra: ");
			System.out.println("\nCódigo 1 - Calma");
			System.out.println("\nCódigo 2 - Nervosa");
			System.out.println("\nCódigo 3 - Agressiva");
			opções = leia.nextInt();
			
			//IF
			if (opções == 1) {
				calma++;
			}
			if (identificação == 2) {
				if (opções == 2);
				mNervosas++;
				
			}
			if (identificação == 1) {
				if (opções == 3);
				hAgressivos++;
			
			}
			if (opções == 2) {
				if (idade > 40);
				pNervosasMQuarenta++;
	
			}
			if (opções == 1) {
				if (idade < 18);
				pCalmasMDezoito++;
				
			}
		pessoas++;
		}
		System.out.println("\nO total de pessoas calmas é de: "+calma);
		System.out.println("\n O total de mulheres nervosas é de: "+mNervosas);
		System.out.println("\nO total de homens agressivos é de: "+hAgressivos);
		System.out.println("\nO total de pessoas nervosas maiores de quarenta anos é de: " +pNervosasMQuarenta);
		System.out.println("\nO total de pessoas calmas menores de dezoito anos é de: " +pCalmasMDezoito);
	}	

}
