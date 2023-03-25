/*******************************************************************
 * Faça um programa que leia N numeros reais e armazene-os em um 
 * vetor. Em seguida:
 * - imprimir na tela todos os elementos;
 * - informar a soma dos elementos;
 * - a media dos elementos;
 * 
 * @author Cassio Jordan
 *******************************************************************/
import java.util.Locale;
import java.util.Scanner;

public class vetoresExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros que digitar?");
		int N = sc.nextInt();
		
		double[] numeros = new double[N];
		
		System.out.println("Informe os numeros: ");
			for (int i=0; i < N; i++) {
				numeros[i] = sc.nextDouble();		
				}
			
		System.out.println("Os numeros digitados são: ");
			for (int i = 0; i < N; i++) {
				System.out.print(numeros[i]+" ");
			}
			System.out.println();
		
		double soma = 0.0;
		double media = 0.0;
		double cont = 0.0;
		for (int i = 0; i < N; i++) {
			soma += numeros[i];
			cont++;
		}
		
		media = soma / cont;
		
		System.out.println("A soma dos elementos é igual "+soma);
		System.out.println("A media dos elementos é  "+media);
		
		
		
	
	
	
	sc.close();
	}

}
