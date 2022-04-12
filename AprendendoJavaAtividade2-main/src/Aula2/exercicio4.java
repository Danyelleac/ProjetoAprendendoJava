package Aula2;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Digite um numero: ");
	numero=leia.nextInt();
	
	leia.close();
	
	if(numero%2==0) {
		
		System.out.println("Seu numero é par e a raiz dele é "+ Math.sqrt(numero));
	}else {
		
		System.out.println("Seu numero é impar e a raiz dele é "+ Math.pow(numero,2));
		
	}
	
	
	}

}
