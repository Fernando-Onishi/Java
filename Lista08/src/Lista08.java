import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		System.out.print("Informe um número de 1 a 7 \nR:");
		int dia = scanner.nextInt();
		switch(dia) {
		
		case 1:
			System.out.println("Fim de Semana");
			break;
		case 2, 3, 4, 5, 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Fim de Semana");
			break;
			default:
				System.out.println("Dia inválido");
		}
		
		System.out.println("==================================");
		
		//2
		int escolha;
		System.out.print("Informe um código de bebida \nR:");
		escolha = scanner.nextInt();
		switch(escolha) {
		
		case 1:
			System.out.println("Café.........R$5,00");
			break;
		case 2:
			System.out.println("Chá.........R$5,00");
			break;
		case 3:
			System.out.println("Suco.........4,00");
			break;
		case 4:
			System.out.println("Refrigerante.........R$4,50");
			break;
			default:
				System.out.println("Código Inválido");
		}
		
		System.out.println("==================================");
		
		//3
		System.out.print("Informe o tipo do veículo e lhe direi sua categoria..\nR:");
		String veiculo = scanner.next();
		switch (veiculo) {
		
		case "Carro":
			System.out.println("Leve");
			break;
		case "Moto":
			System.out.println("Motocicleta");
			break;
		case "Caminhão":
			System.out.println("Pesado");
			break;
		default:
			System.out.println("Veículo Inválido");
		}
		
		System.out.println("==================================");
		
		//4
			System.out.print("Informe o tipo do seu plano \nR:");
			String codigo = scanner.next();
			switch (codigo) {
			
			case "Básico":
				System.out.println("Acesso limitado");
				break;
			case "Intermediário":
				System.out.println("Acesso padrão + suporte");
				break;
			case "Premium":
				System.out.println("Acesso total + suporte prioritário");
				break;
			default:
				System.out.println("Planos inválido");
			}
		
		System.out.println("==================================");
		
		
		//5
		System.out.print("Informe um número de 1 a 12, cada um representando um mês e exibirá a estação do ano... \nR:");
		int estacao = scanner.nextInt();
		switch (estacao) {
		
		case 12, 1, 2:
			System.out.println("Verão");
			break;
		case 3, 4, 5:
			System.out.println("Outono");
			break;
		case 6, 7, 8: 
			System.out.println("Inverno");
			break;
		case 9, 10, 11:
			System.out.println("Primavera");
			break;
		default:
			System.out.println("Mês Inválido");
		}
		
		System.out.println("==================================");
		
		//6
		System.out.print("Qual o tipo do ingresso? \nA)Inteira.........R$50,00 \nB)Meia-Entrada.........R$25,00 \nC)VIP.........R$100,00 \n================================== \nR:");
		String resposta = scanner.next();
		switch (resposta) {
		
		case "Inteira":
			System.out.print("Você comprou um ingresso do tipo Inteira por R$50,00");
			break;
		case "Meia-Entrada":
			System.out.println("Você comprou um ingresso do tipo Inteira por R$25,00");
			break;
		case "VIP":
			System.out.println("Você comprou um ingresso do tipo Inteira por R$100,00");
			break;
		default:
			System.out.println("Ingresso Inválido");
		}
		
		System.out.println("==================================");
		
		//7
		int idioma;
		System.out.print("Escolha um número do idioma abaixo \n1)Português \n2)Inglês \n3)Espanhol \nR:");
		idioma = scanner.nextInt();
		switch (idioma) {
		
		case 1:
			System.out.println("Olá!");
			break;
		case 2:
			System.out.println("Hello!");
			break;
		case 3:
			System.out.println("Hola!");
			break;
		default:
			System.out.println("Idioma inválido");
		}
		
		System.out.println("==================================");
		
		//8
		System.out.print("Digite o nível das permissões do seu computador: \n1)Usuário \n2)Moderador \n3)Administrador \nR:");
		String resposta1 = scanner.next();
		switch (resposta1){
			case "Usuário":
				System.out.println("Acesso Básico");
				break;
			case "Moderador":
				System.out.println("Acesso Básico + Edição");
				break;
			case "Administrador":
				System.out.println("Acesso Total");
				break;
			default:
				System.out.println("Nível Inválido");
		}
		
		System.out.println("==================================");
		
		//9
		System.out.print("Qual a forma de pagamento? \nR:");
		String resposta2 = scanner.next();
		switch(resposta2) {
		
		case "Dinheiro":
			System.out.println("Pagamento em dinheiro confirmado");
			break;
		case "Cartão de Crédito":
			System.out.println("Pagamento com cartão processado");
			break;
		case "PIX":
			System.out.println("Pagamento via Pix realizado");
			break;
		default:
			System.out.println("Metódo Inválido");
		}
	}
}
