/*
 * Fazer um programa que leia um valor inteiro N
 * e depois N numeros inteiros. Ao final, mostre a soma dos dos 
 * N numeros lidos.
 */

import java.util.Scanner;

public class estruturaRepetitiva_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qunatos numeros quer soma?");
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma+=x;
		}
		
		System.out.println("O resultado é "+soma);
		
		sc.close();
	}

}
