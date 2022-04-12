package Aula2;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade=leia.nextInt();
		
		leia.close();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Você esta na categoria Infantil");
		}else if (idade>=15 && idade<=17) {
				System.out.println("Você esta na categoria Juvenil");
			}else if (idade>=18 && idade<=25) {
					System.out.println("Você esta na categoria Adulto");
				}else if ((idade<15 && idade>0) || idade>25) {
					System.out.println("Você não pode competir");
				}else {
					System.out.println("Idade invalida");
				}
	}

}
