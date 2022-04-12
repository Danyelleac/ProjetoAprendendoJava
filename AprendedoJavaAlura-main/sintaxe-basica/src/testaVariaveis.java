
public class testaVariaveis {
	public static void main(String[]args) {
		System.out.println("Imprimindo uma string no console");
			/*abaixo estamos imprimindo uma string no console*/
			System.out.println("ola novo teste");
			
		System.out.println("Variavel nº inteiro");
			/*abaixo estamos declarando uma variavel de um numero inteiro*/
			int idade;
			idade = 26;
			System.out.println(idade);
			idade = 10 + 26;
			System.out.println(idade);
			idade = 20 + (30 * 10);
			/*abaixo estamos imprimindo no console uma strig e uma variavel , para isso utilizamos o + */
			System.out.println("a idade é"+ idade);
			/*abaixo declaramos uma variavel de um numero real*/
		
		System.out.println("Variavel nº real");
		
			double salario;
			salario = 125.33;
			System.out.println(salario);
			/*abaixo eu estou falando para quando receber salario transformar esta variavel em um numero inteiro, se eu não colocar isso da erro
			 * */
			int valor = (int)salario;
		
		
		System.out.println("Variavel nº caracteres Unicode");
			/*imprime uma letra, ou se pode colocar numeros que são referentes a UTF8 que ela imprimirá o caracter correspondente ao n*da tabela*/
			
			char letra = 66;
			System.out.println(letra);
			String palavra = "ola,tudo certo?";
			System.out.println(palavra);
		
		System.out.println("condicionais if and else");
			int idadeIf = 16;
			if(idadeIf >= 18) {
				System.out.println("você tem mais de 18 anos, seja Bem Vinde");
			}else {
				System.out.println("você não pode entrar!");
			}
			
		System.out.println("Bollean condicionais");
			boolean acompanhado = true;
			if(idadeIf >= 18 || acompanhado) {
				System.out.println("você tem mais de 18 anos, ou esta acompanhado , seja bem vinde!");
			}else {
				System.out.println("você não pode entrar!");
			}			
		
		System.out.println("Escopo e inicialização de variáveis");
			/*não existe valor fixo quando eu não declaro oque a variavel recebe e a variavel declarada dentro do{} só existe dentro do bigode*/
			boolean verdadeiroOuFalso;
			
			if(acompanhado = true) {
				verdadeiroOuFalso = true;
			}else {
				verdadeiroOuFalso = false;
			}
			
			System.out.println(verdadeiroOuFalso);
		
		System.out.println("switch-varias opções de if ");
			
	         int mes = 10;

		        switch (mes) {
		            case 1:
		                System.out.println("O mês é Janeiro");
		                break;
		            case 2:
		                System.out.println("O mês é Fevereiro");
		                break;
		            case 3:
		                System.out.println("O mês é Março");
		                break;
		            case 4:
		                System.out.println("O mês é Abril");
		                break;
		            case 5:
		                System.out.println("O mês é Maio");
		                break;
		            case 6:
		                System.out.println("O mês é Junho");
		                break;
		            case 7:
		                System.out.println("O mês é Julho");
		                break;
		            case 8:
		                System.out.println("O mês é Agosto");
		                break;
		            case 9:
		                System.out.println("O mês é Setembro");
		                break;
		            case 10:
		                System.out.println("O mês é Outubro");
		                break;
		            case 11:
		                System.out.println("O mês é Novembro");
		                break;
		            case 12:
		                System.out.println("O mês é Dezembro");
		                break;
		            default:
		                System.out.println("Mês inválido");
		                break;
		        }
		    
		   System.out.println(" laços de repeção while");
		   		int contador = 0;
		   		while(contador <= 10) {
		   			System.out.println(contador);
		   			contador++;
		   		}
		   System.out.println(" laços de repeção for");
			   	for(int i = 0;i <= 10;i++) {
			   			System.out.println(i);
			   		}
		        
    }
}

