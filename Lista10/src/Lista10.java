import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		int numero = 10;
		while(numero <= 30) {
		System.out.println(numero);
		numero ++;
		}
				
		System.out.println("==================================");
		
		//2
		int cont = 1;
		int soma = 0;
		while(cont <= 3) {
			System.out.print("Digite o "+cont+"° número: \nR:");
			int numero1 = scanner.nextInt();
			soma = soma + numero1;
			cont++;
		}
		System.out.println("A soma do número: "+soma);

		System.out.println("==================================");
		
		//3
		int cont1 = 1;
		int soma1 = 0;
		while(cont1 <=5) {
			System.out.print("Digite o "+cont1+"° número: \nR:");
			int numero2 = scanner.nextInt();
			soma1 = soma1 + numero2;
			cont1++;
		}
		System.out.println("A soma do número: "+soma1);

		System.out.println("==================================");
		
		//4
		int cont3 = 1;
		System.out.print("Digite um número \nR:");
		int numero3 = scanner.nextInt();
		while(numero3 >= cont3) {
			System.out.println(cont3);
			cont3++;
		}
		
		System.out.println("==================================");
		
		//5
		int cont2 = 1;
		int soma2 = 0;
		while (cont2 <= 5) {
			soma2 = soma2 + cont2;
			cont2++;
		}
		System.out.println("A soma dos números de 1 a 5 é: "+soma2);
		
		System.out.println("==================================");
		
		//6
		System.out.print("Digite um número e lhe direi sua tabuada: \nR:");
		int numero4 = scanner.nextInt();
		int denominador = 1;
		int result;
		while(denominador <=10) {
			result = denominador * numero4;
			System.out.println(numero4 + "x" + denominador + "=" + result);
			denominador++;
		}
	
		
		
		}	
	}

