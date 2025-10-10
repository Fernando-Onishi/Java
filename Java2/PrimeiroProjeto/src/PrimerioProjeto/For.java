package PrimerioProjeto;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // java.util

		// Mostrando os números até 10
		for (int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);
		}

		// Mostrando uma mensagem
		for (int texto = 1; texto <= 3; texto++) {
			System.out.println("Hoje é quinta");
		}

		System.out.println("=======================");

		/*
		 * Peça cinco salários para o usuário, se o salário for menor ou igual a 1500,
		 * mostre "você terá um aumento", senão, mostre "sem aumento"
		 */
		for (int cont = 1; cont <= 5; cont++) {
			System.out.println("Digite um salário");
			double salario = scanner.nextDouble();
			if (salario <= 1500) {
				System.out.println("Você terá um aumento");
			} else {
				System.out.println("Sem aumento");
			}
		}

		/*O usuário irá informar um valor 5 vezes, some os valores 
		 digitados por ele emostre o resultado no final*/
		int valorTotal = 0;
		for(int usu = 1; usu <=5; usu++) {
			System.out.println("Informe um valor");
			int valor = scanner.nextInt();
			valorTotal = valorTotal + valor;
		}
		System.out.println("Valor total é:"+valorTotal);
		
	}
}
