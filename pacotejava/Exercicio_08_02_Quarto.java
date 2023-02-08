package pacotejava;

import java.util.Scanner;

public class Exercicio_08_02_Quarto {

	public static void main(String[] args) {
		// Exercício 4 do dia 08.02.23
		
		int A,B,C;
		int R,S,D;
		double resultadoR;
		double resultadoS,resultadoD;
		
		
	    Scanner leia = new Scanner (System.in);
	    
	    System.out.println("\nEntre com o valor da letra A:  ");
		A = leia.nextInt();
		System.out.println("\nEntre com o valor da letra B:  ");
		B = leia.nextInt();
		System.out.println("\nEntre com o valor da letra C:  ");
		C = leia.nextInt();
		
		
		resultadoR= Math.pow(A, B);
		resultadoS= Math.pow(B, C);
		resultadoD = resultadoR+resultadoS / 2;
		System.out.println(resultadoD);
		System.out.println("\nO resultado de D=R+S/2 é de: " +resultadoD);

		
	}

}
