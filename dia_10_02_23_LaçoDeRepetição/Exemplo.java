package dia_10_02_23_La�oDeRepeti��o;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// Exemplo de la�os de repeti��o FOR
		
		float n1,n2,n3,n4,media = 0,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner (System.in);
		/* X ++ � X = X +! - Vai somando a cada passagem de um looping
		- 
		
		- Come�a com o primeiro aluno e vai at� o quarto aluno
		*/	
		for(x=1;x<=4; x++ ) //In�cio;Come�o;Fim 
			{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			for(x=1;x<=4; x++ ) {
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
				for(x=1;x<=4; x++ ) {
					System.out.println("\nEntre com a terceira nota: ");
					n3 = leia.nextFloat();
					
					//media alune 1 = 8 media alune 2 = 7 media alune 3 = 5 media alune 4 = 8
					System.out.println("\nM�dia de alune "+x+" foi de: "+ media);
		
		somaMedia += media;//somaMedia = somaMedia + media		(media vale 8 ou 2 ou 7, 8, etc)	
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nM�dia geral: %.2f,mg");
	}

}
}
}

