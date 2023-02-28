package ExercíciosPOOExemplo;

public class TesteFiguras {

	public static void main(String[] args) {
		
		Quadrado fig1 = new Quadrado (10,"Quadrado1"); //Parâmetros
		Retangulo fig2 = new Retangulo (3,4,"Retangulo1"); //Parâmetros
		
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal());
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());
		
	}

}
