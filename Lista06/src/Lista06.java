import java.util.Scanner;

public class Lista06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//1
		System.out.print("Informe um número: \nR: ");
		int num1 = scanner.nextInt();
		if(num1 > 10 && num1 <20) {
			System.out.println("Número dentro do intervalo");
		}else {
			System.out.println("Número fora do intervalo");
		}
	
		
		//2
		System.out.print("Você possui um convite? (TRUE/FALSE)\nR: ");
		boolean resposta = scanner.nextBoolean();
		System.out.print("Quantos anos possui? \nR: ");
		int idade = scanner.nextInt();
		if(idade >= 18 && resposta) {
			System.out.println("Entrada Permitida");
		}else {
			System.out.println("Entrada Negada");
		}
	
		//3
		System.out.print("Quantos anos você tem? \nR: ");
		int idade1 = scanner.nextInt();
		if(idade1 <12 || idade1 > 60) {
			System.out.println("Categoria especial");
		}else {
			System.out.println("Categoria normal");
		}
	
		//4
		System.out.print("Qual a forma de pagamento \nR: ");
		String forma = scanner.next();
		System.out.print("Qual o valor da compra \nR: ");
		double valor = scanner.nextDouble();
		if(valor > 100 && forma.equalsIgnoreCase("Avista")) {
			double valor1 = (valor * 0.10) + valor;
			System.out.println("Você ganhou 10% de desconto!\n------------------\nTotal a pagar: R$"+valor1);
		}else {
			System.out.println("Sem desconto \n------------------\nTotal a pagar: R$"+valor);
		}
		
		//5
		System.out.print("Mande sua temperatura: \nR: ");
		double tempe = scanner.nextDouble();
		System.out.print("Você possui sintomas? (TRUE/FALSE)\nR: ");
		boolean sintomas = scanner.nextBoolean();
		if(tempe >= 38 || sintomas) {
			System.out.print("Recomenda-se procurar um médico");
		}else {
			System.out.print("Sem sinais preoucupantes");
		}
		
		//6
		System.out.print("Digite sua idade: \nR: ");
		int idade2 = scanner.nextInt();
		System.out.print("Qual sua nacionalidade? \nR: ");
		String nacao = scanner.next();
		if(idade2 >=16 && nacao.equalsIgnoreCase("Brasileiro")) {
			System.out.println("Pode votar");
		}else {
			System.out.println("Não pode votar");
		}
		
		//7
		System.out.print("Qual a quantidade de horas extras? \nR: ");
		double horas = scanner.nextDouble();
		System.out.println("Qual o número de faltas? \nR: ");
		int faltas = scanner.nextInt();
		if(horas >20 && faltas <5) {
			System.out.println("Ganhou Bônus!");
		}else {
			System.out.println("Não ganhou Bônus");
		}
		
		//8
		System.out.println("Possui carteira de motorista? (TRUE/FALSE)\nR: ");
		boolean motorista = scanner.nextBoolean();
		System.out.println("Quantos anos possui/ \nR: ");
		int idade3 = scanner.nextInt();
		if(idade3 >=18 && motorista) {
			System.out.println("Pode dirigir");
		}else {
			System.out.println("Não pode dirigir");
		}
		
		//9
		System.out.print("Qual foi a nota média? (0 a 10)\nR: ");
		double media = scanner.nextDouble();
		System.out.print("Qual a sua frequência? (0 a 100)\nR: ");
		double freq = scanner.nextDouble();
		if(media >= 8 && freq >= 80) {
			System.out.println("Bolsa concedida");
		}else {
			System.out.println("Bolsa não concedida");
		}
		
		//10
		System.out.print("Qual a temperatura atual? \nR: ");
		double temp = scanner.nextDouble();
		System.out.print("Qual a umidade atual? \nR: ");
		double umid = scanner.nextDouble();
		if(temp <18 || temp > 26 && umid > 60) {
			System.out.println("Ajustar climatização");
		}else {
			System.out.println("Climatização não necessária");
		}
		
		
		
	}

}
