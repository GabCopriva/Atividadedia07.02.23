package Exerc�ciosPOOExemplo;

public class Fixo extends Exemplo_Telefone {
	
	public Fixo() {
		super("Telefone Fixo");
	}
	
	//M�todos abstrados
	
	@Override //M�todo polimorfico
	public void toca(int numToques) {
		
		for (int i=0; i<numToques; i++) {
			System.out.println("Trimmm Trimmm Trimmm");
		}
	}
	@Override //M�todo polimorfico
	public void disca(String numero) {
		System.out.println("\nDicando: "+numero);
	}

}
