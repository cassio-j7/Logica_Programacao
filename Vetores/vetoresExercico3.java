/*********************************************************
 * Fazer um programa que leia um numero N de: nomes ( apenas uma 
 * palavra sem espaço), idade e altura. Depois, mostrar na tela
 * a media das alturas e a porcentagem de pessoas menores de idade. 
 * 
 * @author Cassio Jordan
 *********************************************************/

import java.util.Scanner;
import java.util.Locale;

public class vetoresExercico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas que registrar: ");
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int [N];
		double[] alturas = new double[N];
		
		for (int i =0; i < N; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = sc.next();
			
			System.out.println("Qual a idade? ");
			idades[i] = sc.nextInt();
			
			System.out.println("Qual a altura?");
			alturas[i] = sc.nextDouble();	
		}
		
		double somaAlturas = 0.0;
		for (int i = 0; i < N; i++) {
			somaAlturas += alturas[i];
		}
		double mediaAlturas = somaAlturas / (double) N;
		System.out.printf("A media das alturas é %.2f.%n",mediaAlturas);
		
		double cont = 0.0;
		for (int i = 0; i < N; i++) {
			if(idades[i] < 18) {
				cont++;
			}
		}
		double taxaMenores = (cont / N) * 100.00;
		System.out.println("A taxa de menores é de "+taxaMenores+"%.");
		
	sc.close();
	}

}
