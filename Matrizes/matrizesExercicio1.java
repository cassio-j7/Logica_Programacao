/********************************************************
 * Fazer um programa para ler um numero inteiro Ne uma matriz
 * quadrada de ordem N contendo numeros inteiros. Em seguida,
 * mostrar a diagonal principal e a quantidade de valores 
 * negativos.
 * 
 * @author Cassio Jordan
 ********************************************************/
import java.util.Scanner;

public class matrizesExercicios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual ordem a matriz deve ter?");
		int N = sc.nextInt();
		
		int[][] numeros = new int[N][N];
		
		System.out.println("Digite os elementos da matriz: ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextInt();
				}
			}
		System.out.println("A matriz é de ordem "+N+"x"+N+".");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("A diagonal principal é ");
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if ( i == j) {
						System.out.print(numeros[i][j]+" ");
					}
				}
			}
			System.out.println();
			
		System.out.println("Os elementos negatvos da matriz são: ");
			int cont = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if ( numeros[i][j] < 0) {
						System.out.print(numeros[i][j]+" ");
						cont++;
					}
				}
				System.out.println("A matriz possui "+cont+" elementos negativos.");
			}
		
		
		
	sc.close();	
	}

}
