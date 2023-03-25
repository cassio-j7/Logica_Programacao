/********************************************************************
 * ) Fazer um programa para ler um conjunto de N nomes de alunos, bem 
 * como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas
 *  informações deve ser armazenada em um vetor. Depois, imprimir os 
 *  nomes dos alunos aprovados, considerando aprovados aqueles cuja média das
 *  notas seja maior ou igual a seis.
 *  
 * @author Cassio Jordan
 *******************************************************************/
import java.util.Locale;
import java.util.Scanner;

public class vetoresExercicios10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Locale.setDefault(Locale.US);		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Quantos alunos quer analisar?");
	int N = sc.nextInt();
	
	String[] nomes = new String[N];
	double[] primeiroSemestre = new double[N];
	double[] segundoSemestre = new double[N];
	double[] resultadoFinal = new double[N];
	
	System.out.println("Informe os nomes e as notas: ");
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o nome do aluno: ");
			nomes[i] = sc.next();
			
			System.out.println("Qual sua nota no 1º semestre: ");
			primeiroSemestre[i] = sc.nextDouble();
			
			System.out.println("Qual sua nota no 2º semestre: ");
			segundoSemestre[i] = sc.nextDouble();
			}
		
		
		for(int i = 0; i < N; i++) {
			resultadoFinal[i] = primeiroSemestre[i] + segundoSemestre[i];
		}
		
		
		System.out.println("Os alunos aprovados são: ");
			double media = 0.0;
			for (int i = 0; i < N; i++) {
				media = resultadoFinal[i] /2;
				if ( media > 6.0) {
					System.out.print(nomes[i]+ " ");
					System.out.printf("%.2f.%n",media);
					}
				
			}
		
	sc.close();
	}

}
