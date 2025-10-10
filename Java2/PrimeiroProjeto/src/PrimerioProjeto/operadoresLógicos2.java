package PrimerioProjeto;

import java.util.Scanner;

public class operadoresLógicos2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		System.out.println("Qual a sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Tem título de eleitor?");
		String resposta = scanner.next();
		// e
		if (idade >= 16 && resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();

		if(numero >= 10 && numero <=20) {
			System.out.println("O número está entre 10 e 20");
		}else {
			System.out.println("O número está fora");
		}

		//Compra maior que 200
		
		System.out.println("Qual o valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("É cliente VIP? ");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f ", valorFinal +"\n");
		}else {
			System.out.println("Não tem desconto");
		}
		
		/* Para participar de um workshop precisa ter idade entre 20
		 *  e 40 anos e possuir experiência. Se as informações forem
		 * verdadeiras exiba "Inscrição aceita", senão "inscrição rejeitada" */
		
		System.out.print("Qual a sua idade? \nR:");
		int idade1 = scanner.nextInt();
		System.out.print("Possui experiência? \nR:");
		String resposta1 = scanner.next();
		if(idade1 > 20 && idade1 <40 && resposta1.equalsIgnoreCase("Sim")) {
			System.out.println("Inscrição aceita");
		}else {
			System.out.println("Inscrição rejeitada");
		}
		
	}

}
