package prjLista02;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite o primeiro valor:");
		nota1 = leia.nextDouble();
		System.out.println("Digite o segundo valor:");
		nota2 = leia.nextDouble();
		System.out.println("Digite o terceiro valor:");
		nota3 = leia.nextDouble();
		System.out.println("Digite o quarto valor:");
		nota4 = leia.nextDouble();
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média das notas é:"+media);
		
		
	}

}
