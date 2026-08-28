package prjLista03;
import java.util.Scanner;

public class Tinta {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double comprimento, largura, area, lata;
	
	System.out.println("Digite o comprimento da parede em metros:");
	comprimento = ler.nextDouble();
	System.out.println("Digite a largura da parede em metros:");
	largura = ler.nextDouble();
	area = comprimento + largura;
	lata = area / 3.8;
	System.out.println("Esta é a quantidade de latas de tinta necessárias para pintar toda a parede:" +lata);
	
	
	}

}
