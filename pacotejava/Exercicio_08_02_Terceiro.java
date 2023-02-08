package pacotejava;

import java.util.Scanner;

public class Exercicio_08_02_Terceiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segundos,minutos,horas,emSegundos;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\nDigite o tempo de duração do evento em segundos: ");
		emSegundos = leia.nextInt();
		
		horas = emSegundos / 3600;
		minutos = (emSegundos - (horas*3600))/60;
		segundos = (emSegundos - (horas*3600)-(minutos*60));
	    
	    
	    System.out.println("\nO tempo em horas foi: " +horas);
	    System.out.println("\nO tempo em minutos foi: " +minutos);
	    System.out.println("\nO tempo em segundos foi: " +segundos);
	   
	    

	}

}
