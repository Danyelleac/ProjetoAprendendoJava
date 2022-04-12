package Aula3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int numero,somaNumero=0;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero");
			numero=leia.nextInt();
			
			somaNumero += numero;
			
			
		}while(numero==0);
		
		leia.close();
		
		System.out.println("A soma dos numeros digitados é "+somaNumero);
		
		

	}

}
