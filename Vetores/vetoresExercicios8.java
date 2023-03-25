/**************************************************************
 * Fazer um programa para ler um vetor de N números inteiros. Em 
 * seguida, mostrar na tela a média aritmética somente dos números 
 * pares lidos. 
 * 
 * @author Cassio Jordan
 **************************************************************/
import java.util.Scanner;

public class vetoresExercicios8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos numeros deseja informar?");
	int N = sc.nextInt();
	
	int[] numeros = new int[N];
	
		System.out.println("Informe o numero: ");
			for(int i = 0; i < N; i++) {
				numeros[i] = sc.nextInt();
			}
		System.out.println("A média dos pares é: ");
			double soma = 0.0;
			for(int i = 0; i < N; i++) {
				if (numeros[i] % 2 == 0) {
					soma += numeros[i];
				}
			}
		double media = soma / (double) N;
		System.out.printf("%.2f.%n",media);
		
	
	sc.close();
	}

}
