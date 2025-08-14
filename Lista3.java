import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		double num1, num2;
		System.out.print("Digite um número: ");
		num1 = scanner.nextDouble();
		System.out.print("Digite outro número: ");
		num2 = scanner.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma dos números é: "+soma);
		
		//2
		int num3, num4;
		System.out.print("Digite um número: ");
		num3 = scanner.nextInt();
		System.out.print("Digite outro número: ");
		num4 = scanner.nextInt();
		int div = num3 / num4;
		int resto = num3 % num4;
		System.out.println("A divisão do número é: "+div+" E o resto é: "+resto);
		
		//3
		double med1, med2, med3;
		System.out.println("\nEscreva o comprimento dos três lados do triângulo e no final o perímetro será exibido \n");
		System.out.print("Digite a medida do lado 1 do triângulo: ");
		med1 = scanner.nextDouble();
		System.out.print("Digite a medida do lado 2 do triângulo: ");
		med2 = scanner.nextDouble();
		System.out.print("Digite a medida do lado 3 do triângulo: ");
		med3 = scanner.nextDouble();
		double p = med1 + med2 + med3;
		System.out.println("O perímetro do triângulo é: "+p);
		
		//4
		double conta;
		double gorjeta;
		System.out.print("\nQual o valor da conta? \nR:");
		conta = scanner.nextDouble();
		System.out.print("Qual a porcentagem de sua gorjeta? \nR:");
		gorjeta = scanner.nextDouble();
		double total = conta * gorjeta /100;
		double total1 = total + conta;
		System.out.println("O valor da gorjeta é: "+total+"\nO valor total a pagar será: "+total1);
		
		//5
		System.out.println("Esse programa pegará o raio do círculo em metros e calculará sua área");
		double raio;
		System.out.print("Digite o raio do círculo: ");
		raio = scanner.nextDouble();
		double area = 3.14159 * raio * raio ;
		System.out.println("A área do círculo será: "+area);
		
		//6
		int idade;
		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		double meses = idade*12;
		double dias = (idade*365) + (meses*30);
		System.out.println("Você viveu "+dias+" dias");
		
		//7
		double horas;
		double valor;
		System.out.print("Informe o número de horas trabalhadas: ");
		horas = scanner.nextDouble();
		System.out.print("Informe o valor pago por hora: ");
		valor = scanner.nextDouble();
		double salarioB = horas * valor;
		double imposto = salarioB *0.10;
		double salarioL = salarioB - imposto;
		System.out.println("O salário bruto será R$"+salarioB+". O imposto R$"+imposto+" e o salário líquido será R$"+salarioL);
		
	}

}
