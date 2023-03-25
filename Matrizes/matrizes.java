/*********************************************************
 * Fazer um programa para ler dois numeros inteiros positivos
 * M e N, depois ler uma matriz de M linhas e N colunas contendo
 * numeros inteiros. Em seguida, mostrar na tela a matriz lida.
 * 
 * @author Cassio Jordan
 *********************************************************/
import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas tem a matriz ?");
		int M = sc.nextInt();
		
		System.out.println("Quantas colunas tem a matris?");
		int N = sc.nextInt();
		
		
		int[][] numeros = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}
		System.out.println("A matriz é: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
