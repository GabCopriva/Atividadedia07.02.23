package ExercíciosPOO;
import ExercíciosPOO.Cliente;
public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Rafael","22","rafael@email.com","São Paulo", "SP");
		c1.imprimirInfo();
		
		
		System.out.println("Nome do cliente");
		c1.setNome("Rafael");
		c1.imprimirInfo();
		
		System.out.println("Cidade do cliente");
		c1.setCidade("São Paulo");
		c1.imprimirInfo();
		
	}
	
	
}
