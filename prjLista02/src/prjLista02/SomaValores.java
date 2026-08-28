package prjLista02;
import java.util.Scanner;

public class SomaValores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int v1, v2, soma;
		
		System.out.println("Digite o 1o valor:");
		v1 = leia.nextInt(); //Leitura número inteiro Leia(v1)
		System.out.println("Entre com o 1o valor:");
		v2 = leia.nextInt(); //Leitura número inteiro Leia(v2)
		soma = v1+v2;
		System.out.println("A soma é:"+soma);
		
	}
}
