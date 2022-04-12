package Aula4POOClasses;

public class testaCarro {

	public static void main(String[] args) {
		//estanciamento de objeto-criar o objeto
		carro c1 = new carro();
		carro c2 = new carro();
		
		c1.modelo = "CRV";
		c1.ano = 2020;
		c1.marca = "Honda";
		c1.placa = "Dany1234";
		c1.velocidade = 0;
		
		c2.velocidade = 0;
		
		c1.acelerar(50);
		System.out.println("velocidade acelerando "+c1.velocidade);
		c1.acelerar(150);
		System.out.println("velocidade acelerando "+c1.velocidade);
		c1.freiar(50);
		System.out.println("velocidade acelerando "+c1.velocidade);
		
		c2.acelerar(150);
		System.out.println("velocidade acelerando "+c2.velocidade);
		c2.freiar(50);
		System.out.println("velocidade acelerando "+c2.velocidade);
		c2.acelerar(250);
		System.out.println("velocidade acelerando "+c2.velocidade);
		

	}

}
