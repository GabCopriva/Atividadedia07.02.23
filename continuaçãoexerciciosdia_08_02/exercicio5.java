package continua��oexerciciosdia_08_02;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Exercicio 5 do dia 08.02.23
		
		double n1,n2,n3,m�diafinal,m�diaponderada;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextDouble();
		
		m�diafinal = ((n1*2)+(n2*3)+(n3*5));
		m�diaponderada = m�diafinal / 10;
		System.out.println("\nA m�dia ponderada � de: " +m�diaponderada);
	}

}
