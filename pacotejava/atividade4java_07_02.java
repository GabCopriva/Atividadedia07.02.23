package pacotejava;

import java.util.Scanner;

public class atividade4java_07_02 {

	public static void main(String[] args) {
		// Exercício número 4 do dia 07.02.23
		
		double n1,n2,n3,n4,diferença;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o número 1: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite o número 2: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite o número 3: ");
		n3 = leia.nextDouble();
		System.out.println("\nDigite o número 4: ");
		n4 = leia.nextDouble();
		
		diferença = (n1*n2) - (n3*n4);
		System.out.println("\n A diferença é de: " +diferença);
		
		
		

	}

}
