/***************************************************
 *Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
		- todos os números pares;
		- a quantidade de números pares; 
 * 
 * @author Cassio Jordan
 ***************************************************/
import java.util.Scanner;

public class vetoresExercico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
	System.out.println("Quantos numeros quer digitar?");
	int N = sc.nextInt();
	
	int[] numeros = new int [N];
	
	System.out.println("Informe os numeros: ");	
	for(int i = 0; i < N; i++) {
		numeros[i] = sc.nextInt();
	}
	
	System.out.println("Os numeros pares são: ");
	int cont = 0;
	for(int i = 0; i < N; i++) {
		if (numeros[i] % 2 == 0) {
			System.out.print(numeros[i]+" ");
			cont++;
		}
	}
	System.out.println();
	System.out.println("A lista tem "+cont+" pares.");
	
	sc.close();
	}
}
