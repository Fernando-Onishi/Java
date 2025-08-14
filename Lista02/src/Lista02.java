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
		System.out.println("A soma do seu número é: "+ soma + "\n A subtração do número é: "+sub+"\nA multiplicação é: "+mult+"\nA divisão é: "+div);
		
		//2
		double tempC;
		System.out.print("Informe a temperatura em graus Celsius: ");
		tempC = scanner.nextDouble();
		double F = (tempC * 1.8) + 32;
		System.out.println("A conversão da temperatura em graus Fahrenheit: "+F+" graus Fahrenheit");
		
		//3
		double real;
		double dolar = 5.70;
		System.out.print("Digite seu valor em real e receberá a conversão para dolár: ");
		real = scanner.nextDouble();
		double conversor = real / dolar;
		System.out.println("Seu valor em dolár é: $"+conversor);
		
		//4
		double altura;
		double base;
		System.out.println("Digite as informações pedidas que a área no final será exibida.");
		System.out.print("Informe a base do retângulo: ");
		base = scanner.nextDouble();
		System.out.print("Infomre a altura do retângulo: ");
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A área do retângulo é: " + area);
		
		//5
		int idade;
		System.out.print("Informe sua idade: ");
		idade = scanner.nextInt();
		double meses = idade * 12;
		System.out.println("Você viveu "+meses+" meses");
		
		//6
		double minutos;
		double seg = 60;
		System.out.println("Informe o tempo em minutos e receberá a conversão para segundos...");
		System.out.print("Informe o tempo em minutos: ");
		minutos = scanner.nextDouble();
		double conver = minutos*seg;
		System.out.println("A conversão para segundos será: "+conver+" segundos");
		
		//7
		int quant;
		double preco;
		System.out.println("Informe o preço e a quantidade comprada do produto que no final será exibido o valor a pagar");
		System.out.print("Informe o preço: ");
		preco = scanner.nextDouble();
		System.out.print("Informe a quantidade: ");
		quant = scanner.nextInt();
		double pagar = preco * quant;
		System.out.println("O preço a pagar será: "+pagar);
		
		//8
		double conta;
		double pessoas;
		System.out.print("Digite o valor total da conta: ");
		conta = scanner.nextDouble();
		System.out.print("Digite o número de pessoas que irão dividir a conta: ");
		pessoas = scanner.nextDouble();
		double divi = conta / pessoas;
		System.out.println("Cada pessoa deve pagar R$"+divi);
		
		//9
		double compra;
		double pago;
		System.out.print("Digite o valor da compra: ");
		compra = scanner.nextDouble();
		System.out.print("Digite o valor pago pelo cliente: ");
		pago = scanner.nextDouble();
		double troco = pago - compra;
		System.out.println("O cliente deverá receber R$ "+troco);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
