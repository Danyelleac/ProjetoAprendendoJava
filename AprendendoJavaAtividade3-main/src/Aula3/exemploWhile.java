package Aula3;

import java.util.Scanner;

public class exemploWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		 
		int numero =-1;
		
		while(numero!=10) {
			System.out.println("Digite um número:");
			numero = in.nextInt();
			in.close();
			
			if(numero == 10){
				System.out.println("Acertou!!! ");
				
				
			}else {
				System.out.println("Errou!! ");
			}
				
			}
			

	}

}
