import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//01
		int num1;
		int num2;
		System.out.print("Informe um número: ");
		num1 = scanner.nextInt();
		System.out.print("Informe outro número que não seja 0: ");
		num2 = scanner.nextInt();
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		System.out.println("A soma do seu número é: "+ soma + "\nA subtração do número é: "+sub+"\nA multiplicação é: "+mult+"\nA divisão é: "+div);
		
		//2
		
		

	}

}
