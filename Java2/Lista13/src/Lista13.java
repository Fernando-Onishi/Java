import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		//1
		for(int cont = 10; cont <=30; cont++) {
			System.out.println(cont);
		}
		
		System.out.println("=======================");
		
		//2
		for(int cont1 = 1; cont1 <=10; cont1++){
			System.out.print("Digite uma idade \nR:");
			int idade = scanner.nextInt();
			if(idade <18) {
				System.out.println("Menor de idade");
			}else {
				System.out.println("Maior de idade");
			}
			}
		
		System.out.println("=======================");
		
		//3
		for(int cont2 = 1; cont2 <=5; cont2++) {
			System.out.print("1)Christian \n2)Fernando \n3)Danilo \n4)Jonas \n5)Nulo \n6)Branco \nQual o seu voto? \nR:");
			int voto = scanner.nextInt();
			if(voto == 1) {
				System.out.println("Seu voto foi destinado ao Christian");
			}else if(voto == 2) {
				System.out.println("Seu voto foi destinado ao Fernando");
			}else if(voto ==3) {
				System.out.println("Seu voto foi destinado ao Danilo");
			}else if(voto ==4) {
				System.out.println("Seu voto foi destinado ao Jonas");
			}else if(voto==5) {
				System.out.println("Seu voto foi nulo");
			}else if(voto ==6) {
				System.out.println("Seu voto é branco");
			}else {
				System.out.println("Digite um valor dentre as opções acima");
			}
		}
		
		System.out.println("=======================");
		
		//4
		System.out.println("A curiosidade é a chave que abre as portas do conhecimento.");
		System.out.print("Digite o número de vezes que vá querer repetir essa frase \nR:");
		int resposta = scanner.nextInt();
		for(int cont3 = 1; cont3 <= resposta; cont3++){
			System.out.println("A curiosidade é a chave que abre as portas do conhecimento.");
		}
		
		System.out.println("=======================");
		
		//5
		for(int seq = 50; seq >=30; seq--) {
			System.out.println(seq);
		}
		
		System.out.println("=======================");
		
		//6
		for(int seq1 = 1; seq1 <=50; seq1+=2) {
			System.out.println(seq1);
		}
		
		System.out.println("=======================");
		
		//7
		for(int cont4 = 1; cont4 <=5; cont4++) {
			System.out.print("Informe uma nota \nR: ");
			int nota = scanner.nextInt();
			if(nota < 7) {
				System.out.println("Reprovado");
			}else if(nota >=7) {
				System.out.println("Aprovado");
			}
		}
		
		System.out.println("=======================");
		
		//8
		for(int cont5 = 1; cont5 <=5; cont5++) {
			System.out.print("Informe a idade \nR:");
			int idade1 = scanner.nextInt();
			if(idade1 <= 12) {
				System.out.println("Criança");
			}else if(idade1 >= 13 && idade1 <= 17) {
				System.out.println("Adolescente");
			}else if(idade1 >=18 && idade1 <=59) {
				System.out.println("Adulto");
			}else if(idade1 >=60) {
				System.out.println("Idoso");
			}
		}
		
		System.out.println("=======================");
		
		//9
		for(int cont6 = 1; cont6 <= 7; cont6++) {
			System.out.print("Informe um número \nR: ");
			double numero = scanner.nextDouble();
			if(numero > 0) {
				System.out.println("POSITIVO");
			}else if(numero < 0) {
				System.out.println("NEGATIVO");
			}else {
				System.out.println("Esse número é zero");
			}
		}
		System.out.println("=======================");
		
	}
}
