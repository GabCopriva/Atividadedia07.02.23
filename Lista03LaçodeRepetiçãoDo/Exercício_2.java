package Lista03La�odeRepeti��oDo;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		// Exerc�cio 2 da lisa 3
		
		int numero, quantidade = 0, media = 0,p1=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("\nDigite um n�mero:");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				p1+=numero;
				quantidade++;
			}
			
		} while (numero!=0);
		 	media = p1 / quantidade;
		 	System.out.println("\nA m�dia de todos os n�meros m�ltiplode de 3 � de:"+media);

	}

}
