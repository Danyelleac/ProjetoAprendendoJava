package Aula2;

import java.util.Scanner;

public class exemplo1 {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,media;
	
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextDouble();
		
		leia.close();
		
		media = (n1+n2)/2;
		
		if(media>7.0 && media<=10) {
			System.out.println("Aprovado!!"+"\nMédia"+media);
		}else if(media>=3.0 && media < 7.0) {
			System.out.println("Recuperação..."+"\nMédia"+media);
		}else if(media >= 0.0 && media < 3.0){
			System.out.println("Reprovado!!"+"\nMédia"+media);
		}else {
			System.out.println("Valores Inválidos!");
		}
	
		
	}

}
