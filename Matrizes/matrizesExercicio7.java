/*************************************************************
 * Ler uma matriz quadrada de ordem N, contendo números reais. 
 * Em seguida, fazer as seguintes ações:
 *	a) calcular e imprimir a soma de todos os elementos 
 *		positivos da matriz.
 *	b) fazer a leitura do índice de uma linha da matriz e, daí, 
 *		imprimir todos os elementos desta linha.
 *	c) fazer a leitura do índice de uma coluna da matriz e, daí, 
 *		imprimir todos os elementos desta coluna.
 *	d) imprimir os elementos da diagonal principal da matriz.
 *	e) alterar a matriz elevando ao quadrado todos os números 
 *	   negativos da mesma. Em seguida imprimir a matriz alterada.
 * 
 * @author Cassio Jordan
 *************************************************************/
import java.util.Scanner;

public class matrizesExercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a oredem da matriz?");
		int N = sc.nextInt();
		
		int[][] numeros = new int[N][N];
		
		System.out.println("A matriz é de ordem "+N+". \n"
				+ "Insira os elementos da matriz: ");
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					numeros[i][j] = sc.nextInt();
				}
			}
		System.out.print("Soma dos elementos positivos: ");
			int soma = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (numeros[i][j] > 0) {
						soma += numeros[i][j];
					}
				}
			}
			System.out.println(soma);
		
		System.out.println("Qual linha quer imprimir na tela? ");
			int x = sc.nextInt();
			for (int j = 0; j < N; j++) {
					System.out.print(numeros[x - 1][j]+" ");	
			}
			System.out.println();
		
		
		System.out.println("Qual coluna quer imprimir?");
			int y = sc.nextInt();
			for(int i = 0; i < N; i++) {
				System.out.println(numeros[i][y - 1]);
			}
			System.out.println();
			
		
		System.out.println("A matriz alterada é: ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (numeros[i][j] < 0) {
						numeros[i][j] = (int) Math.pow(numeros[i][j], 2);
					}
					System.out.print(numeros[i][j]+" ");
				}
				System.out.println();
			}
		
	sc.close();			
	}	
}

