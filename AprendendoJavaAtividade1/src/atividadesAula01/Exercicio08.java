package atividadesAula01;
//Exercicio 8
//Danyelle Amarante Candido

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		double custoConsumidor, custoFabrica,porcDistribuidor,porcImpostos;

		//requisitando informação do user
		System.out.println("Informe a custo de fabrica do veiculo: R$ ");
			custoFabrica =leia.nextDouble();
			
		leia.close();

		//calculos
		porcImpostos = custoFabrica*0.45;
		porcDistribuidor = custoFabrica*0.28;
		custoConsumidor = custoFabrica + porcDistribuidor + porcImpostos;

		//enviando devolutiva ao usuario
		System.out.println("O custo ao Consumidor é "+custoConsumidor);
		
	}
}
