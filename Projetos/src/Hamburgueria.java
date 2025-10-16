import java.util.Scanner;

public class Hamburgueria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String resposta1;
		
		
		System.out.print("Deseja fazer um pedido?\nR:");
		resposta1 = sc.next();
		if(resposta1.equalsIgnoreCase("Nao")) {
			System.out.println("Tudo bem! Ficamos felizes com a sua visita à Big Fat. Esperamos vê-lo em breve! 😄");
		}else if(resposta1.equalsIgnoreCase("Sim")) {
		do {
		System.out.print("Digite seu nome\nR:");
		String nome = sc.next();
		saudacao(nome);
		
		/*Quantidade de hamburguer*/
		int resposta;
		
		/*Hamburuer escolhido*/
		String menu;
		
		/*valor a ser pago*/
		
		/*Variavel Nome Hambúrguer*/
		String Carne1 = "Big Fat Classic";
		String Carne2 = "Big Fat Bacon";
		String Carne3 = "Big Fat Double";
		String Frango1 = "Big Fat Chicken Classic";
		String Frango2 = "Big Fat Crispy";
		String Frango3 = "Big Fat Chicken Bacon";
		String Veg1 = "Big Fat Veggie";
		String Veg2 = "Big Fat Vegan Deluxe";
		String Veg3 = "Big Fat Mushroom";
		
		
		/*Variável Preço Hambúrguer*/
		double valorCarne1 = 45.00;
		double valorCarne2 = 50.00;
		double valorCarne3 = 60.00;
		double valorFrango1 = 55.00;
		double valorFrango2 = 60.00;
		double valorFrango3 = 70.00;
		double valorVeg1 = 65.00;
		double valorVeg2 = 75.00;
		double valorVeg3 = 80.00;
		
		do {
		System.out.println("Escolha o tipo de Hambúrguer:");
		System.out.print("1)Carne \n2)Frango \n3)Vegetariano/Vegano \nR:");
		menu = sc.next();
		
		if(menu.equalsIgnoreCase("Carne") || menu.equals("1")) {
			System.out.println("\nEssas são as opções de Carne");
			System.out.print("1)Big Fat Classic..............R$45.00\n2)Big Fat Bacon..............R$50.00\n3)Big Fat Double..............R$60.00\nR:");
			String escolha = sc.next();
				if(escolha.equalsIgnoreCase("Bit Fat Classic") || escolha.equals("1")) {
				System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
						if(resposta <= 0) {
							System.out.println("Escolha Inválida, Insira um valor acima de 0");
						}else {
							double valor = valorCarne1 * resposta;
							System.out.println("O nome do seu hambúrguer se chama "+ Carne1 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
						}
					}else if(escolha.equalsIgnoreCase("Big Fat Bacon") || escolha.equals("2")){
						System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
							resposta = sc.nextInt();
							if(resposta <= 0) {
							System.out.println("Escolha Inválida, Insira um valor acima de 0");
						}else {
							double valor = valorCarne2 * resposta;
							System.out.println("O nome do seu hambúrguer se chama "+ Carne2 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
						}
					}else if(escolha.equals("Big Fat Double") || escolha.equals("3")) {
						System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
						resposta = sc.nextInt();
						if(resposta <= 0) {
							System.out.println("Escolha Inválida, Insira um valor acima de 0");
						}else {
							double valor = valorCarne3 * resposta;
							System.out.println("O nome do seu hambúrguer se chama "+ Carne3 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
						}
					}
			}else if(menu.equalsIgnoreCase("Frango") || menu.equals("2")) {
				System.out.println("\nEssas são as opções de Frango");
				System.out.print("1)Big Fat Chicken Classic..............R$55.00\n2)Big Fat Crispy..............R$60.00\n3)Big Fat Chicken Bacon..............R$70.00\nR:");
				String escolha = sc.next();
				if(escolha.equalsIgnoreCase("Big Fat Chicken Classic") || escolha.equals("1")) {
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorFrango1 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Frango1 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}else if(escolha.equalsIgnoreCase("Bit Fat Crispy") || escolha.equals("2")){
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorFrango2 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Frango2 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}else if(escolha.equalsIgnoreCase("Bit Fat Chicken Bacon") || escolha.equals("3")){
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorFrango3 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Frango3 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}
			}else if(menu.equals("Vegetariano") || menu.equalsIgnoreCase("Vegano") || menu.equalsIgnoreCase("3")) {
				System.out.println("\nEssas são as opções de Vegetarianos/Veganos");
				System.out.print("1)Big Fat Veggie..............R$65.00\n2)Big Fat Vegan Delux..............R$75.00\n3)Big Fat Mushroom..............R$80.00\nR:");
				String escolha = sc.next();
				if(escolha.equalsIgnoreCase("Bit Fat Veggie") || escolha.equals("1")) {
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorVeg1 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Veg1 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}
				if(escolha.equalsIgnoreCase("Bit Fat Vegan Delux") || escolha.equals("2")) {
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorVeg2 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Veg2 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}
				if(escolha.equalsIgnoreCase("Bit Fat Mushroom") || escolha.equals("3")) {
					System.out.print("Ótimo! Seu pedido foi Anotado\nQual a quantidade?\nR:");
					resposta = sc.nextInt();
					if(resposta <= 0) {
						System.out.println("Escolha Inválida, Insira um valor acima de 0");
					}else {
						double valor = valorVeg3 * resposta;
						System.out.println("O nome do seu hambúrguer se chama "+ Veg3 +"\nFoi pedido " + resposta + " hambúrguers\nValor a ser pago R$ "+valor);
					}
				}	
			}else{
				System.out.println("======================================");
				System.out.println("Por favor digite uma das opções");
				System.out.println("======================================");
			}
		System.out.print("Deseja fazer outro pedido?\nR:");
		resposta1 = sc.next();
		if(resposta1.equalsIgnoreCase("Nao")) {
			System.out.println("Tudo bem! Ficamos felizes com a sua visita à Big Fat. Esperamos vê-lo em breve! 😄");
		}else if(resposta1.equalsIgnoreCase("Sim")) {
		}
		}while(!menu.equals("1") && !menu.equals("2") && !menu.equals("3"));
		}while(resposta1.equalsIgnoreCase("Sim"));
	}
	}
	
		public static void saudacao(String nome){
			System.out.println("======================================");
	        System.out.println("      Bem-vindo à Hamburgueria        ");
	        System.out.println("             BIG FAT!                 ");
	        System.out.println("======================================");
			System.out.println("Olá "+nome+"! \nSomos da hamburgueria Big Fat\nEstamos prontos para oferecer os melhores hambúrgueres da cidade!\nAproveite nosso cardápio e escolha seu lanche favorito!");
			System.out.println("======================================");
		}
	}

