package Aula2;

import java.util.Scanner;

public class exemplo3 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva uma letra entre a e d: ");
	String letra = leia.next();
	
	leia.close();
	
	switch(letra) {
	case "a":
		System.out.println("Ana");
	break;
	case "b":
		System.out.println("Bia");
	break;
	case "c":
		System.out.println("Camila");
	break;
	case "d":
		System.out.println("Dany");
	break;
	
	}
	
	}

}
