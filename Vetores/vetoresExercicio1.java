/**************************************************************
 * Faça um vetor que leia N numeros inteiros e depois impirma 
 * na tela somente os numeros negativos. 
 * 
 *@author Cassio Jordan
 *************************************************************/
import java.util.Scanner;

public class vetoresExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos numeros quer digitar?");
	int N = sc.nextInt();
	
	int[] numeros = new int[N];
	
	System.out.println("Digite os numeros:");
	
	for (int i=0; i < N; i++) {
		numeros[i] = sc.nextInt();
		}
	
	System.out.println("Os numeros menores que zero são: ");
	
	for (int i=0; i < N; i++) {
		if (numeros[i] < 0) {
			System.out.println(numeros[i]);
		}
	}
	
	sc.close();
	
	}

}
