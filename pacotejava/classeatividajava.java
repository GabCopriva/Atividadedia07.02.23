package pacotejava;

import java.util.Scanner;

public class classeatividajava {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		float salario,abono,salarioNovo;
		
		System.out.println("\nQual é o seu salário?");
		salario = leia.nextFloat ();
		System.out.println("\nQual é o valor do abono?");
		abono = leia.nextFloat();
		
		salarioNovo= salario + abono;
		
		System.out.println("\nSeu novo salário é: " + salarioNovo);
		
		
		
	}

}
