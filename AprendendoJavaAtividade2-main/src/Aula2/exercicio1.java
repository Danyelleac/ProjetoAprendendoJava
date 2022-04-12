package Aula2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,maiorInteiro=0;
		
		System.out.println("Digite o primeiro numero: ");
		n1=leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2=leia.nextInt();
		System.out.println("Digite o terceira numero: ");
		n3=leia.nextInt();
		
		leia.close();
		
		if(n1>maiorInteiro) {
			maiorInteiro = n1;
			
		}
		if(n2>maiorInteiro) {
			maiorInteiro = n2;
			
		}
		if(n3>maiorInteiro) {
			maiorInteiro = n3;
			
		}
	
		System.out.println("O maior numero digitado foi "+maiorInteiro);
	}
}
	
