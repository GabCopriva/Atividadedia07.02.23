package continua��oexerciciosdia_08_02;

import java.util.Scanner;

public class exericio6 {

	public static void main(String[] args) {
		// Exerc�cio 6 do dia 08.02.23
		
		
		float x1,x2,y1,y2,dist�ncia1,dist�ncia2;
				
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o valor de x1: ");
		x1 = leia.nextFloat();
		System.out.println("\nDigite o valor de x2: ");
		x2 = leia.nextFloat();
		System.out.println("\nDigite o valor de y1: ");
		y1 = leia.nextFloat();
		System.out.println("\nDigite o valor de y2: ");
		y2 = leia.nextFloat();
		
		dist�ncia1 = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		
		System.out.println("\nA dist�ncia � de: " +dist�ncia1);
		
		

	}

}
