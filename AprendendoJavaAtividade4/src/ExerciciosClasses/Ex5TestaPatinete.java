package ExerciciosClasses;

public class Ex5TestaPatinete {

	public static void main(String[] args) {
		Ex5Patinete patinete1 = new Ex5Patinete();
		Ex5Patinete patinete2 = new Ex5Patinete();
		
		
	patinete1.cor = "Azul";
	patinete1.marca = "Caloi";
	patinete1.acelerar(patinete1.cor,patinete1.marca,100);
	patinete1.freiar(patinete1.cor,patinete1.marca,20);
	
	patinete2.cor = "Rosa";
	patinete2.marca = "Lexx";
	patinete2.acelerar(patinete2.cor,patinete2.marca,300);
	patinete2.freiar(patinete2.cor,patinete2.marca,50);
	

	}

}
