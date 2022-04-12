package ExerciciosClasses;

public class Ex3TestaEletronico {

	public static void main(String[] args) {
		Ex3Eletronico Eletronico1 = new Ex3Eletronico();
		Ex3Eletronico Eletronico2 = new Ex3Eletronico();
		
		Eletronico1.nome = "TV";
		Eletronico1.marca = "LG";
		Eletronico1.valor = 1800.99;
		
		Eletronico2.nome = "Geladeira";
		Eletronico2.marca = "Eletrolux";
		Eletronico2.valor = 5899.99;
		
		Eletronico1.consultarValorProduto(Eletronico1.nome, Eletronico1.marca, Eletronico1.valor);
		Eletronico2.consultarValorProduto(Eletronico2.nome, Eletronico2.marca, Eletronico2.valor);
		
		

	}

}
