package Lista02La�odeRepeti��oWhile;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		// Exerc�cio 4 da lista 2
		

		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		int idade, identifica��o, cargo = 0, pBackend = 0, mFrontend = 0,hMobile = 0, mFulltrinta =0;
		String continua = "SIM";
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while (!continua.equals("n")) {
			
			System.out.println("\nDigite como voc� se identifica: ");
			System.out.println("\nC�digo 1 - Masculino");
			System.out.println("\nC�digo 2 - Feminino");
			System.out.println("\nC�digo 3 - Outro");
			System.out.println("\nC�digo 4 - N�o desejo informar");
			identifica��o = leia.nextInt();
			
			System.out.println("\nDigite qual � o seu cargo: ");
			System.out.println("\nC�digo 1 - FullStack");
			System.out.println("\nC�digo 2 - Frontend");
			System.out.println("\nC�digo 3 - Backend");
			System.out.println("\nC�digo 4 - Mobile");
			cargo = leia.nextInt();
			
			System.out.println("\nVoc� gostaria de continuar?: ");
			System.out.println("\nSIM / N�O");
			continua = leia.next();
			
				if (cargo == 3) {
					pBackend++;
				} if (cargo == 2) {
					if (identifica��o == 2);
						mFrontend++;
						} if (cargo == 3) {
					if (identifica��o == 2) {
						if (idade > 40) {
							hMobile++;							
						}
					}
						} if (cargo == 1) {
					if (identifica��o == 2) {
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
