package continuaçãoexerciciosdia_08_02;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// Exercicio 8 do dia 08.02.23
		
		Scanner leia = new Scanner (System.in);
		
		float cf,pd,imposto,cc;
		
		pd = 28;
		imposto = 45;
		
		System.out.println("\nDigite o custo de fábrica do carro: ");
		cf = leia.nextFloat();
		
		    
	    pd = cf + (cf*imposto/100);
	    imposto = cf + (cf*imposto/100);
	    cc = cf + pd + imposto;
	    System.out.println("\nO custo do consumidor vai ser de: " +cc);
	        
		

	}

}
