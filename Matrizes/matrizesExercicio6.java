/*****************************************************************
 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar os 
 * elementos e a soma dos elementos acima da diagonal principal.
 * 
 * @author Cassio Jordan
 *****************************************************************/
import java.util.Scanner;

public class matrizesExercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a ordem da matriz?");
		int N = sc.nextInt();
		
		int[][] numeros = new int[N][N];
		
		System.out.println("A matriz é de ordem "+N+"x"+N+".\n"
				+"Insira os elementos da matriz: ");
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextInt();	
				}
			}
		System.out.println("A matriz é: ");
			for (int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("Elementos acima da diagonal principal: ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i < j) {
						System.out.println(numeros[i][j]);
					}
				}
			}
		System.out.print("A soma dos elementos acima da diagonal principal é: ");
			int soma = 0;
			for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (i < j) {
							soma += numeros[i][j];
						}
					}
				}
			System.out.println(soma);
				
		sc.close();
	}
}
