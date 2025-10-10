package lista5;

import java.util.Scanner;

public class Lista05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a senha: ");
		String senha = scanner.next();
		if(senha.equals("admin")) {
			System.out.println("Acesso permitido!");
		}else {
			System.out.println("Acesso negado!");
		}
		
		//1
		double idade;
		System.out.print("Diga sua idade \nR:");
		idade = scanner.nextDouble();
		if(idade <= 12) {
			System.out.println("Criança");
		}else if (idade <= 17) {
			System.out.println("Adolescente");
		}else if (idade <= 59) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		//2
		double temp;
		System.out.print("Digite a temperatura em graus Celsius: ");
		temp = scanner.nextDouble();
		if(temp <= 10) {
			System.out.println("Muito frio");
		}else if(temp <= 20) {
			System.out.println("Frio");
		}else if (temp <= 0) {
			System.out.println("Agradável");
		}else {
			System.out.println("Muito quente");
		}
		
		//3
		double nota;
		System.out.print("Digite sua nota e receberá a letra correspondente: ");
		nota = scanner.nextDouble();
		if(nota > 90) {
			System.out.println("Nota A");
		}else if (nota > 80){
			System.out.println("Nota B");
		}else if (nota > 70) {
			System.out.println("Nota C");
		}else if (nota > 60 ) {
			System.out.println("Nota D");
		}else {
			System.out.println("Nota F");
		}
		
		//4
		
		
		//5
		String nome1, nome2;
		System.out.print("Digite um nome: ");
		nome1 = scanner.next(); 
		System.out.print("Digite outro nome: ");
		nome2 = scanner.next();
		if(nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais");
		}else {
			System.out.println("Os nomes são diferentes");
		}
		
		//6
		System.out.print("Digite sua cor favorita: ");
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha!");
		}else if(cor.equalsIgnoreCase("vermelho")) {
		System.out.println("Cor vibrante!");
		}else if(cor.equalsIgnoreCase("verde")) {
			System.out.println("Cor da natureza!");
		}else {
			System.out.println("Cor não cadastrada");
		}
		
		//7
		System.out.print("Digite uma letra: ");
		String caracter = scanner.next();
		if(caracter.equalsIgnoreCase("A")) {
			System.out.println("É uma vogal");
		}else if (caracter.equalsIgnoreCase("E")) {
			System.out.println("É uma vogal");
		}else if(caracter.equalsIgnoreCase("I")) {
			System.out.println("é uma vogal");
		}else if(caracter.equalsIgnoreCase("O")) {
			System.out.println("É uma vogal");
		}else if(caracter.equalsIgnoreCase("U")) {
			System.out.println("É um vogal");
		}else {
			System.out.println("Não é vogal");
		}
		
	}

}