package atividadesAula01;
//exerc�cio 6
//Danyelle Candido
import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[]args) {
		
		Scanner leia= new Scanner(System.in);
		//variaveis
		double x1,x2,y1,y2,d,yt,xt;

		//requisitando informa��o do user
		System.out.println("informe a localiza��o do ponto 1(x,y)\n");
		System.out.println("x");
			x1=leia.nextDouble();
		System.out.println("y");
			y1=leia.nextDouble();	 
			
		System.out.println("informe a localiza��o do ponto 2(x,y)\n");
		System.out.println("x");
			x2=leia.nextDouble();
		System.out.println("y");
			y2=leia.nextDouble();	 
		leia.close();
		

		//calculos
		xt=Math.pow((x2-x1),2.0);
		yt=Math.pow((y2-y1),2.0);
		
		d = Math.sqrt((xt+yt));

		//enviando devolutiva ao usuario
				System.out.println("A diferen�a �  "+d);
		
		
		
	}
}
