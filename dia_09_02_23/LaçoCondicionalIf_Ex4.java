package dia_09_02_23;

import java.util.Scanner;

public class LaÁoCondicionalIf_Ex4 {

	public static void main(String[] args) {
		// ExercÌcio 4 da lista 1
		
		String p1,p2,p3;
		
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\nEntre com a primeira palavra: ");
		p1 = leia.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		p2 = leia.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		p3 = leia.nextLine();
		
		if (p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("ave")) {
				if (p3.equalsIgnoreCase("carnÌvoro")) {
					System.out.println("\n… uma ·guia");
				}else {
					System.out.println("\n… uma pomba");
				}
				}else {
					if (p3.equalsIgnoreCase("onÌvero")) {
						System.out.println("\n… um ser humano");
					}else {
						System.out.println("\n… uma vaca");
					}
				}
			}else {
				if (p2.equalsIgnoreCase("inseto")) {
						if (p3.equalsIgnoreCase("hematofogo")) {
								System.out.println("\n… uma pulga");
						} else {
							System.out.println("\n… uma largarta");
						}
				 }else {
					if (p3.equalsIgnoreCase("hematofogo")) {
						System.out.println("\n… uma sanguessuga");
					}else {
						System.out.println("\n… uma minhoca");
				}
			}
		}
	}
}
