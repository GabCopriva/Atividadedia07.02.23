package dia_09_02_23;

import java.util.Scanner;

public class LaçoCondicionalIf_Ex3 {

	public static void main(String[] args) {
		// Exercício 3 da lista 1
		
		String nomeDoador;
		int idade;
		String sim,não;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite seu nome: ");
		nomeDoador = leia.nextLine();
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nÉ sua primeira doação?");
		sim = leia.nextLine();
		não = leia.nextLine();
		
		
		if ((idade>=18) && (idade<=69)) {
		}
		else if (nomeDoador == não){
			System.out.println(nomeDoador+" Você está apto para doar sangue.");
		}
		
		if ((idade <= 69 && (idade >=60))) {
		}
		else if (nomeDoador == sim){
			System.out.println(nomeDoador+" Você não poderá doar sangue.");
		}	
		else if (nomeDoador == não) {
				System.out.println(nomeDoador+" Você poderá doar sangue.");
		}
		
		
		
	}
	}





	
