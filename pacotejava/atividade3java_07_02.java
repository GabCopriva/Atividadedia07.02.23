package pacotejava;

import java.util.Scanner;

public class atividade3java_07_02 {

	public static void main(String[] args) {
		// Atividade número 3 do dia 07.02.23
		
		float saláriobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
		
		Scanner leia = new Scanner (System.in);
		 
		System.out.println("\nDigite o salário bruto:");
		saláriobruto = leia.nextInt();
		System.out.println("\nDigite o adicional noturno:");
		adicionalnoturno = leia.nextInt();
		System.out.println("\nDigite as horas extras:");
		horasextras = leia.nextInt();
		System.out.println("\nDigite os descontos de colaborador:");
		descontos = leia.nextInt();
		
		salarioliquido = saláriobruto + adicionalnoturno + (horasextras*5) - descontos;
		System.out.println("\nSeu salário líquido é de: " + salarioliquido);
		
		
		
	}

}
