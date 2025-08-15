import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		int idade;
		System.out.print("Qual a sua idade? ");
		idade = scanner.nextInt();
		if(idade >=18) {
			System.out.println("Você tem "+idade+" anos e é maior de idade");
		}else {
			System.out.println("Você tem "+idade+" anos e é menor de idade");
		}
		
		//2
		double n1;
		double n2;
		System.out.print("Informe um número: ");
		n1 = scanner.nextDouble();
		System.out.print("Informe outro número: ");
		n2 = scanner.nextDouble();
		if(n1 > n2) {
			System.out.println("O primeiro número é maior");
		}else if (n1 < n2){
			System.out.println("O segundo número é maior");
		}else {
			System.out.println("Eles são iguais");
		}
		
		//3
		double nota;
		System.out.print("Digite sua nota: ");
		nota = scanner.nextDouble();
		if(nota >= 7) {
			System.out.println("APROVADO \nSua nota foi: "+ nota);
		}else {
			System.out.println("REPROVADO ): \nSua nota foi: "+nota);
		}
		
		
		//4
		double n3;
		System.out.print("Digite um número: ");
		n3 = scanner.nextDouble();
		if (n3 > 0 ) {
			System.out.println("Esse número é positivo");
		}else if (n3 < 0) {
			System.out.println("Esse número é negativo");
		}else {
			System.out.println("Esse número é igual a 0");
		}
		
		//5
		double distancia;
		double frete = 10.00;
		System.out.print("Informe a distância da entrega em KM: ");
		distancia = scanner.nextDouble();
		double Frete = distancia * 0.5;
		if(distancia < 50) {
			System.out.println("O frete custará R$"+frete);
		}else {
			System.out.println("Valor do frete: R$"+Frete);
		}
		
		//6
		int n4;
		System.out.print("Informe um número: ");
		n4 = scanner.nextInt();
		if(n4 == 10) {
			System.out.println("Esse número é igual a 10");
		}else {
			System.out.println("Esse número não é 10");
		}
		
		//7
		String resposta;
		System.out.print("Você é associado a loja? \nR:");
		resposta = scanner.next();
		if (resposta == "sim") {
			System.out.println("Você tem desconto");
		} else {
			System.out.println("Você não tem desconto");
		}
		
		//8
		double horas;
		System.out.print("Qual foi o número de horas trabalhadas? ");
		horas = scanner.nextDouble();
		double hora = horas * 20.00;
		double hora1 = horas * 15.00;
		if(horas < 10) {
			System.out.println("Bônus por hora extra R$"+hora);
		}else {
			System.out.println("Bônus por hora extra R$"+hora1);
		}
		
		
		
		
		
		
	}
}
