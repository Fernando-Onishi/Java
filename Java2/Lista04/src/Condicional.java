import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* >= maior ou igual 		<= menor ou igual
		> maior						< menor
		== igual					!= diferente */
		
		int idade = 18;
		if(idade >=18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
			
		//Verificação de desconto
		
		System.out.println("Quanto você pagou? ");
		double valor = scanner.nextDouble();
		if(valor >=200) {
			System.out.println("Você ganhou desconto");
		} else {
			System.out.println("Você não ganhou desconto");
		}
		//-----------------------------
		String continuar;
		System.out.println("Deseja continuar? ");
		continuar = scanner.next();
		if(continuar != "sim") {
			System.out.println("Você escolheu continuar");
		} else {
			System.out.println("Você escolheu sair");
		}
		
		//-----------------------------------
		//Veificar aprovação
		double nota1, nota2;
		System.out.print("Informe a nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.print("Informe a nota 2: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media < 7 ) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
		
		/*Aplicação de desconto: Peça o valor da compra para o usuário se o valor for maior ou igual a 200, o usuário recebe um desconto de 15%, senão não tem desconto. Mostre se ele teve algum desconto e quanto deve pagar*/
		
		//Opção 1
		System.out.println("Informe o valor da sua conta: ");
		double desconto = scanner.nextDouble();
		if(desconto >= 200) {
			System.out.println("Recebeu um desconto de 15%!");
			double valorD = (desconto * 0.15) + 200;
			System.out.println("Deverá pagar: "+valorD);
		}else{
			System.out.println("Você não recebeu desconto \n Valor total da compra: "+ desconto);
		}

			
			
			
			
			}
		}
