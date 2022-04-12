package Aula3;
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
import java.util.Scanner;

public class VetoresEMatrizesExo1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//DECLARAÇÃO DE VETORES
		double[]atividade=new double[5];
		double maiorPontuacao=0.0;
		String nome;

		System.out.println("Insira seu nome: ");
		nome=leia.next();

		for(int i=0; i<=4;i++){
			
			System.out.println("Insira a nota da "+(i+1)+"º atividade: ");
			atividade[i]=leia.nextDouble();

			if(atividade[i]>maiorPontuacao){
				maiorPontuacao=atividade[i];
			}
		}
		
		leia.close();

		for(int i=0; i<=4;i++){
			
			System.out.println(atividade[i]+"|");
		}
			

		//retorno ao user
		System.out.println("\n"+nome+" sua maior pontuação foi: "+maiorPontuacao);
	}
}
