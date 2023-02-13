package Lista02LaçodeRepetiçãoWhile;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		// Exercício 4 da lista 2
		

		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		int idade, identificação, cargo = 0, pBackend = 0, mFrontend = 0,hMobile = 0, mFulltrinta =0;
		String continua = "SIM";
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while (!continua.equals("n")) {
			
			System.out.println("\nDigite como você se identifica: ");
			System.out.println("\nCódigo 1 - Masculino");
			System.out.println("\nCódigo 2 - Feminino");
			System.out.println("\nCódigo 3 - Outro");
			System.out.println("\nCódigo 4 - Não desejo informar");
			identificação = leia.nextInt();
			
			System.out.println("\nDigite qual é o seu cargo: ");
			System.out.println("\nCódigo 1 - FullStack");
			System.out.println("\nCódigo 2 - Frontend");
			System.out.println("\nCódigo 3 - Backend");
			System.out.println("\nCódigo 4 - Mobile");
			cargo = leia.nextInt();
			
			System.out.println("\nVocê gostaria de continuar?: ");
			System.out.println("\nSIM / NÃO");
			continua = leia.next();
			
				if (cargo == 3) {
					pBackend++;
				} if (cargo == 2) {
					if (identificação == 2);
						mFrontend++;
						} if (cargo == 3) {
					if (identificação == 2) {
						if (idade > 40) {
							hMobile++;							
						}
					}
						} if (cargo == 1) {
					if (identificação == 2) {
						if (idade < 30) {
							mFulltrinta++;
						}
					}
				}
			}
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", pBackend);
		System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d", mFrontend);
		System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d", hMobile);
		System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d", mFulltrinta);

	}

}
