package dia_10_02_23_LaçoDeRepetição;

import java.util.Scanner;

public class Exemplo_Tabuada_While {

	public static void main(String[] args) {
		
		int tabuada,x=1,res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a tabuada: ");
		tabuada = leia.nextInt();//8
		
		do {
			
			res = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+res);
			x++; // x = x + 1
			
		}while(x<=10);

	}

}

