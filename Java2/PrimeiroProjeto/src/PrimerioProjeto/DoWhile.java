package PrimerioProjeto;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		
		
		int contador = 11;
			do {
				System.out.println("Do...While");
			}while(contador <= 10);
			
			while(contador <= 10) {
				System.out.println("While");
			}
			
			System.out.println("==============================");
			
			int numero = 0;
			do {
				System.out.println(numero);
				numero +=5;
			} while (numero<=20);
			
			System.out.println("==============================");
			
			int escolha = 0;
			int secreto = 5;
			do {
				System.out.println("Escolha um número: ");
				escolha = scanner.nextInt();
				if(escolha > secreto) {
					System.out.println("é menor");
				}else if (escolha < secreto) {
					System.out.println("É maipr");
				}
			} while (secreto != escolha);
			System.out.println("Acertouu");
			
			System.out.println("==============================");
			
			System.out.println("Escolha uma opção do menu");
			System.out.println("1 - Ficar na navegação");
			System.out.println("2 - Sair da navegação");
			int opcao = scanner.nextInt();
			do {
				System.out.println("Escolha novamente uma opção do menu");
				opcao = scanner.nextInt();
			}while(opcao != 2) ;
			
			System.out.println("==============================");
			
			/*Peça uma idade cinco vezes para o usuário, se a idade for menor ou igual
			 * a 12, mostre "Criança" senão, mostre "Não é criança"*/
			int idade;
			int cont = 1;
			do {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			if(idade <= 12) {
				System.out.println("CRIANÇA");
			}else{
				System.out.println("NÃO É CRIANÇA");
			}
			cont++;
			}while (cont <=5);
			System.out.println("FIM");
			
			/*Pergunte a nota para o usuário três vezes, se a nota for menor que cinco
			 * mostre "nota ruim" senão, mostre "Nota boa"*/
			
			System.out.println("==============================");
			int nota;
			int cont1 = 1;
			do {
				System.out.print("Digite sua nota: \nR:");
				nota = scanner.nextInt();
				if(nota <=5) {
					System.out.println("Nota ruim");
				}else {
					System.out.println("Nota Boa");
				}
				cont1++;
			}while(cont1 <=3);
			System.out.println("Diario Fechado");
			
			
			
			
	}

}
