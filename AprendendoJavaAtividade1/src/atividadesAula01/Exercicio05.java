package atividadesAula01;
//exercicio 05
//Danyelle Candido

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		double n1,n2,n3,media;
		String nome;

		//requisitando informação do user
		System.out.println("informe seu nome ");
			nome=leia.next();
		System.out.println("informe sua primeira nota ");
			n1=leia.nextDouble();//peso 2
		System.out.println("informe sua segunda nota ");
			n2=leia.nextDouble();//peso 3
		System.out.println("informe sua terceira nota ");
			n3=leia.nextDouble();//peso 5
			
		leia.close();
		

		//calculos
		media = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);

		//enviando devolutiva ao usuario
		System.out.println(nome+ " sua média é "+media);

			
		
	}

}
