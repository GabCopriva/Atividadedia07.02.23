package Lista02LaçodeRepetiçãoWhile;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		// Exercício 1 da lista 1
		
		int numero, idadeMenor=0,idadeMaior=0;
				
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite aqui uma idade: ");
		numero = leia.nextInt();
				
		while (numero!= -1) {
			if (numero<21) 
		 { idadeMenor++;
		 } if (numero>50) {
			 idadeMaior++;
		 }
		 System.out.println("\nDigite aqui uma idade: ");
		 numero = leia.nextInt();
		 
		}
		System.out.println("Total de pessoas menores de 21 anos é de: "+idadeMenor);
		System.out.println("Total de pessoas menores de 21 anos é de: "+idadeMaior);
	}
}
