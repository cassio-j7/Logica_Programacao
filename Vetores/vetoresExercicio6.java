/*******************************************************************
 * Faça um programa para ler dois vetores A e B, contendo N elementos 
 * cada. Em seguida, gere um terceiro vetor C onde cada elemento de C 
 * é a soma dos elementos correspondentes de A e B. Imprima o vetor C 
 * gerado.
 * 
 * 
 * @author Cassio Jordan
 ******************************************************************/
import java.util.Scanner;

public class vetoresExercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Quantos numeros que somar?");
	int N = sc.nextInt();
	
	double[] vetA = new double[N];
	double[] vetB = new double[N];
	double[] vetorSoma = new double[N];
	
	System.out.print("Informe os numeros que deseja somar: ");
	for (int i = 0; i < N; i++) {
		vetA[i] = sc.nextDouble();
		vetB[i] = sc.nextDouble();		
		}
	
	/*Calculo de soma dos elementos*/
	for(int i = 0; i < N; i++) {
			vetorSoma[i] = vetA[i] + vetB[i];
		}
	System.out.println("O resultado da soma é: ");
	for(int i = 0; i < N; i++) {
		System.out.print(vetorSoma[i]+" ");
		}
	
	sc.close();
	}
}