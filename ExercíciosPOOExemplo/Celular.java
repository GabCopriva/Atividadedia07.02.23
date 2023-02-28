package ExercíciosPOOExemplo;

public class Celular extends Exemplo_Telefone {
	
	
	//Construtor
		public Celular() {
		super("Telefone Celular");
		
	}
	    @Override //Sobrescrevendo um método da minha superclass
		public void toca(int codigoToque) {
			switch (codigoToque) {
			case 1:
				System.out.println("tãtãtãtantan tãtã");
				break;
			
			case 2:
				System.out.println("blim blim blim");
				break;
				
			default:
				System.out.println("parãrã parãrã parãrã");		
			}
		}
	    
	    @Override //Indicando que é um método polimórfico 
	    public void disca (String numero) {
	    	System.out.println("O número: "+numero+" é um celular...");
	    	
	    }
}
