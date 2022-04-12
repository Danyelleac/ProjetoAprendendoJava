package ExerciciosClasses;

public class Ex7TestaPaciente {

	public static void main(String[] args) {
		Ex7Paciente paciente1 = new Ex7Paciente();
		Ex7Paciente paciente2 = new Ex7Paciente();
		
		paciente1.nome = "Maria";
		paciente1.idade = 22;
		paciente1.diagnostico = "Diabetes";
		
		paciente2.nome = "João";
		paciente2.idade = 32;
		paciente2.diagnostico = "Hipertensão";
		
		paciente1.diagnosticar(paciente1.nome, paciente1.idade, paciente1.diagnostico);
		paciente2.diagnosticar(paciente2.nome, paciente2.idade, paciente2.diagnostico);
			

	}

}
