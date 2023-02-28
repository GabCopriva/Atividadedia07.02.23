package ExercíciosPOOExemplo;

public interface Figuras {
	//Interface: Classe abstrata
	
	//Atributo
	public String nomeInterface = "Figuras";
	
	//Métodos abstrados
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	
	//Métodos não-abstratos
	public double getArea();
	public double getPerimetro();
	double getDiagonal(); //Quando não coloca, por padrão ele já sabe que é public
	
	
	

}
