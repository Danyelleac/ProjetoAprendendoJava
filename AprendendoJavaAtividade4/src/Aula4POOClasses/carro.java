package Aula4POOClasses;

public class carro {
	
	//Atributos--> Variaveis
	String modelo,marca,placa;
	int ano,velocidade;
	
	//M�todos-->A��es
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reducao) {
		velocidade -= reducao;
	}
	

}
