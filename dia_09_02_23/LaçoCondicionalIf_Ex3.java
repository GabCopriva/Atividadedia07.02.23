package dia_09_02_23;

import java.util.Scanner;

public class La�oCondicionalIf_Ex3 {

	public static void main(String[] args) {
		// Exerc�cio 3 da lista 1
		
		String nomeDoador;
		int idade;
		String sim,n�o;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite seu nome: ");
		nomeDoador = leia.nextLine();
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\n� sua primeira doa��o?");
		sim = leia.nextLine();
		n�o = leia.nextLine();
		
		
		if ((idade>=18) && (idade<=69)) {
		}
		else if (nomeDoador == n�o){
			System.out.println(nomeDoador+" Voc� est� apto para doar sangue.");
		}
		
		if ((idade <= 69 && (idade >=60))) {
		}
		else if (nomeDoador == sim){
			System.out.println(nomeDoador+" Voc� n�o poder� doar sangue.");
		}	
		else if (nomeDoador == n�o) {
				System.out.println(nomeDoador+" Voc� poder� doar sangue.");
		}
		
		
		
	}
	}





	
