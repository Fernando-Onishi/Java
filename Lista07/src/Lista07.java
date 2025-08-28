import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua idade \nR:");
		int idade4 = scanner.nextInt();
		System.out.print("Possui experiência prévia? \nR:");
		String resposta4 = scanner.next();
		if(idade4 > 20 && idade4 < 40 && resposta4.equalsIgnoreCase("Sim")) {
			System.out.println("Inscrição aceita");
		}else {
			System.out.println("Inscrição não permitida");
		}
		
		// 01
		System.out.print("Digite sua idade \nR:");
		int idade = scanner.nextInt();
		if (idade < 16 || idade > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}

		// 2
		System.out.print("Informe o valor do produto \nR: ");
		double valor = scanner.nextDouble();
		System.out.print("Informe a quantidade comprada \nR: ");
		double quant = scanner.nextDouble();
		double total = valor * quant;
		if (total > 200 && quant > 5) {
			double valorFinal = total - (total * 0.15);
			System.out.printf("Ganhou desconto! irá pagar: %.2f", valorFinal);
		} else {
			System.out.println("Não ganhou desconto irá pagar: R$" + total);
		}

		// 3
		System.out.print("Indique sua frequência cardíaca em bpm \nR: ");
		double freq = scanner.nextDouble();
		System.out.print("Sente tontura? \nR: ");
		String resposta1 = scanner.next();
		if (freq >= 100 || resposta1.equalsIgnoreCase("Sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}
		
		// 4
		System.out.print("Informe sua idade: \nR: ");
		int idade2 = scanner.nextInt();
		System.out.print("É residente do estado? \nR: ");
		String resposta2 = scanner.next();
		if (idade2 >= 18 && idade2 <= 30 && resposta2.equalsIgnoreCase("Sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}

		// 5
		System.out.print("Informe o número de projetos concluídos \nR: ");
		int projetos = scanner.nextInt();
		System.out.print("Informe o número de erros reportados \nR: ");
		int erros = scanner.nextInt();
		if (projetos > 10 && erros < 3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}

		// 6
		System.out.print("Informe sua idade \nR:");
		int idade3 = scanner.nextInt();
		System.out.print("Possui passaporte válido? \nR:");
		String resposta3 = scanner.next();
		if(idade3 >= 18 && resposta3.equalsIgnoreCase("Sim")) {
			System.out.println("Viagem  autorizada");
		}else {
			System.out.println("Viagem não autorizada");
		}
		
		//7
		System.out.print("Informe sua nota final \nR:");
		double nota = scanner.nextDouble();
		System.out.print("Informe o número de aulas assistidas \nR:");
		double aulas = scanner.nextDouble();
		if(nota >= 70 && aulas >=40) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		//8
		System.out.print("Digite a umidade do solo \nR:");
		double umid = scanner.nextDouble();
		System.out.print("Digire a temperatura \nR:");
		double temp = scanner.nextDouble();
		if(umid < 30 || temp > 30) {
			System.out.println("Irrigação necessária");
		}else {
			System.out.println("Irrigação não necessária");
		}
		
		//9
		
		
	}

}
