package prjLista03;
import java.util.Scanner;

public class Euro {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double euro, cotacao, real;
	
	System.out.println("Digite a quantidade em euros:");
	euro = ler.nextDouble();
	System.out.println("Digite a cotação do euro:");
	cotacao = ler.nextDouble();
	real = euro * cotacao;
	System.out.println("Este é o valor em reais:" +real);
	
	}

}
