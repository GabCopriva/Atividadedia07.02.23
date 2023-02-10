package Lista03LaçodeRepetiçãoDo;

import java.util.Scanner;

public class Execício_1 {

	public static void main(String[] args) {
		// Exercício 1 da lista 3
		
		int numero,somaPositivo=0, cont=0,result;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
			
		do {
			System.out.println("\n Digite um número: ");
			numero = leia.nextInt();
			
			result = cont++;
			System.out.println("A soma dos números é de:" +result);
									
		} while ((numero%2) == 0);{
		System.out.printf("\nA soma dos números positivos é: " +somaPositivo);
				
			}
	

}
}
