package aula01;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de gal�es: ");
		//aqui estou pedindo pra ler oque o usu�rio escreveu-numero inteiro
		galoes = leia.nextInt();
		
		litros = galoes*3.7854;
		
		System.out.println(galoes+" gal�es s�o: "+litros+"Litros.");
		leia.close();

	}
	
	public static void fim() {
		System.out.println("fim ");
	}

}
