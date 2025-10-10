package PrimerioProjeto;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int cont = 1; cont <=10; cont++) {
			System.out.println(cont);
		}
		
		System.out.println("=============================");
		
		System.out.println("Até que número você quer que eu conte?");
		int numero = scanner.nextInt();
		for(int vez = 1; vez <= numero; vez++) {
			System.out.println(vez);
		}
		
		System.out.println("=============================");
		
//		Classificação de números pares
		for(int i = 0; i >= 5; i++) {
			System.out.println("Escolha um número: ");
			int numero2 = scanner.nextInt();
			int div = numero2 % 2;
			if(div == 0) {
				System.out.println("O número é par");
			}else {
				System.out.println("O número é impar");
			}
		}
		
		System.out.println("=============================");
		
		int soma = 0;
		for(int i = 1; i <=3; i++) {
			int numero2 = 0;
			System.out.println("Informe um valor: ");
			int valor = scanner.nextInt();
			soma = soma + valor; // soma += valor
		}
		System.out.println("A soma é "+ soma);
		
		
		
	
		
	}
}