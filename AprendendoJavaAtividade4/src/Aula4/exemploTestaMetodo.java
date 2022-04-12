package Aula4;

public class exemploTestaMetodo {

	public static String metodo6(int valorInicial,int valorFinal) {
		String texto = "";
		for(int contador = valorInicial; contador<valorFinal;contador++) {
			texto +=contador+" ";
		}
		return texto;
	}
	
}
