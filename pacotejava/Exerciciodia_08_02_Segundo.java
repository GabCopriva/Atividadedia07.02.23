package pacotejava;

import java.util.Scanner;

public class Exerciciodia_08_02_Segundo {

	public static void main(String[] args) {
		// Segundo exercicio dia 08.02.23
		
		int n�merodedias, anos, meses, dias;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite sua idade em dias: ");
		n�merodedias = leia.nextInt();
		
		anos = n�merodedias / 365;
		meses = (n�merodedias - anos * 365) / 30;
		dias = (n�merodedias - anos * 365 - meses*30);
		
		System.out.println("Anos:" +anos);
		System.out.println("Meses" +meses);
		System.out.println("Dias" +dias);

	}

}
