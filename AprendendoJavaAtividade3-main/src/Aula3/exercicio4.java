package Aula3;
/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos 
 de uma região. Para tanto, a cada uma das pessoas era perguntado: idade,  * sexo (1-feminino /
 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 
 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 
 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.
*/

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("PESQUISA DE CARACTERISTICAS PSICOLÓGICAS");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("Informe a Quantidade de Entrevistados: ");
		int quantEntrevistados = leia.nextInt();
		
		int calmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0;
		int nervosasMais40=0,calmasMenos18=0,i=0;
		
		while(i<quantEntrevistados) {
			
			System.out.println("Informe a idade da pessoa participante: ");
			int idade = leia.nextInt();
			System.out.println("Informe o sexo da pessoa participante: ");
			System.out.println("1-feminino 2-masculino ou 3-Outros ");
			int sexo =leia.nextInt();
			System.out.println("Informe o temperamento da pessoa participante: ");
			System.out.println("1-pessoa calma; 2-pessoa nervosa e 3-pessoa agressiva ");
			int temperamento =leia.nextInt();
			
		
			if(idade>40 && temperamento == 2) {
				nervosasMais40++;
			}
			
			if(idade<18 && temperamento == 1) {
				calmasMenos18++;
			}
			if(temperamento == 1) {
				calmas++;
			}
			
		
			switch(sexo){
			case 1 :
				switch(temperamento) {
				case 2:
					mulheresNervosas++;
					break;
							
				}
				
			case 2 :
				switch(temperamento) {
				case 3:
					homensAgressivos++;
					break;
			
				}
				
			case 3:
				switch(temperamento) {
				case 1:
					outrosCalmos++;
					break;
				
				}
				
				
		}
			
			
			i++;
		}
		leia.close();
		System.out.println("////////////////RESULTADO DA PESQUISA/////////////////");
		System.out.println("A quantidade de entrevistados foi: "+quantEntrevistados);
		System.out.println("A quantidade de pessoas calmas foi: "+calmas);
		System.out.println("A quantidade de mulheres nervosas foi: "+mulheresNervosas);
		System.out.println("A quantidade de homens agressivos foi: "+homensAgressivos);
		System.out.println("A quantidade de outros generos calmos foi: "+outrosCalmos);
		System.out.println("A quantidade de pessoas nervosas com mais de quarenta foi: "+nervosasMais40);
		System.out.println("A quantidade de pessoas calmas com menos de 18 foi: "+calmasMenos18);		 

	}

}
