package Aula4POOClasses;

public class testaAulo {

	public static void main(String[] args) {
		aluno a1 = new aluno();
		        
		a1.nome = "Danyelle";
		a1.idade = 22;
		a1.curso = "Java";
		a1.matricula = "12ad12";
		
		System.out.println("A aluna "+a1.nome+" tem "+a1.idade+" estuda  "+a1.curso+" seu numero de matricula é "+a1.matricula);

		a1.assistirAula();
		a1.estudar();
		a1.fazerProva();
		
	}

}
