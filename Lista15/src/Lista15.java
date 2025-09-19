import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		
		
		//1
		String[] frutas = new String [5];
		for(int f = 0; f <5; f++) {
			System.out.print("Frutas["+f+"]: ");
			frutas[f] = scanner.next();
		}
		for(int f = 0; f <5; f++) {
		System.out.println("[" + f + "]" + frutas[f]);
		}
		
		System.out.println("=============================");
		
		//2
		int[]num = new int [10];
		for(int i = 0; i <10; i++) {
			System.out.print("Números["+i+"]: ");
			num[i] = scanner.nextInt();
		}
		
		System.out.println("=============================");
		
		for(int i = 0; i <10; i++) {
			System.out.println("Posição["+i+"]:"+num[i]);
		}
		
		System.out.println("=============================");
		
		//3
		int[] num1 = new int [7];
		for(int i = 0; i < 7; i++) {
			System.out.print("Números["+i+"]: ");
			num1[i] = scanner.nextInt();
			
		System.out.println("=============================");
		
		}
		for(int i = 6; i > 0; i--) {
			System.out.println("Posição["+i+"]: "+num1[i]);
		}
		System.out.println("=============================");
		
		//4
		int[] num2 = new int [10];
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite qualquer número ["+i+"]:");
			num2[i] = scanner.nextInt();
			if(num2[i] > 100) {
				System.out.println("Maior do que 100");
			}
		}

		System.out.println("=============================");
		
		//5
		int[] num3 = new int[8];
		for(int i = 0; i < 8; i++) {
			System.out.print("Digite qualquer número["+i+"]: ");
			num3[i] = scanner.nextInt();
		}
			System.out.print("Digite um número extra:");
			int num4 = scanner.nextInt();
		for(int f = 0; f < 8; f++) {
			if(num3[f] == num4) {
				System.out.println("Esse número existe no vetor");
				f = 10;
			}else {
				System.out.println("Esse número não existe no vetor");
			}	
		}
		
		System.out.println("=============================");
		
		//6
		String[] nome = new String[5];
		for(int n = 0; n < 5; n++) {
			System.out.print("Informe seu nome["+n+"]:");
			nome[n] = scanner.next();
		}
		int[] idade = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe suas respectivas idades["+i+"]:");
			idade[i] = scanner.nextInt();
		}
		for(int a = 0; a < 5; a++) {
		System.out.println(nome[a]+" tem "+idade[a]+" anos");
		}
		
		System.out.println("=============================");
		
		//7
		int[] idade1 = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite sua idade["+i+"]:");
			idade1[i] = scanner.nextInt();
			if(idade1[i] <= 18) {
				System.out.println("Você é menor de idade");
			}else {
				System.out.println("Você é maior de idade");
			}
		}
		
		System.out.println("=============================");
		
		//8
		double[] salario = new double[7];
		for(int s = 0; s < 7; s++) {
			System.out.print("Digite o seu salário["+s+"]:");
			salario[s] = scanner.nextDouble();
			if(salario[s] <= 2500) {
				System.out.println("Você receberá um aumento");
			}else {
				System.out.println("Sem aumento");
			}
		}
		
		System.out.println("=============================");
		
	}
}
