package Exerc�ciosPOO;
import Exerc�ciosPOO.Cliente;
public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Rafael","22","rafael@email.com","S�o Paulo", "SP");
		c1.imprimirInfo();
		
		
		System.out.println("Nome do cliente");
		c1.setNome("Rafael");
		c1.imprimirInfo();
		
		System.out.println("Cidade do cliente");
		c1.setCidade("S�o Paulo");
		c1.imprimirInfo();
		
	}
	
	
}
