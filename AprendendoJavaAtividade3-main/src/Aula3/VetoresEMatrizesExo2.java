package Aula3;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

import java.util.Scanner;

public class VetoresEMatrizesExo2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//DECLARA��O DE MATRIZ
		int [] resultadoDado = new int[10];
		int maiorResultado = 0,quantMaiorResultado = 0,soma=0;
		double media;
		

		for(int i=0; i<=9;i++){
			
				//solicita��o ao user
				System.out.println(" Qual o "+(i+1)+"� resultado do dado: ");
				resultadoDado[i]=leia.nextInt();

				if (maiorResultado<resultadoDado[i]){
					maiorResultado= resultadoDado[i];
				}//fimSe 
				
		}//fimPara
		leia.close();


		for(int i=0; i<=9;i++){

				//imprimindo os vetores
				System.out.println(resultadoDado[i]+" | ");

				soma+=resultadoDado[i];
				
				if(maiorResultado == resultadoDado[i]){
					quantMaiorResultado +=1;
				}//fimSe 
				
		}//fimPara


		//calculo
		media=soma/10;

		//retorno ao user
		System.out.println(" a maior pontua��o foi: "+maiorResultado+
		"\n a quantidade de vezes que ela foi atingida foi "+quantMaiorResultado+
		"\n a media dos resultados obtidos �: "+media);

	}

}
