package pacotejava;

import java.util.Scanner;

public class atividade3java_07_02 {

	public static void main(String[] args) {
		// Atividade n�mero 3 do dia 07.02.23
		
		float sal�riobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
		
		Scanner leia = new Scanner (System.in);
		 
		System.out.println("\nDigite o sal�rio bruto:");
		sal�riobruto = leia.nextInt();
		System.out.println("\nDigite o adicional noturno:");
		adicionalnoturno = leia.nextInt();
		System.out.println("\nDigite as horas extras:");
		horasextras = leia.nextInt();
		System.out.println("\nDigite os descontos de colaborador:");
		descontos = leia.nextInt();
		
		salarioliquido = sal�riobruto + adicionalnoturno + (horasextras*5) - descontos;
		System.out.println("\nSeu sal�rio l�quido � de: " + salarioliquido);
		
		
		
	}

}
