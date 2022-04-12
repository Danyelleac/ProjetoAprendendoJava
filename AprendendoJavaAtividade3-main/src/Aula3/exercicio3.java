package Aula3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0,menor21=0,maior50=0;
		
		while(idade!=-99) {
			
			
			System.out.println("Digite a idade: (para finalizar digite -99) ");
			idade = leia.nextInt();
			if(idade<21 && idade>0) {
				menor21++;
								
			}else if(idade>50) {
				maior50++;
				
			}
			
				
			
		}
		leia.close();	
		System.out.println("Há "+menor21+" pessoas com menos de 21 anos e "+maior50+ " pessoas com pais de 50 anos");
		

	}

}
