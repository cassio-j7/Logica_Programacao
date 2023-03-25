/**********************************************************************
 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N 
 * pessoas. Fazer um programa que calcule e escreva:
 *	 a maior e a menor altura do grupo;
 *	 a média de altura das mulheres;
 *	 o número de homens;
 *
 * @author Cassio Jordan
 *********************************************************************/
import java.util.Scanner;
import java.util.Locale;

public class vetoresExercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas quer analaisar?");
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		double[] alturas = new double[N];
		char[] sexo = new char[N];
		
			for (int i = 0; i < N; i++) {
				System.out.println("Digite um nome: ");
				nomes[i] = sc.next();
				
				System.out.println("Qual a altura de "+nomes[i]+"?");
				alturas[i] = sc.nextDouble();
				
				System.out.println("Qual sexo de "+nomes[i]+"?(Usar M ou F)");
				sexo[i] = sc.next().charAt(0);
			}
		
			double maior = 0.0;
			double menor = 0.0;
			for (int i = 0; i < N; i++) {
				if(alturas[i] > maior) {
					maior = alturas[i];
				}
				else if(alturas[i] < maior) {
					menor = alturas[i];
				}
			}
			
		System.out.println("A média de altura entre as mulheres é: ");
			double alturaMulheres = 0.0;
			double cont = 0.0;
			for (int i = 0; i < N; i++) {
				if (sexo[i] == 'F') {
					alturaMulheres += alturas[i];
					cont++;
				}
			}
			double media = alturaMulheres / cont;
			System.out.printf("%.2f%n", media);
			
		System.out.println("A quantidade de homens é de: ");
			double contHomens = 0.0;
			for(int i = 0; i < N; i++) {
				if (sexo[i] == 'M') {
					contHomens++;
				}
			}
			System.out.println(contHomens);
		
		
		sc.close();
	}

}
