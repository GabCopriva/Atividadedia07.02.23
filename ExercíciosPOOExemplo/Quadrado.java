package Exerc�ciosPOOExemplo;

public class Quadrado extends BaseFigura implements Figuras {
	         //Cria m�ltipla heran�a com "implements"
		
	//Construtor
	Quadrado(double lado, String nome){ //Par�metros
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2)*lado1; //Como calcular a diagonal de um quadrato
	}
	
	}


