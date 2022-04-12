package ExerciciosClasses;

public class Ex1TestaCliente {

	public static void main(String[] args) {

	Ex1Cliente cliente1 = new Ex1Cliente();
	Ex1Cliente cliente2 = new Ex1Cliente();
	
	cliente1.setNome("Maria");
	cliente1.setIdade(22);
	cliente1.setProduto ("Tênis");
	
	cliente2.setNome ("João");
	cliente2.setIdade (32);
	cliente2.setProduto("Regata");
	
	cliente1.escolherProduto(cliente1.getNome(), cliente1.getIdade());
	cliente1.realizarPagamento(cliente1.getNome(), cliente1.getProduto());
	
	cliente2.escolherProduto(cliente2.getNome(), cliente2.getIdade());
	cliente2.realizarPagamento(cliente2.getNome(), cliente2.getProduto());
	
	}

}
