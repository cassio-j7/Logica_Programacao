/****************************************************************
 * Ler um número N e depois uma matriz quadrada NxN com números 
 * inteiros. Depois, mostrar na tela a soma dos elementos de cada 
 * linha da matriz.
 * 
 * @author Cassio Jordan
 ****************************************************************/
import java.util.Scanner;

public class matrizesExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a ordem da matriz?");
		int N = sc.nextInt();
		
		int[][] numeros = new int[N][N];
		
		System.out.println("Digite os elementos da matriz: ");
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextInt();
				}
			}
			
		System.out.println("A matriz é de ordem "+N+"x"+N+".");
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
			
		System.out.println("A soma dos elementos por linha é: ");
			for( int i = 0; i < N; i++) {
				int soma = 0;
				for (int j = 0; j < N; j++) {
					soma += numeros[i][j];
				}
				System.out.println(soma);
			}
	
			
	sc.close();
	}

}
