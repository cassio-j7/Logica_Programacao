/*********************************************************
 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar 
 * qual o maior elemento de cada linha. Suponha não haverempates.
 * 
 * @author Cassio Jordan
 ********************************************************/
import java.util.Scanner;

public class matrizesExercicio5 {

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
		System.out.println("Os maiores elementos por linha são: ");
			for (int i = 0; i < N; i++) {
				int maior = 0;
				for (int j = 0; j < N; j++) {
					if (numeros[i][j] > maior ) {
						maior += numeros[i][j];
					}
				}
				System.out.println("Linha "+i+": "+maior);
			}
				
				
		sc.close();
	}

}
