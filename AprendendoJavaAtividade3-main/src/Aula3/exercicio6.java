package Aula3;


import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("M�DIA DOS MULTIPLOS DE 3 ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Digite numeros para saber as medias dos multiplos de tr�s para finalizar digite 0");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		
		int numeroDigitado,somaNumero=0,somaQuantNumero=0;
		
		double media;
		
		
		do {
			
			System.out.println("Digite o numero: ");
			numeroDigitado = leia.nextInt();
			
			if(numeroDigitado%3==0 && numeroDigitado!=0) {
				somaNumero+=numeroDigitado;
				somaQuantNumero++;
			}
					
			
		}while(numeroDigitado!= 0);
		
		leia.close();
		
		media= somaNumero/somaQuantNumero;
		
		System.out.println("A m�dia dos multiplos de 3 digitados �: "+media);

	}

}
