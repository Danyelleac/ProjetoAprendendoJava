package ExerciciosClasses;

public class Ex5Patinete {
	
	//Atributos
	String cor,marca;
	int velocidade=0;
	
	//métodos
	
	void acelerar(String cor, String marca,int aceleracao) {
		velocidade += aceleracao;
		System.out.println("Patinete "+cor+ " da marca "+marca+" sua velocidade foi aumentada para "+aceleracao);
	}
	void freiar(String cor, String marca,int reducao) {
		velocidade -= reducao;
		System.out.println("Patinete "+cor+ " da marca "+marca+" sua velocidade foi reduzida para "+reducao);
	}
	
}
