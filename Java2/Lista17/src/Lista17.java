import java.util.Scanner;

public class Lista17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
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
		int[][] numeros1 = new int[3][3];
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite os números na posição["+i+"]["+j+"]:");
				numeros1[i][j] = scanner.nextInt();
			}
		}
		for(int i = 0; i <3; i++) {
				System.out.println(numeros1[i][i]);	
			}
		
		//4
		boolean encontrado = false;
		int[][] matriz = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Número [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
			}
		}
		
		 System.out.print("\nDigite um número para buscar na matriz: ");
	        int numeroBusca = scanner.nextInt();
	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz[i][j] == numeroBusca) {
	                    System.out.println("\nNúmero " + numeroBusca + " encontrado na posição:");
	                    System.out.println("Linha: " + i + " | Coluna: " + j);
	                    encontrado = true;
	                }
	            }
	        }

	        if (!encontrado) {
	            System.out.println("\nO número " + numeroBusca + " não foi encontrado na matriz.");
	        }
	        
	       //5
	        int[][] elementos = new int[4][3];

	        System.out.println("Digite os elementos da matriz 4x3:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                elementos[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("\nValores maiores que 10:");
	        boolean encontrou = false;

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (elementos[i][j] > 10) {
	                    System.out.println("Elemento [" + i + "][" + j + "] = " + elementos[i][j]);
	                    encontrou = true;
	                }
	            }
	        }

	        if (!encontrou) {
	            System.out.println("Nenhum valor maior que 10 foi encontrado na matriz.");
	        }
		
	}
}
