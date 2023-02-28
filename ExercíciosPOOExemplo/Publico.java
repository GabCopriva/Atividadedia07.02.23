package Exerc�ciosPOOExemplo;

public class Publico extends Exemplo_Telefone {
		
	public Publico() {
		super("Telefone P�blico");
	}
	
	@Override
	public void toca (int numToques) {
		
		for (int i=0; i<numToques; i++) {
			System.out.println("Piriririmmm Piriririmmm Piriririmmm");
		}
		
	}
	
	@Override
	public void disca(String numero) {
		
		if (numero.charAt(0)=='9' || numero.charAt(0)=='8') { //Se o primeiro n�mero for o 9 ou com 8
			System.out.println("Este tipo de telefone n�o liga para celular");
		} else {
			System.out.println("\nDicando: "+numero);
		}
	}
}
