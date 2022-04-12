package Aula3;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

import java.util.Scanner;

public class VetoresEMatrizesExo2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//DECLARAÇÃO DE MATRIZ
		int [] resultadoDado = new int[10];
		int maiorResultado = 0,quantMaiorResultado = 0,soma=0;
		double media;
		

		for(int i=0; i<=9;i++){
			
				//solicitação ao user
				System.out.println(" Qual o "+(i+1)+"º resultado do dado: ");
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
		System.out.println(" a maior pontuação foi: "+maiorResultado+
		"\n a quantidade de vezes que ela foi atingida foi "+quantMaiorResultado+
		"\n a media dos resultados obtidos é: "+media);

	}

}
