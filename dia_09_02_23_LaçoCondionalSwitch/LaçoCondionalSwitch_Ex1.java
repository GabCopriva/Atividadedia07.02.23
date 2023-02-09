package dia_09_02_23_LaçoCondionalSwitch;

import java.util.Scanner;

public class LaçoCondionalSwitch_Ex1 {

	public static void main(String[] args) {
		// Exrcecício 1 lista 2
		
		int opção,quantidade;
		int valor;
				
		Scanner leia = new Scanner (System.in);

		System.out.println("# ## ### #### #########   Menu Família 60  ########## #### ### ## #");
		System.out.println("\nCódigo 1 para Cachorro Quente - R$10,00");
		System.out.println("\nCódigo 2 para X-Salada - R$15,00");
		System.out.println("\nCódigo 3 para X-Bacon - R$18,00");
		System.out.println("\nCódigo 4 para Bauru - R$12");
		System.out.println("\nCódigo 5 para Refrigerante - R$8");
		System.out.println("\nCódigo 6 para Suco de Laranja - R$13,00");
		System.out.println("\nDigite o código do produto: ");
		opção = leia.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		quantidade = leia.nextInt();	
		
				
		switch (opção) {
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