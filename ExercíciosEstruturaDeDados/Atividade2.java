package Exerc�ciosEstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		// Atividade 01 � Pilha
		
		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		
		int opcao;
		String titulo;

		while (true) {

			System.out.println("#####################################################");
			System.out.println("           Entre com a op��o desejada:               ");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro na pilha             ");
			System.out.println("            2 - Listar todos os Livros               ");
			System.out.println("            3 - Retirar Livro da pilha               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("#####################################################");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Livro na pilha\n\n");
					
					System.out.println("\nDigite o nome do Livro: ");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					
					pilha.push(titulo);
					
					System.out.println("\nLivro Adicionado");
					
					break;
				case 2:
					System.out.println("Listar Livros na pilha\n\n");
					
					Iterator<String> iterator = pilha.iterator();
					
					while(iterator.hasNext()){
					   System.out.println(iterator.next());
					}
					
					break;
				case 3:
					System.out.println("Retirar Livro da pilha\n\n");

					if (pilha.isEmpty())
						System.out.println("\nA Pilha est� vazia!");
					else
						pilha.pop();
					
					System.out.println("\nLivro Retirado da pilha");
										
					break;
				default:
					System.out.println("\nOp��o Inv�lida!\n");
					break;
			}
		}


	}

	}

