package dia_09_02_23;

import java.util.Scanner;

public class LacoDecisaoIF {

	public static void main(String[] args) {
		// La�o Decis�o aula dia 09.02.23
		
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
		System.out.printf("\nM�dia: %.2f",media);//3,2
		
		if(media>=7 && media<=10) {
			System.out.println("\nParab�ns, voc� foi APROVADE!!!");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAten��o, voc� est� de EXAME!!!");
		}
		else if(media>=0 && media<5) {
			System.out.println("\nPoxa vida, voc� foi REPROVADE!!!");
		}
		else {
			System.out.println("\nPor favor, verifique as notas pois a m�dia deu errado!!!");
		}
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\nEscolha um elogio para a Fam�lia 60");
		System.out.println("\n1- Sensacional");
		System.out.println("\n2- Incr�vel");
		System.out.println("\n3- Maravilhosa");
		System.out.println("\n4- Legal");
		System.out.println("\nDigite a sua op��o: ");//1
		op = leia.nextInt();//op=1
		
		switch(op) {
		
		case 1:
			System.out.println("\nSensacional");
		break;
		case 2:
			System.out.println("\nIncr�vel");
		break;
		case 3:
			System.out.println("\nMaravilhosa");
		break;
		case 4:
			System.out.println("\nLegal");
		break;
		default:
			System.out.println("\nOp��o Inv�lida!!!");
		}
		
		

	}

}
