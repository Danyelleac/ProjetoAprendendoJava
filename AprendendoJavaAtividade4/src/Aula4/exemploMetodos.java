package Aula4;

import java.util.Scanner;

public class exemploMetodos {

	static int num3=2,num4=3,multiplicacao,num7,num8,num9=3,num10=8;
	
	public static void main(String[] args) {
		scan();
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(8,2);
		metodo7();

	}
	public static void scan() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com os valores de parametro do método - 5: ");
		num7 = entrada.nextInt();
		num8 = entrada.nextInt();
		entrada.close();
	}	
	
	
	public static void metodo1() {
		System.out.println("Olá eu sou o método-01");
	}
	public static void metodo2() {
		int num1=10,num2=30,soma;
		soma= num1+num2;
		System.out.println("soma do método-02 "+soma);
	}
	public static void metodo3() {
		multiplicacao=num3*num4;
		
	}
	public static void metodo4() {
		System.out.println("Multiplicação no método-04 "+multiplicacao);
	}
	
	public static void metodo5(int num5,int num6) {
		double divisao = num5/num6;
		System.out.println("Multiplicação no método-05 "+divisao);
	}
	public static void metodo7 () {
		
		System.out.println(exemploTestaMetodo.metodo6(num9, num10));
	}
}
