package ExercíciosPOOExemplo;

public class Quadrado extends BaseFigura implements Figuras {
	         //Cria múltipla herança com "implements"
		
	//Construtor
	Quadrado(double lado, String nome){ //Parâmetros
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2)*lado1; //Como calcular a diagonal de um quadrato
	}
	
	}


