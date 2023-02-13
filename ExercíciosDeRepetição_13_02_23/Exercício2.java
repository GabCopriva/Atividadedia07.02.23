package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// Exercício 2. Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		//Scanner
		
		Scanner leia = new Scanner (System.in);
		
		//Variáveis
		
		int num = 0, par = 0, impar = 0;
			
		//FOR
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
					
			if(num%2 == 0){
				par++;
			}
			if (num%2 == 1){
				impar++;
			} 
				
			}
				System.out.println("\nOs números pares são: " +par);
				System.out.println("\nOs números ímpares são: " +impar);
			}
			
			
		}
