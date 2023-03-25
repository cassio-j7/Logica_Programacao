/*****************************************************************
 * Fazer um programa para ler um vetor de N números reais. Em seguida,
 *  mostrar na tela a média aritmética de todos elementos. Depois mostrar
 *  todos os elementos do vetor que estejam abaixo da média.
 *  
 * @author Cassio Jordan
 ****************************************************************/
import java.util.Scanner;

public class vetorExercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Quantos numeros deseja somar?");
	int N = sc.nextInt();
	
	double[] numeros = new double[N];
	
	System.out.println("Informe os numeros: ");	
		for(int i = 0; i < N; i++){
			numeros[i] = sc.nextDouble();		
			}
		
	System.out.println("A media aritimética dos elementos é: ");
		double soma = 0.0;
		double media = 0.0;
	 	for(int i = 0; i < N; i++) {
	 		soma += numeros[i];
	 	}
	 	media = soma / N;
	 	
	 	System.out.printf("%.2f.%n",media);
	 	
	 System.out.println("Os elementos abaixo da média são: ");
	 	for(int i = 0; i < N; i++) {
	 		if (numeros[i] < media) {
	 			System.out.print(numeros[i]+" ");
	 		}
	 	}
	
	sc.close();
	}

}
