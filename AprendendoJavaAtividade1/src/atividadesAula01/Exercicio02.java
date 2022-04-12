package atividadesAula01;
//exercíco 2
//Danyelle Cândido

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano,mes,dia,idadeDias;
		String nome;

		System.out.println("Qual seu nome? ");
		nome = leia.next();
		System.out.println("Qual sua idade em dias? \n");
		idadeDias = leia.nextInt(); 
		
		leia.close();

		ano = idadeDias/365;
		mes = (idadeDias % 365)/30;
		dia = (idadeDias % 365)%30;
				System.out.println(nome +" sua idade é "+ ano+" anos "+mes+ " meses "+dia+ " dias ");
		
		

	}

}
