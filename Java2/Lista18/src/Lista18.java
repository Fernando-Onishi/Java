
public class Lista18 {

	public static void main(String[] args) {
		mensagem();
		separador();
		frase();
		separador();
		contagem();
		separador();
		vogal();
		separador();
		quadrado();
		separador();
		numPar();
		separador();
		contagemReg();
		separador();
		triangulo();
		separador();
		diaDaSemana();
	}
	
	public static void separador() {
		System.out.println("========================");
	}
	
	//1
	public static void mensagem() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+"° Fernando");
		}
	}
	
	//2
	public static void frase() {
		System.out.println("Cada pequeno passo que você dá hoje, mesmo que pareça simples, está construindo o caminho para conquistas muito maiores amanhã.");
	}
	
	//3
	public static void contagem() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	//4
	public static void vogal() {
		char[] vogais = {'A', 'E', 'I', 'O', 'U'};
		System.out.println(vogais);
	}
	
	//5
	public static void quadrado() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 14; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	//6
	public static void numPar() {
		for(int i = 2; i <=20; i+=2) {
				System.out.println(i);
			}
		}
	
	//7
	public static void contagemReg() {
		for(int i = 10; i >= 1; i--) {
				System.out.println(i);
			}
		}
	
	//8
	public static void triangulo() {
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j <= i; j++) {
					System.out.print(" * ");
				}
			System.out.println();
			}
		}
	
	//9
	public static void diaDaSemana() {
		String semana = "Domingo \n" + "Segunda \n" + "Terça \n" + "Quarta \n" + "Quinta \n" + "Sexta \n" + "Sábado \n";
			System.out.println(semana);
	}
	
	

	}

