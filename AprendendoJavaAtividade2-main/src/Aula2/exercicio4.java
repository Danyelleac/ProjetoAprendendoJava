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
		
		System.out.println("Seu numero � par e a raiz dele � "+ Math.sqrt(numero));
	}else {
		
		System.out.println("Seu numero � impar e a raiz dele � "+ Math.pow(numero,2));
		
	}
	
	
	}

}
