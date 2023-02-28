package ExercíciosPOOExemplo;

public class Retangulo extends BaseFigura implements Figuras {
		
	//Construtor
	Retangulo(double lado1, double lado2, String nome){ //Parâmetros
		super(lado1,lado2,nome);
		nomeClasse = "Retângulo";
	}
	
	public double getDiagonal () {
		return Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2, 2));
	}
}
