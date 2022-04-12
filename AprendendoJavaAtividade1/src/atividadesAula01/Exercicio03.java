package atividadesAula01;
//exercicio 3
//Danyelle Candido

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas,minutos,segundos,eventoSegundos;
		
		System.out.println("Qual a duração do evento da fabrica em segundos? ");
		eventoSegundos = leia.nextInt(); 

		leia.close();
		
		horas = eventoSegundos/3600;
		minutos = (eventoSegundos % 3600)/60;
		segundos = (eventoSegundos % 3600)%60;
		System.out.println("O evento da fabrica durou "+ horas +" hora "+ minutos+" min "+segundos+ " seg ");

	}

}
