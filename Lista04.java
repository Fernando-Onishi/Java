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

		//Condicional encadeada
		int num1 = 1;
		int num2 = 3;
		if(num1 > num2) {
			System.out.println("O primeiro é maior");
		}else if (num2 > num1) {
			System.out.println("O segundo é maior");
		}else {
			System.out.println("Eles são iguais");
		}
		//----------------------
		//Situação do estoque
		/*Um mercado solicitou um sistema de verificação de estoque 
		 * onde se o valor do estoque for maior ou igual a 100, mostre "Estoque ok", se for maior ou igual a 50, 
		 * mostre "Atenção ao Estoque", senão, mostre "Estoque critico"*/
		
		int estoque;
		System.out.print("Digite o estoque do produto: ");
		estoque = scanner.nextInt();
		if(estoque >=100) {
			System.out.println("Estoque ok");
		}else if (estoque >=50) {
			System.out.println("Atenção ao estoque!!");
		}else {
			System.out.println("ESTOQUE CRÍTICO!!!");
		}
		
		
		/*Crie um programa que verifica a classe eleitoral com base 
		 * na idade. Se a idade for menor que 16, mostre "não eleitor", se for menor que 18, mostre "voto opcional", 
		 * se for menor de 65 mostre, "voto obrigatório", se for maior que 65, mostre "voto opcional", senão, 
		 * mostre "idade inválida"*/
		
		int Idade;
		System.out.println("Digite sua idade: ");
		Idade = scanner.nextInt();
		if(Idade < 16) {
			System.out.println("Não eleitor");
		}else if(Idade < 18) {
			System.out.println("Voto opcional");
		}else if(Idade < 65){
			System.out.println("Voto obrigatório");
		}else if(Idade > 65) {
			System.out.println("Voto opcional");
		}else {
			System.out.println("Idade inválida");
		}
		
		
		
		
		
			}
	}
