/*
 * Fazer um prohrama para ler um numero inteiro positivo N,
 * depois ler N numeros quaisquer e armazená-los num vetor.
 * Em seguida, mostrar na tela todos os elementos do vetor.
 */
import java.util.Scanner;
import java.util.Locale;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros quer armazenar?");
		int N = sc.nextInt();
		double numeros[] = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um nuemro: ");
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}

}
