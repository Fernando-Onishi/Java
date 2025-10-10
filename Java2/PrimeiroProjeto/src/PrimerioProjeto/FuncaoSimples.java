package PrimerioProjeto;

public class FuncaoSimples {

	public static void main(String[] args) {
		separador();
		mensagem();
		separador();
		contagem();
		}
	
		public static void mensagem() {
		System.out.println("Primeira função");
		}
		
		public static void separador() {
			System.out.println("=========================");
		}
		
		public static void contagem() {
			for(int i =1 ; i <= 10; i++) {
				System.out.println(i);
			}
		} 
		
}
