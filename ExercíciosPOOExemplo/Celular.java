package Exerc�ciosPOOExemplo;

public class Celular extends Exemplo_Telefone {
	
	
	//Construtor
		public Celular() {
		super("Telefone Celular");
		
	}
	    @Override //Sobrescrevendo um m�todo da minha superclass
		public void toca(int codigoToque) {
			switch (codigoToque) {
			case 1:
				System.out.println("t�t�t�tantan t�t�");
				break;
			
			case 2:
				System.out.println("blim blim blim");
				break;
				
			default:
				System.out.println("par�r� par�r� par�r�");		
			}
		}
	    
	    @Override //Indicando que � um m�todo polim�rfico 
	    public void disca (String numero) {
	    	System.out.println("O n�mero: "+numero+" � um celular...");
	    	
	    }
}
