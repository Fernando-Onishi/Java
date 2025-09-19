import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		
		//1
		for(int cont = 1; cont <=10; cont++) {
			System.out.println(cont);
		}
		System.out.println("=============================");
		
		//2
		int soma = 0;
		for(int num = 1; num <=100; num++) {
			soma = soma + num;
			System.out.println(soma);
		}
		System.out.println("=============================");
		
		//3
		for(int num = 2; num <=20; num+=2) {
			System.out.println(num);
		}
		
		System.out.println("=============================");
		
		//4
		System.out.println("Informe um número e no final lhe direi sua tabuada");
		int numero = scanner.nextInt();
		for(int numero2 = 1; numero2 <= 10; numero2++) {
			int resultado = numero * numero2;
			System.out.println(numero + " * " + numero2 + " = " + resultado);
		}
		
		System.out.println("=============================");
		
		//5
		System.out.println("Os números divisiveis por 3 são: ");
		for(int num = 3; num <=50; num+=3) {
			System.out.println(num);
		}
		
		//6
		System.out.print("Informe um número e lhe direi os números impares do 1 ao seu número \nR: ");
		int num3 = scanner.nextInt();
		for(int num2 = 1; num2 <= num3; num2++) {
			System.out.println(num2);
		}
		
		System.out.println("=============================");
		
		//7
		int resultado1 =1;
		int result = 1;
		for(int num1 = 1; num1 <= 5; num1++) {
			System.out.print("Informe um número: ");
			int num = scanner.nextInt();
			resultado1 *= num;
			result = num;				
			result = resultado1;
				System.out.println(result + " * " + num1 + " = " + resultado1);

			}
			
		
		System.out.println("=============================");
		
		//8
		for(int func = 1; func <=10; func++){
			System.out.print("Quantos anos de empresa você possui? \nR:");
			int funcio = scanner.nextInt();
			if(funcio >= 10) {
				System.out.println("Parabéns! Você irá receber um prêmio");
			}else {
				System.out.println("Quase lá!");
			}
		}
		System.out.println("=============================");s
		
		
		
		
	}
}
