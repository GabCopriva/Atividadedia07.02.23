package Lista01La�odeRepeti��oFor;

import java.util.Scanner;

public class Exerc�cio_1 {

	public static void main(String[] args) {
		// Exerc�cio 1 da Lista 1
		
		int primeiroN,segundoN;
		
		
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro n�mero do intervalo: ");
		primeiroN = leia.nextInt();
		
		System.out.println("\nDigite o segundo n�mero do intervalo: ");
		segundoN = leia.nextInt();
				
		if (primeiroN < segundoN) {
			System.out.println("\nNo intervalo entre o" +primeiroN+ "e o" +segundoN);
		
		for (int i=primeiroN; i<=segundoN; i++)	{
		if ((i%3 == 0) && (i%5 == 0)) {
				System.out.println(i+"\n� m�ltiplo por 3 e 5");
		} 
		else {
		System.out.println("Intervalo inv�lido. ");
		}
		}
		}
	}
}




