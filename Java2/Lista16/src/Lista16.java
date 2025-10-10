import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		String[] vetor = new String[6];
		for(int i = 0; i < 6; i++) {
			System.out.print("Informe a cor na posição["+i+"]:");
			vetor[i] = scanner.next();
		}
		for(int i = 0; i < 6; i++) {
			System.out.println("Cor["+i+"]:"+vetor[i]);
		}
		
		System.out.println("=============================================");
		
		//2
		double[] numero = new double[8];
		for(int i = 0; i < 8; i++) {
			System.out.print("Informe um número decimal na posição["+i+"]:");
			numero[i] = scanner.nextDouble();
		}
		for(int i = 0; i < 8; i++) {
			System.out.println(numero[i]);
		}
		
		System.out.println("=============================================");
		
		//3
		int[] num = new int[10];
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um número na posição["+i+"]:");
			num[i] = scanner.nextInt();
		}
		System.out.println("Os números pares do vetor são: ");
		for(int i = 0; i < 10; i++) {
			if(num[i] % 2 == 0) {
				System.out.println("Posição["+i+"]:"+num[i]);
			}
		}
		
		System.out.println("=============================================");
		
		//4
		int[] num1 = new int[12];
		for(int i = 0; i < 12; i++) {
			System.out.println("Informe um número da posição["+i+"]:");
			num1[i] = scanner.nextInt();
			if(num1[i] < 50) {
				System.out.println("Menor que 50");
			}
		}
		
			System.out.println("=============================================");
				
		//5
		String[] nome = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um nome na posição["+i+"]: ");
			nome[i] = scanner.next();
		}
		boolean encontrado = false;
		System.out.print("Digite um nome extra: ");
		String nome1 = scanner.next();
		for(int n = 0; n < 5; n++) {
			if(nome[n].equalsIgnoreCase(nome1)) {
				encontrado = true;
				}
			}
			if(encontrado) {
				System.out.println("Esse nome existe no vetor");
			}else{
				System.out.println("Esse nome não existe no vetor");
			}
			
			System.out.println("=============================================");
			
		//6
		String[] produto = new String[4];
		double[] preco = new double[4];
		for(int i = 0; i <4; i++) {
			System.out.print("Digite o nome do produto ["+i+"]:");
			produto[i] = scanner.next();
			System.out.print("Digite o preço do prodto ["+i+"]:");
			preco[i] = scanner.nextDouble();
		}
		System.out.println("Lista dos produtos:");
			
		System.out.println("=============================================");
			
		for(int i = 0; i < 4; i++) {
			System.out.println("O produto "+produto[i]+" custa "+preco[i]);
		}
		
		System.out.println("=============================================");
		
		//7
		double[] nota = new double[6];
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite a nota ["+i+"]:");
			nota[i] = scanner.nextDouble();
			if(nota[i] > 6 && nota[i] <7) {
				System.out.println("Aluno em recuperação");
			}else if(nota[i] <6){
				System.out.println("Aluno Reprovado");
			}else {
				System.out.println("Aluno Aprovado");
			}
		}
		
		System.out.println("=============================================");
		
		//8
		double[] ingresso = new double[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o preço do ingresso na posição ["+i+"]:");
			ingresso[i] = scanner.nextDouble();
			if(ingresso[i] > 100) {
				System.out.println("Ingresso com promoção disponível");
			}
		}
		











	}
}
