package prjLista02;
import java.util.Scanner;

public class Prestacao {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double valor, tempo, taxa, prestacao;
	
	System.out.println("Digite o valor original da prestação:");
	valor = leia.nextDouble();
	System.out.println("Digite o tempo de atraso:");
	tempo = leia.nextDouble();
	System.out.println("Digite a taxa de juros:");
	taxa = leia.nextDouble();
	prestacao =  valor + (valor * (taxa/100)*tempo);
	System.out.println("O valor da prestação com juros é:"+prestacao);
	
	}

}
