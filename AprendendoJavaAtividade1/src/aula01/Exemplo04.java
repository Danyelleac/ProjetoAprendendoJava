package aula01;

//estou importando minha biblioteca para minha classe
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		//é uma biblioteca que lê oque o user digitar no console
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma,subtracao;
		
		System.out.println("Digite o valor de a: ");
		//aqui estou pedindo pra ler oque o usuário escreveu-numero inteiro
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		leia.close();
		
		soma = a+b;
		subtracao = a-b;
		
		System.out.println("O resultado da soma é:  "+soma);
		System.out.println("O resultado da subtração é:  "+subtracao);
		fim();

	}
	
	public static void fim() {
		System.out.println("fim");
	}

}
