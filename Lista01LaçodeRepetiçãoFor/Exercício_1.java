package Lista01LaçodeRepetiçãoFor;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		// Exercício 1 da Lista 1
		
		int primeiroN,segundoN;
		
		
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		primeiroN = leia.nextInt();
		
		System.out.println("\nDigite o segundo número do intervalo: ");
		segundoN = leia.nextInt();
				
		if (primeiroN < segundoN) {
			System.out.println("\nNo intervalo entre o" +primeiroN+ "e o" +segundoN);
		
		for (int i=primeiroN; i<=segundoN; i++)	{
		if ((i%3 == 0) && (i%5 == 0)) {
				System.out.println(i+"\nÉ múltiplo por 3 e 5");
		} 
		else {
		System.out.println("Intervalo inválido. ");
		}
		}
		}
	}
}




