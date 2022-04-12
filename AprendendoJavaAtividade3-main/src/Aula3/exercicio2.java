package Aula3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int numeroImpar=0,numeroPar=0;
		
		for(int i=0;i<10;i++) {
		
		System.out.println("digite o " +(i+1)+"ºnumero:");
		int numero = leia.nextInt();
		
		leia.close();
		
		if(numero%2==0) {
			numeroPar++;
			
		}else {
			numeroImpar++;
	}
		
		
		}
		
		System.out.println("A quantidade de numeros pares são: "+numeroPar+" a quantidade de numeros impares são: "+numeroImpar);

	}

}
