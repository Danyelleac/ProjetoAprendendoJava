package Aula3;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class VetoresEMatrizesExo4 {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			//DECLARAÇÃO DE MATRIZ
				int [][]matriz=new int[3][3];
				int soma=0,somaDiagonal=0;
				

				for(int linha=0; linha<=2;linha++){
					for(int coluna=0;coluna<=2;coluna++){
						System.out.println(" insira o valor da "+(coluna+1)+"º linha da "+(linha+1)+"° coluna da matriz: ");
						matriz[linha][coluna]=leia.nextInt();
						soma+=matriz[linha][coluna];
							if(linha==coluna) {
									somaDiagonal+=matriz[linha][coluna];
								}
						}

					}
					leia.close();
				//retorno ao user
				System.out.println("\n a soma de todos os valores da matriz é : "+soma);
				System.out.println("\n a soma de todos os valores da diagonal principal é : "+somaDiagonal);

	}

}
