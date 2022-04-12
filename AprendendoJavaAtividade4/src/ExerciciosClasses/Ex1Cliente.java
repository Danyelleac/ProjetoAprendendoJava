package ExerciciosClasses;

public class Ex1Cliente {
	
	//Atributos
	private String nome,produto;
	private int idade;
	
	
	//métodos
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void escolherProduto(String nome,int idade){
		System.out.println(nome+" de "+idade+" anos esta escolhendo produto...");
	}
	
	void realizarPagamento(String nome,String produto){
		System.out.println(nome+" escolheu um/uma "+produto+" e realizou o  pagamento");
	}

}
