package prjLista03;
import java.util.Scanner;

public class Festa {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double convMasc, convFem, salgado1 ,salgado2, doce1, doce2, conv, bolo, bebida1, bebida2, salgadoTotal, doceTotal, bebidaTotal;
	
	System.out.println("Digite a quantidade de convidados masculinos:");
	convMasc = ler.nextInt();
	System.out.println("Digite a quantidade de convidados femininos:");
	convFem = ler.nextInt();
	salgado1 = convMasc * 15;
	salgado2 = convFem * 10;
	doce1= convMasc * 6;
	doce2 = convFem * 8;
	conv = convMasc + convFem;
	bolo = (conv * 100) / 1000;
	bebida1 = convMasc * 600;
	bebida2 = convFem * 500;
	salgadoTotal = salgado1 + salgado2;
	doceTotal = doce1 + doce2;
	bebidaTotal = (bebida1 + bebida2) / 1000;
	System.out.println("A quantidade total de salgados para os convidados é: " +salgadoTotal +" unidades");
	System.out.println("A quantidade total de doces para os convidados é: " +doceTotal +" unidades");
	System.out.println("A quantidade total de bebida para os convidados é: " +bebidaTotal +" litros");
	System.out.println("A quantidade de bolo total em kg para os convidados é: " +bolo+"kg");
	
	}
	
	

}