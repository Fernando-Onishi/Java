package PrimerioProjeto;

import java.util.Scanner;

public class Lista17 {

	public static void main(String[] args) {
		/*Essa é a lista 17, errei o nome também
		 * desculpa ): */
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] numeros1 = new int[3][3];
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite os números na posição["+i+"]["+j+"]:");
				numeros1[i][j] = scanner.nextInt();
			}
		}
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
					
				}
			}
		
		System.out.println("==========================");
		
		//1
		int[][] numeros = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Numeros["+i+"]["+j+"]:");
				numeros[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(numeros[i][j]);
			}
		}
		
		//2
		
		String[][] nomes = new String[3][2];
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Nomes:["+i+"]["+j+"]:");
				nomes[i][j] = scanner.next();
			}
		}
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Nome na posição [" + i + "][" + j + "]: " + nomes[i][j]);
            }
        }
		
		//3
		
		
	}
}