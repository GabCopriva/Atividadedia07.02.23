package dia_10_02_23_La�oDeRepeti��o;

import java.util.Scanner;

public class ExemploLa�oWhile {

	public static void main(String[] args) {
		// Exemplo do la�o While
		
		int num, somaPar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o n�mero: ");
		num = leia.nextInt();
		
		while (num!=99) //Se for diferente de 99, entra no IF
		{
			if (num % 2 == 0) //Aqui voc� verifica se o n�mero � PAR, e se for PAR voc� soma esse n�mero
			{
				somaPar += num; //somaPar = somaPar + num
			}
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();		
			}
		    System.out.println("\nSomat�rio dos n�meros pares: " +somaPar);
	}
}