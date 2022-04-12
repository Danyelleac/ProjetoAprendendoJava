package ExerciciosClasses;

public class Ex6TestaBancaria {

	public static void main(String[] args) {
		Ex6Bancaria cliente1 = new Ex6Bancaria();
		Ex6Bancaria cliente2 = new Ex6Bancaria();
		
		cliente1.conta = 1234;
		cliente1.agencia = 223;
		cliente1.saldo = 1450.99;
		
		cliente2.conta = 4534;
		cliente2.agencia = 207;
		cliente2.saldo = 9550.99;
		
		cliente1.consultarSaldo(cliente1.conta, cliente1.agencia, cliente1.saldo);
		cliente2.consultarSaldo(cliente2.conta, cliente2.agencia, cliente2.saldo);

	}

}
