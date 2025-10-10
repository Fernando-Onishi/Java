package PrimerioProjeto;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		int[] idade = new int[5];
		idade[0] = 20;
		idade[1] = 22;
		idade[2] = 16;
		idade[3] = 30;
		idade[4] = 40;
		System.out.println(idade[3]); //30
		
		double[] salario = new double[3];
		for(int i = 0; i < salario.length; i++) {
			System.out.print("Salário "+i+":");
			salario[i] = scanner.nextDouble();
		}
		
		System.out.println("Mostrando o vetor");
		for(int i = 0; i < 3; i++) {
			System.out.println("Salário "+i+":"+salario[i]);
		}
		
		String[] avaliacao = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe sua avaliação: ");
			avaliacao[i] = scanner.next();
			if(avaliacao[i].equalsIgnoreCase("Bom")) {
				System.out.println("Obrigado");
			}else {
				System.out.println("Tchau");
			}
		}
		
		/*Crie um vetor inteiro de três posições e mostre ele ao contrario*/
		int[] posicao = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite as posições["+i+"]:");
			posicao[i] = scanner.nextInt();
		}
			for(int i = 2; i >= 0; i--) {
				System.out.println("Posição["+i+"]:"+posicao[i]);
		}
		 
			
		
		
		
		
		
		
		
		
		
		
		
	
	}
}