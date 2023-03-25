/*
 * Ler um quantidade inderteminada de deplas de valores inteiros
 * X e Y, e escrever se estão na ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class estruturaRepetitiva_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor de x: ");
		int x = sc.nextInt();
		
		System.out.println("Informe o valor de y: ");
	    int y = sc.nextInt();
	    
	    while ( x != y ) {
	    	if ( x < y ) {
	    		System.out.println("Crescente!");
	    	}
	    	else {
	    		System.out.println("Decrescente!");
	    	}
	    
	    	System.out.println("Informe o valor de x: ");
			x = sc.nextInt();
			
			System.out.println("Informe o valor de y: ");
		    y = sc.nextInt();
	    }
	    
		
		System.out.println("X igual a Y. Fim do programa!");
		sc.close();
	}

}
