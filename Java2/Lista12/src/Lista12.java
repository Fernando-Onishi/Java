import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		
		//1
		int numero = 10;
		do {
			System.out.println(numero);
			numero++;
		}while(numero <=30);
		System.out.println("=======================");
		
		//2
		int numero1;
		do {
			System.out.print("Informe um número até for o número correto :\nR: ");
			numero1 = scanner.nextInt();
		}while(numero1 !=5);
		System.out.println("Acertou o número!!");
		
		System.out.println("=======================");
		
		//3
		int peso;
		do {
		System.out.print("Digite o peso da mala em kg \nR: ");
		peso = scanner.nextInt();
		if(peso >=23) {
			System.out.println("Peso excedido!");
		}
		}while(peso >=23);
		System.out.println("Peso dentro do limite..");
		
		System.out.println("=======================");
		
		//4
		int leitura;
		int dias = 1;
		int leituraTotal = 0;
		do { 
			System.out.print("Quantas páginas foram lidas hoje? \nR: ");
			leitura = scanner.nextInt();
			leituraTotal = leituraTotal + leitura;
			dias++;
		}while(dias <=7);
		System.out.println("Você leu "+leituraTotal+" páginas durante a semana..Parabéns!");
		
		System.out.println("=======================");
		
		//5
		int cod;
		do {
			System.out.print("Digite o código de 3 dígitos\nR: ");
			cod = scanner.nextInt();
			if (cod != 129) {
				System.out.println("Err0 #404: Não enc0ntr@m0s o que v0cê pr0cur@v@.");
			}
		}while(cod != 129);
		System.out.println("Acesso Liberado!!");
		
		System.out.println("=======================");
		
		//6
		int combus;
		do {
			System.out.print("Digite o nível de combustível do veículo (em Litros) \nR: ");
			combus = scanner.nextInt(); 
			if(combus <=10) {
				System.out.println("Combustível baixo");
			}
		}while(combus <= 10);	
		System.out.println("Combustível está suficiente");
		
		System.out.println("=======================");
		
		//7
		double km;
		int trecho;
		double kmTotal = 0;
		do {
			System.out.print("Diga a contagem de KM percorridos até agora \nR: ");
			km = scanner.nextDouble();
			kmTotal = kmTotal + km;
		}while(km > 1);
		System.out.println("Em sua viagem total, você percorreu "+kmTotal+" km..");
		
	}
}
