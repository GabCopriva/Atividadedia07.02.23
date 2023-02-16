package ExercíciosEstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Teste {

	public static void main(String[] args) throws InterruptedException {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		
		int opcao;
		String titulo;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar cliente na fila            ");
			System.out.println("            2 - Listar todos os clientes             ");
			System.out.println("            3 - Retirar cliente da fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionado cliente na fila.");
					
					System.out.println("\nDigite o nome do cliente: ");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					
					pilha.push(titulo);
					
					System.out.println("\nCliente adicionado!");
					
					break;
				case 2:
					System.out.println("\nListar todos os clientes:");
					
					Iterator<String> iterator = pilha.iterator();
					
					while(iterator.hasNext()){
					   System.out.println(iterator.next());
					}
					
					break;
				case 3:
					System.out.println("\nRetirar cliente da fila.");

					if (pilha.isEmpty())
						System.out.println("\nA fila está vazia!");
					else
						pilha.pop();
					
					System.out.println("\nCliente retirado da fila");
										
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
}
		}
	}
}