package ExercíciosEstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Atividade1 {

	public static void main(String[] args) {
		// Atividade 01 – Fila
		
		//Scanner
		Scanner leia = new Scanner (System.in);
		
		//Stack
		Queue<String> fila = new LinkedList<String>();
		
		//Var
		int opcao;
		String titulo;
		

		//While
		while (true) {
			System.out.println("# ## ### #### ######### Menu ########## #### ### ## #");
			System.out.println("\n ## Entre com a opção desejada: ##");
			System.out.println("\n1 - Digite seu nome para entrar na fila");
			System.out.println("\n2 - Listar todos os clientes na fila ");
			System.out.println("\n3 - Chamar/Retirar algum cliente da fila ");
			System.out.println("\n0 - Sair ");
			System.out.println("                                                     ");
			System.out.println("# ## ### #### ########################## #### ### ## #");
			opcao = leia.nextInt();
			
			//IF
			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!!");
				leia.close();
				System.exit(0);
		}
			//Switch 
			switch (opcao) {
			case 1:
				System.out.println("Adicionado cliente na fila.");
				
				System.out.println("\nDigite o nome do cliente: ");
				leia.skip("\\R?");
				titulo = leia.nextLine();
				
				fila.add(titulo);
				
				System.out.println("\nCliente adicionado!");
				
				break;
			case 2:
				System.out.println("\nListar todos os clientes:");
				
				Iterator<String> iterator = fila.iterator();
				
				while(iterator.hasNext()){
				   System.out.println(iterator.next());
				}
				
				break;
			case 3:
				System.out.println("\nRetirar cliente da fila.");

				if (fila.isEmpty())
					System.out.println("\nA fila está vazia!");
				else
					fila.isEmpty();
				
				System.out.println("\nCliente retirado da fila");
									
				break;
			default:
				System.out.println("\nPrograma Finalizado!\n");
				break;
}
	}
		
		
			
}

}


