package Aula2;

import java.util.Scanner;
import java.util.Locale;

public class Exemplo2 {
	
	public static void main(String[]args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double num1,num2,resultado=0.0;
		char operacao;
	
		System.out.println("Digite um numero: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite a operação matemática (+,-,*,/): ");
		operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextDouble();
		
		entrada.close();
		
		if(operacao=='+') {
			resultado = num1 + num2;
		}else if(operacao=='-') {
			resultado = num1 - num2;
		}else if(operacao=='*') {
			resultado = num1 * num2;
		}else if(operacao=='/') {
			resultado = num1 / num2;
		}else {
			System.out.println("Operação Invalida!!!");
	
		}
		System.out.println("Resultado: "+resultado);
		
	}

}
