package Lista03La�odeRepeti��oDo;

import java.util.Scanner;

public class Exec�cio_1 {

	public static void main(String[] args) {
		// Exerc�cio 1 da lista 3
		
		int numero,somaPositivo=0, cont=0,result;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
			
		do {
			System.out.println("\n Digite um n�mero: ");
			numero = leia.nextInt();
			
			result = cont++;
			System.out.println("A soma dos n�meros � de:" +result);
									
		} while ((numero%2) == 0);{
		System.out.printf("\nA soma dos n�meros positivos �: " +somaPositivo);
				
			}
	

}
}
