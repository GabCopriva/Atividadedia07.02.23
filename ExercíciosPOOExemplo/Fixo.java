package ExercíciosPOOExemplo;

public class Fixo extends Exemplo_Telefone {
	
	public Fixo() {
		super("Telefone Fixo");
	}
	
	//Métodos abstrados
	
	@Override //Método polimorfico
	public void toca(int numToques) {
		
		for (int i=0; i<numToques; i++) {
			System.out.println("Trimmm Trimmm Trimmm");
		}
	}
	@Override //Método polimorfico
	public void disca(String numero) {
		System.out.println("\nDicando: "+numero);
	}

}
