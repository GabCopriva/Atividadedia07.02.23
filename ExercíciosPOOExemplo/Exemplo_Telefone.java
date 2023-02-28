package Exerc�ciosPOOExemplo;

public abstract class Exemplo_Telefone {
	
	//Atributo
	private String tipo;
	
	//M�todos abstrados
	abstract public void disca (String numero);
	abstract public void toca (int numToques);
		
	//Construtores
	public Exemplo_Telefone(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
