/******************************************************
 *Ler dois números M e N, e depois ler uma matriz MxN 
 *de números inteiros, conforme exemplo. Em seguida, 
 *mostrarna tela somente os números negativos da matriz.
 * 
 * @author Cassio Jordan
 ******************************************************/
import java.util.Scanner;

public class matrizesExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas e colunas deve ter"
				+ "a matriz?");
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] numeros = new int[M][N];
		
		System.out.println("Escreva os elementos da matriz: ");
			for( int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextInt();
				}
			}
			
		System.out.println(" Amatriz informadá é: ");
			for (int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
			
		System.out.println("Os valores negativos são: ");
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if (numeros[i][j] < 0) {
					System.out.println(numeros[i][j]);
				}
			}
		}
			
		
		
		sc.close();
	}

}
