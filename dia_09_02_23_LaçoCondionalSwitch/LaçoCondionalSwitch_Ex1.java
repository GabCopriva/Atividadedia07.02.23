package dia_09_02_23_La�oCondionalSwitch;

import java.util.Scanner;

public class La�oCondionalSwitch_Ex1 {

	public static void main(String[] args) {
		// Exrcec�cio 1 lista 2
		
		int op��o,quantidade;
		int valor;
				
		Scanner leia = new Scanner (System.in);

		System.out.println("# ## ### #### #########   Menu Fam�lia 60  ########## #### ### ## #");
		System.out.println("\nC�digo 1 para Cachorro Quente - R$10,00");
		System.out.println("\nC�digo 2 para X-Salada - R$15,00");
		System.out.println("\nC�digo 3 para X-Bacon - R$18,00");
		System.out.println("\nC�digo 4 para Bauru - R$12");
		System.out.println("\nC�digo 5 para Refrigerante - R$8");
		System.out.println("\nC�digo 6 para Suco de Laranja - R$13,00");
		System.out.println("\nDigite o c�digo do produto: ");
		op��o = leia.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		quantidade = leia.nextInt();	
		
				
		switch (op��o) {
		case 1:
			valor = quantidade * 10;
			System.out.println("\nCachorro Quente = " +valor);
			break;
		case 2:
			valor = quantidade *15;
			System.out.println("\nX-Salada = " +valor);
			break;
		case 3:
			valor = quantidade *18;
			System.out.println("X-Bacon = " +valor);
			break;
		case 4:
			valor = quantidade *12;
			System.out.println("Bauru = " +valor);
			break;
		case 5:
			valor = quantidade *8;
			System.out.println("Refrigerante = " +valor);
			break;
		case 6:
			valor = quantidade *13;
			System.out.println("Suco de Laranja = " +valor);
			break;
		} 
	}	
	
}