package dia_09_02_23;

import java.util.Scanner;

public class LacoDecisaoIF {

	public static void main(String[] args) {
		// Laço Decisão aula dia 09.02.23
		
		double n1,n2,n3,media;
		int op;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (n1+n2+n3)/3;
		System.out.printf("\nMédia: %.2f",media);//3,2
		
		if(media>=7 && media<=10) {
			System.out.println("\nParabéns, você foi APROVADE!!!");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAtenção, você está de EXAME!!!");
		}
		else if(media>=0 && media<5) {
			System.out.println("\nPoxa vida, você foi REPROVADE!!!");
		}
		else {
			System.out.println("\nPor favor, verifique as notas pois a média deu errado!!!");
		}
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\nEscolha um elogio para a Família 60");
		System.out.println("\n1- Sensacional");
		System.out.println("\n2- Incrível");
		System.out.println("\n3- Maravilhosa");
		System.out.println("\n4- Legal");
		System.out.println("\nDigite a sua opção: ");//1
		op = leia.nextInt();//op=1
		
		switch(op) {
		
		case 1:
			System.out.println("\nSensacional");
		break;
		case 2:
			System.out.println("\nIncrível");
		break;
		case 3:
			System.out.println("\nMaravilhosa");
		break;
		case 4:
			System.out.println("\nLegal");
		break;
		default:
			System.out.println("\nOpção Inválida!!!");
		}
		
		

	}

}
