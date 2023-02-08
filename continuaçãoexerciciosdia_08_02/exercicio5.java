package continuaçãoexerciciosdia_08_02;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Exercicio 5 do dia 08.02.23
		
		double n1,n2,n3,médiafinal,médiaponderada;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextDouble();
		
		médiafinal = ((n1*2)+(n2*3)+(n3*5));
		médiaponderada = médiafinal / 10;
		System.out.println("\nA média ponderada é de: " +médiaponderada);
	}

}
