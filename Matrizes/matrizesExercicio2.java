/********************************************************
 * Fazer um programa para ler dois numeros inteiros M e N. 
 * Em seguida, ler uma matiz de M linha e N colunas contendo
 * double.Gerar um vetor de modo que cada elementos do vetor 
 * seja a soma dos elemento da linha da matriz. Mostrar o vetor
 * gerado.
 * 
 * @author Cassio Jordan
 *******************************************************/
import java.util.Scanner;
import java.util.Locale;

public class matrizesExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas linhas deve ter a matriz?");
		int M = sc.nextInt();
		
		System.out.println("Quantas colunas deve ter matriz?");
		int N = sc.nextInt();
		
		double[][] numeros = new double[M][N];
		
		System.out.println("Digite os elementos da matriz: ");
			for( int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextDouble();
				}
			}
			
		System.out.println("A ordem da matriz é de "+M+"x+"+N+". Seus /n"
				+ "elementos são: ");
			for(int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
	
		
		
		sc.close();
	}

}
