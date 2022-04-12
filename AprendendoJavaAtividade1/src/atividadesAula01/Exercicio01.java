package atividadesAula01;
//exercicio 01
//Danyelle Candido

//importando biblioteca
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//pedindo que toda vez que eu chamar o comando leia  ele escaneie a resposta do meu user
		Scanner leia = new Scanner(System.in);
		
		//declarando variaveis		
		int anos,meses,dias,idadeDias;
		String nome;
		
		//solicitando infos ao user
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		System.out.println(nome+" insira seu idade em anos meses e dias \n");
		System.out.println("Anos: ");
		anos = leia.nextInt();
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		leia.close();
		
		//calculo
		idadeDias = (anos*365)+(meses*30)+dias;
		
		//resposta ao user
		System.out.println(nome+" sua idade em dias é: "+idadeDias);
		
		

	}

}
