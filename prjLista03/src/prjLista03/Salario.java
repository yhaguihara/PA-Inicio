package prjLista03;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double salAtual, salReajuste;
	
	System.out.println("Digite o valor do salário atual:");
	salAtual = ler.nextDouble();
	salReajuste = salAtual * 1.1;
	System.out.printf("Este é o valor do salário após o reajuste:%.2f" ,salReajuste);
	
	}

}