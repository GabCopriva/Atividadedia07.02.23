package Exerc�ciosDeRepeti��o_13_02_23;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		/* Exerc�rcio 4. Uma empresa desenvolveu uma pesquisa para saber as
		   caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto,
		   a cada uma das pessoas era perguntado: idade, identifica��o de g�nero 
		   (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma;
		   2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar
		   um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE) */
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Var
		int idade, identifica��o, op��es, calma = 0, nervosa = 0, agressiva = 0, pCalma = 0, mNervosas = 0, hAgressivos =0, pNervosasMQuarenta = 0, pCalmasMDezoito = 0;
		
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		
		int pessoas = 0;
		
		
		//While
		while (pessoas < 3) {
			System.out.println("\nDigite como voc� se identifica: ");
			System.out.println("\nC�digo 1 - Masculino");
			System.out.println("\nC�digo 2 - Feminino");
			System.out.println("\nC�digo 3 - Outro");
			identifica��o = leia.nextInt();
			
			System.out.println("\nDigite uma das op��es em que voc� se enquadra: ");
			System.out.println("\nC�digo 1 - Calma");
			System.out.println("\nC�digo 2 - Nervosa");
			System.out.println("\nC�digo 3 - Agressiva");
			op��es = leia.nextInt();
			
			//IF
			if (op��es == 1) {
				calma++;
			}
			if (identifica��o == 2) {
				if (op��es == 2);
				mNervosas++;
				
			}
			if (identifica��o == 1) {
				if (op��es == 3);
				hAgressivos++;
			
			}
			if (op��es == 2) {
				if (idade > 40);
				pNervosasMQuarenta++;
	
			}
			if (op��es == 1) {
				if (idade < 18);
				pCalmasMDezoito++;
				
			}
		pessoas++;
		}
		System.out.println("\nO total de pessoas calmas � de: "+calma);
		System.out.println("\n O total de mulheres nervosas � de: "+mNervosas);
		System.out.println("\nO total de homens agressivos � de: "+hAgressivos);
		System.out.println("\nO total de pessoas nervosas maiores de quarenta anos � de: " +pNervosasMQuarenta);
		System.out.println("\nO total de pessoas calmas menores de dezoito anos � de: " +pCalmasMDezoito);
	}	

}
