package Aula3;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

public class VetoresEMatrizesExo3 {

	public static void main(String[] args) {
		
		//DECLARAÇÃO DE MATRIZ
				int [][] N1 = new int [][] {{1,2,4,4,6,10},{8,7,6,5,4,3},
					{1,2,1,9,8,7},{6,5,1,3,2,1}};
				
				int [][] N2 = new int[][] {{01,02,03,04,05,06},{7,8,9,1,1,1},
					{3,1,1,1,7,8},
					{1,1,2,2,2,4}};
				int	[][] M1 = new int [4][6];
				int	[][] M2 = new int [4][6];

				//PARA M1(SOMA)
				System.out.println("tabela M1\n");
				for(int linha=0; linha<=3;linha++){
					for(int coluna=0;coluna<=5;coluna++){
						M1[linha][coluna] = N1[linha][coluna]+N2[linha][coluna];
						System.out.println(M1[linha][coluna]+" | ");
					}//fimparaM1 coluna
					System.out.println("\n ");

				}//fimparaM1 linha

				//PARA M2 SUBTRAÇÃO
				System.out.println("tabela M2\n");
				for(int linha=0; linha<=3;linha++){
					for(int coluna=0;coluna<=5;coluna++){
						M2[linha][coluna] = N1[linha][coluna]-N2[linha][coluna];
						System.out.println(M2[linha][coluna]+" | ");
					}//fimparaM2 coluna
					System.out.println("\n ");

				}//fimparaM2 linha

	}

}
