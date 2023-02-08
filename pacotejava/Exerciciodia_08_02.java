package pacotejava;

import java.util.Scanner;

public class Exerciciodia_08_02 {

	public static void main(String[] args) {
		// Primeiro exercicio dia 08.02.23
		
		int anos,meses,dias;
		int idadeEmDias;
		int idadeEmMeses;
		int idadeEmAnos;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\nDigite sua idade em anos:");
		anos = leia.nextInt();
		System.out.println("\nDigite sua idade em meses:");
		meses = leia.nextInt();
		System.out.println("\nDigite sua idade em dias:");
		dias = leia.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		System.out.println("\nSua idade em dias é: " +idadeEmDias);
		
		
		
		

	}

}
