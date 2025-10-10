import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
			//1
			System.out.print("Digite um número e eu lhe direi qual seu tipo: "); 
			double valor = scanner.nextInt();
			valores(valor);
			separador();
			
			//2
			System.out.print("Digite sua idade: ");
			int idade = scanner.nextInt();
			idade(idade);
			separador();
			
			//3
			System.out.print("Qual o seu nome? \nR:");
			String nome = scanner.next();
			nome(nome);
			separador();
			
			//4
			System.out.print("Digite um valor e lhe direi sua tabuada: \nR: ");
			int numero = scanner.nextInt();
			tabuada(numero);
			separador();
			
			//5
			System.out.print("Digite uma palavra \nR:");
			String palavra1 = scanner.next();
			System.out.print("Digite outra palavra \nR: ");
			String palavra2 = scanner.next();
			palavras(palavra1, palavra2);
			separador();
			
			//6
			System.out.print("Digite um número e lhe direi se é par ou impar \nR:");
			int num = scanner.nextInt();
			parOUimpar(num);
			separador();
			
			//7
			System.out.print("Digite a temperatura atual: ");
			double temp = scanner.nextDouble();
			temp(temp);
			separador();
			
			//8
			System.out.print("Qual período do dia você trabalha? \nManhã) \nTarde) \nNoite) \nR:");
			String turno = scanner.next();
			turno(turno);
			separador();
			
			//9
			System.out.println("Digite a suas notas e lhe direi sua média ");
			System.out.print("Nota1:");
			double nota1 = scanner.nextDouble();
			System.out.print("Nota2:");
			double nota2 = scanner.nextDouble();
			System.out.print("Nota3:");
			double nota3 = scanner.nextDouble();
			media(nota1, nota2, nota3);
			separador();
			
			//10
			System.out.print("Digite sua nota e lhe direi seu resultado \nR:");
			double nota = scanner.nextDouble();
			aprovacao(nota);
			separador();
			
		}
	
	public static void separador() {
		System.out.println("=====================");
	}

	//1
	public static void valores(double valor) {
		if(valor > 0) {
			System.out.println("Positivo");
		}else if (valor < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("É zero");
		}
	}
	
	//2
	public static void idade(int idade) {
		if(idade >= 18) {
			System.out.println("Maior de idade");
		}else{
			System.out.println("Menor de idade");
		}
	}
	
	//3
	public static void nome(String nome) {
		System.out.println("Olá "+nome+"!");
	}
	
	//4
	public static void tabuada(int numero) {
		int denominador = 1;
		int result;
		while(denominador <= 10) {
			result = denominador * numero;
			System.out.println(numero+"x"+denominador+"= "+result);
			denominador++;
		}
	}
	
	//5
	public static void palavras(String palavra1, String palavra2) {
		String resultado = palavra1 + " " + palavra2;
		System.out.println(resultado);
	}
	
	//6
	public static void parOUimpar(int num) {
		if(num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}
	
	//7
	public static void temp(double temp) {
		if(temp < 15) {
			System.out.println("Frio");
		}else if(temp  > 15 && temp < 25) {
			System.out.println("Agrádavel");
		}else {
			System.out.println("Quente");
		}
	}
	
	//8
	public static void turno(String turno) {
		if(turno.equalsIgnoreCase("Manha")) {
			System.out.println("Bom dia!");
		}else if(turno.equalsIgnoreCase("Tarde")) {
			System.out.println("Boa tarde!!");
		}else if(turno.equalsIgnoreCase("Noite")){
			System.out.println("Boa noite!");
		}
	}
	
	//9
	public static void media(double nota1, double nota2, double nota3) {
		double resultado = (nota1 + nota2 + nota3) / 3;
		System.out.println(resultado);
	}
	
	//10
	public static void aprovacao(double nota) {
		if(nota >= 7) {
			System.out.println("Aprovado");
		}else if(nota > 5 && nota < 7) {
			System.out.println("Em Recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
	
}
