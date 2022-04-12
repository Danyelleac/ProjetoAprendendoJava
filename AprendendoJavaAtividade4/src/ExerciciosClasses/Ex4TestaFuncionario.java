package ExerciciosClasses;

public class Ex4TestaFuncionario {

	public static void main(String[] args) {
		Ex4Funcionario funcionario1 = new Ex4Funcionario();
		Ex4Funcionario funcionario2 = new Ex4Funcionario();
		
		funcionario1.nome = "Maria";
		funcionario1.cargo = "Supervisora";
		funcionario1.salario = 1544.88;
		
		funcionario2.nome = "Anna";
		funcionario2.cargo = "Diretora";
		funcionario2.salario = 7544.88;

		funcionario1.consultarSalario(funcionario1.nome, funcionario1.cargo, funcionario1.salario);
		funcionario2.consultarSalario(funcionario2.nome, funcionario2.cargo, funcionario2.salario);
	}

}
