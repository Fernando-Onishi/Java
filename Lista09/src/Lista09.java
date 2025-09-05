import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		int num = 1; 
		while (num <=10) {
		System.out.println(num);
		num++;
		}
		
		//2
		int num1 = 10;
		System.out.println("Contagem regressiva em: ");
		while (num1 >= 1) {
			System.out.println(num1);
		num1--;
		}
		
		//3
		int num2 = 0;
		while(num2 <= 100) {
			System.out.println(num2);
		num2 +=5;
		}
		
		//4
		int java = 0;
		while(java < 5) {
			System.out.println("Eu gosto de Java");
		java++;	
		}
		
		//5
		int soma = 0;
		int contador = 1;
		int valor;
		System.out.print("Digite um número \nR:");
		while(contador <=5) {
			valor = scanner.nextInt();
			soma += valor;
			contador+=1;
		}
		System.out.print("A soma dos números é: "+soma);
		
		//6
		int senha = 0;
		System.out.print("Digite sua senha \nSENHA:");
		senha = scanner.nextInt();
		while(senha != 1234) {
			System.out.println("Tente novamente \nSENHA:");
			senha = scanner.nextInt();
		}
		System.out.println("Acesso Liberado");
		
		//7
		System.out.print("Informe um número: \nR:");
		int num3 = scanner.nextInt();
		while (num3 >= 1) {
			System.out.println(num3);
			num3--;
		}
		
		
		
	}
}
