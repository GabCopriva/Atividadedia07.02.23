package Exerc�ciosPOOExemplo;

public interface Figuras {
	//Interface: Classe abstrata
	
	//Atributo
	public String nomeInterface = "Figuras";
	
	//M�todos abstrados
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	
	//M�todos n�o-abstratos
	public double getArea();
	public double getPerimetro();
	double getDiagonal(); //Quando n�o coloca, por padr�o ele j� sabe que � public
	
	
	

}
