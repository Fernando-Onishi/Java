package PrimerioProjeto;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //java.util
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		boolean ingresso = scanner.nextBoolean();
		
		if(idade >= 18 && ingresso) {
			System.out.println("Entrada permitida");
		}else {
			System.out.println("Entrada Negada");
		}
		
		System.out.println("----------------------------------");
		System.out.println("Qual sua nota? (0 a 10) ");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100)");
		int frequencia = scanner.nextInt();
		
		if(nota >7 || frequencia >=75) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		System.out.println("-----------------------");
		/*Para logar o usuário precisa responder uma serie de perguntas, se 
		 * ele é adminstrador e se está logado*/
		
		System.out.print("Você é adminstrador? (true/false) R:");
		boolean resposta = scanner.nextBoolean();
		System.out.print("Você está logado? (true/false) R:");
		boolean resposta1 = scanner.nextBoolean();
		if(resposta && resposta1) {
			System.out.println("Acesso Permitido!");
		}else{
			System.out.println("Acesso Negado!");
		}
			
		/* Peça uma letra para o usuário, se ela for A, E, I, O ou U
		 * mostre "vogal, senão, mostre consoante*/
		
		String vogal1;
		System.out.println("Digite uma letra ao usuário: ");
		vogal1 = scanner.next();
		if(vogal1.equalsIgnoreCase("A") || vogal1.equalsIgnoreCase("E") || vogal1.equalsIgnoreCase("I") || vogal1.equalsIgnoreCase("O") || vogal1.equalsIgnoreCase("U")) {
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}
		
	}
}
