
public class MyClass {
  public static void main(String args[]) {
      
    //01
      double instalacao = 300.00;
      double limpeza = 150.00;
      double manutencao = 499.00;
      double valorFinal = instalacao + limpeza + manutencao;
     System.out.println("\n" + " Questão 01: ");
      System.out.println("O cliente deverá pagar: " + valorFinal);
      
     //02
     
     double salario = 35.00;
     double hora = 8;
     double salarioFinal = salario * hora;
     System.out.println("\n" + " Questão 02: ");
     System.out.println("O salário ao final do dia será: " + salarioFinal);
     
     //03
     
     int caixa = 27;
     int compra = 16;
     int compraFinal = caixa * compra;
     System.out.println("\n" + " Questão 03: ");
     System.out.println("Pamela possui " + compraFinal + " Caixas");
     
     //04
     int venda = 300;
     int quantidade = 20;
     double vendafinal = venda / quantidade;
     System.out.println("\n" + " Questão 04: ");
     System.out.println("Eles usaram " + vendafinal + " Caixas");
     
     //05
     
     int estoqueinicial = 120;
     int vendainicial = 80;
     double preco = 30.00;
     int comprafinal = 50;
     double faturamento = vendainicial * preco;
     double estoque = estoqueinicial - vendainicial + comprafinal;
     System.out.println("\n" + " Questão 05: ");
     System.out.println("Ele possui " + estoque + " camisetas e R$" + faturamento + " de faturamento");
     
     //06
     int num = 50;
     int dobro = num * 2;
     double metade = num / 2;
     System.out.println("\n" + " Questão 06: ");
     System.out.println("O dobro do número é: " + dobro);
     System.out.println("A metade do número é: " + metade);
     
  }
}