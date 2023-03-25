/***********************************************************
 * Fazer um programa para ler um conjunto de nomes de pessoas 
 * e suas respectivas idades. Depois, mostrar na tela o nome 
 * da pessoa mais velha.
 * 
 * @author Cassio Jordan
 ***********************************************************/
import java.util.Scanner;

public class vetoresExercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas gostarai de analizar?");
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
			for (int i = 0; i < N; i++) {
				System.out.println("Digite o nome: ");
				nomes[i] = sc.next();
				
				System.out.println("Digite a idade: ");
				idades[i] = sc.nextInt();			
			}
		
		System.out.println("A pessoa mais velha é: ");
			int maior = 0;
			String velho = " ";
			for (int i = 0; i < N; i++) {
				if(idades[i] > maior) {
					maior = idades[i];
					velho = nomes[i];
				   }
			}
			System.out.println(velho);
	
	sc.close();
	}

}
