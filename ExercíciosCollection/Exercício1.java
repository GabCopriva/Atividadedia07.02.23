package ExercíciosCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercício1 {

	public static void main(String[] args) {
		/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
		O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
		Em seguida, faça o que se pede:
		Mostre na tela todas as cores que foram adicionadas. 
		Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
		*/
		
		//Scanner
		Scanner leia = new Scanner  (System.in);
		
		String [] cores = {"amarelo","azul","branco","laranja","verde"};
		
		//Array
		ArrayList<String> color = new ArrayList<String>();
		
		
		//For
		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = leia.next();
			
			System.out.println("\nA cor " +cor+ " foi adiocionada.");
			
	   //Add
			color.add(cor);
					
			
	   //Lista cores
			System.out.println("\nListar todas as cores: ");
			
	  //For?
			//for (String listaCores : cores ) {
	 
	 
			
		}
	 //Cores em ordem
			/*amarelo
			 * azul
			 * branco
			 * laranja
			 * verde
			 */
						
	}

	}
}
