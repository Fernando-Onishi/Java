import java.util.Scanner;

public class Lista11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		
		//1
		int numero = 1;
		do {
		System.out.println(numero);
		numero++;
		}while (numero <= 31);
		
		System.out.println("==================================");
		
		//2
		int numero1;
		do {
		System.out.print("Informe um número: \nR:");
		numero1 = scanner.nextInt();
		}while (numero1 != 100);
		System.out.println("FIM");
		
		System.out.println("==================================");
		
		//3
		String resposta;
		System.out.println("Escolha uma das opções");
		System.out.print("1) Continuar \n2) Sair \nR:");
		resposta = scanner.next();
		do {
			if (resposta.equalsIgnoreCase("Continuar")){
				System.out.println("Você escolheu continuar!");
				System.out.println("Escolha uma das opções");
				System.out.print("1) Continuar \n2) Sair \nR:");
				resposta = scanner.next();
			}else if (resposta.equalsIgnoreCase("Sair")){
				System.out.println("Você escolheu sair :(");
			}else {
				System.out.println("Opção Inválida!");
				System.out.println("Escolha uma das opções");
				System.out.print("1) Continuar \n2) Sair \nR:");
				resposta = scanner.next();
			}
		}while (resposta.equalsIgnoreCase("Continuar"));
		System.out.println("FIM");
		
		System.out.println("==============================");
		
		//4
		int numero2;
		int cont = 1;
		do {
			System.out.print("Digite um número: \nR:");
			numero2 = scanner.nextInt();
			if (numero2 < 10){
				System.out.println("Tipo A");
			}else if(numero2 < 20) {
				System.out.println("Tipo B");
			}else {
				System.out.println("Fora da categoria");
			}
			cont++;
		}while(cont <=5);
		System.out.println("FIM");
		
		System.out.println("==============================");
		
		//5
		double temp;
		do {
			System.out.print("Informe a temperatura atual do forno: \nR:");
			temp = scanner.nextDouble();
			if (temp > 200) {
				System.out.println("Temperatura alta!! \nDiminua a temperatura e tente novamente... ");
				System.out.print("Informe a temperatura atual do forno: \nR:");
				temp = scanner.nextDouble();
			}else if(temp <200){
				System.out.println("Temperatura Segura!");
			}
		}while(temp > 200);
		System.out.println("FIM");
		
		System.out.println("==============================");
		
		//6
		int bat;
		do {
			System.out.print("Informe o nível de bateria do dispositivo: \nR:");
			bat = scanner.nextInt();
			if(bat <= 20) {
				System.out.println("Bateria Baixa!!");
			}else if(bat >=20) {
				System.out.println("Nível bom de Bateria");
			}
		}while(bat <=20);
		System.out.println("FIM");
		
		System.out.println("==============================");
		
		//7
		int n1;
		int n2;
		String resposta1;
		do {
			System.out.print("Deseja fazer uma conta \nR:");
			resposta1 = scanner.next();
			if(resposta1.equalsIgnoreCase("Sim")) {
				System.out.print("Digite um número \nR:");
				n1= scanner.nextInt();
				System.out.print("Digite outro número \nR:");
				n2 = scanner.nextInt();
				int n3 = n1 + n2;
				System.out.println("A soma dos números é: "+n3);
			}else {
				System.out.println("Fim");
			}
			}while (resposta1.equalsIgnoreCase("Sim"));
		
		
	}
}
