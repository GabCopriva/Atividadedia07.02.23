package Exerc�ciosPOOExemplo;

public class TesteFiguras {

	public static void main(String[] args) {
		
		Quadrado fig1 = new Quadrado (10,"Quadrado1"); //Par�metros
		Retangulo fig2 = new Retangulo (3,4,"Retangulo1"); //Par�metros
		
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal());
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());
		
	}

}
