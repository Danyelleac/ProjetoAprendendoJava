package atividadesAula01;
//exercicio 04
//Danyelle Candido

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		// variaveis
		int a,b,c;
		double r,s,d;

		
			//solicitando informações ao usuário
			System.out.println("Qual o valor de A? ");
			a = leia.nextInt();
			System.out.println("Qual o valor de B? ");
			b = leia.nextInt();
			System.out.println("Qual o valor de C? ");
			c = leia.nextInt();
			
			leia.close();
			
			//realizando calculos
			r = Math.pow((a+b), 2);
			s = Math.pow((b+c), 2);
			d = (r+s)/2;
			
			//enviando devolutiva ao usuário
			System.out.println("O S vale "+ s + " o R vale " + r + " portanto (R+S/2): "+ d );
		
		
		
	}

}
