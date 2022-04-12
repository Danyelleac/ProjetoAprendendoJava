package atividadesAula01;
//Exercicio7
//Danyelle Cândido

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int a,b,c,d,e,f,x,y;

		//requisitando informação do user
		System.out.println("Escreva o valor de A? ");
			a=leia.nextInt(); 
		System.out.println("Escreva o valor de B? ");
			b =leia.nextInt();
		System.out.println("Escreva o valor de C? ");
			c =leia.nextInt();
		System.out.println("Escreva o valor de D? ");
			d =leia.nextInt();
		System.out.println("Escreva o valor de E? ");
			e =leia.nextInt();
		System.out.println("Escreva o valor de F? ");
			f =leia.nextInt();
		
		leia.close();
					
		//calculos

		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));

		//enviando devolutiva ao usuario
		System.out.println("Os valores de X e Y são: x= "+x+" y= "+y);
	
	}

}
