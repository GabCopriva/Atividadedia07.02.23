package pacotejava;

import java.util.Scanner;

public class atividade4java_07_02 {

	public static void main(String[] args) {
		// Exerc�cio n�mero 4 do dia 07.02.23
		
		double n1,n2,n3,n4,diferen�a;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o n�mero 1: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite o n�mero 2: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite o n�mero 3: ");
		n3 = leia.nextDouble();
		System.out.println("\nDigite o n�mero 4: ");
		n4 = leia.nextDouble();
		
		diferen�a = (n1*n2) - (n3*n4);
		System.out.println("\n A diferen�a � de: " +diferen�a);
		
		
		

	}

}
