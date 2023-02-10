package dia_10_02_23_LaçoDeRepetição;

import java.util.Scanner;

public class ExemploLaçoWhile {

	public static void main(String[] args) {
		// Exemplo do laço While
		
		int num, somaPar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o número: ");
		num = leia.nextInt();
		
		while (num!=99) //Se for diferente de 99, entra no IF
		{
			if (num % 2 == 0) //Aqui você verifica se o número é PAR, e se for PAR você soma esse número
			{
				somaPar += num; //somaPar = somaPar + num
			}
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();		
			}
		    System.out.println("\nSomatório dos números pares: " +somaPar);
	}
}