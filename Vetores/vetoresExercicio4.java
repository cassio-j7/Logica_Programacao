/****************************************************************
 * Faça um programa que leia N números reais e armazene-os em um vetor.
 *  Em seguida, mostrar na tela o maior número do vetor (supor não haver 
 *  empates). Mostrar também a posição do maior elemento.
 * 
 * @author Cassio Jordan
 ****************************************************************/
import java.util.Scanner;
import java.util.Locale;

public class vetoresExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos numeros quer digitar?");
	int N = sc.nextInt();
	
	double[] numeros = new double[N];
	
	System.out.println("Digite os numeros: ");
	
	for (int i = 0; i < N; i++) {
		numeros[i] = sc.nextDouble();
	}
	
	double maior = 0.0;
	int posicao = 0;
	for(int i = 0; i < N; i++) {
		if (numeros[i] > maior){
			maior = numeros[i];
			posicao = i;
		}
	}
	System.out.println("O maior numero informado é: "+maior);
	System.out.println("Sua posição é: "+posicao);
		
	sc.close();
	}

}
