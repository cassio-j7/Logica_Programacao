/*******************************************************
 * Fazer um programa que leia as notas de um aluno
 * durante o ano e ao final informe se ele está aprovado
 * ou reprovado.
 ******************************************************/
import java.util.Locale;
import java.util.Scanner;


public class estruturaCondicional_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Para saber se está aprovado informe \n"
				+ "como está dividido seu ano letivo: \n"
				+ "1 - Bimestre; \n"
				+ "2 - Trimestre; \n"
				+ "3 - Semestre;");
		int modo = sc.nextInt();
		
		double pontos = 0.0;
		double nota = 0.0;
		double media;
		
		
		if (modo == 1) {
				System.out.println("Sua modalidade é notas bimestrais.");
				System.out.println("Informe a primeira nota: ");
				nota = sc.nextDouble();
				pontos += nota;
				
				System.out.println("Informe a segunda nota: ");
				nota = sc.nextDouble();
				pontos += nota;
				
				System.out.println("Informe a terceira nota: ");
				nota = sc.nextDouble();
				pontos += nota;
				
				System.out.println("Informe a quarta nota: ");
				nota = sc.nextDouble();
				pontos += nota;
				
				media = pontos / 4.0;
				
				System.out.printf("Sua média é "+ media+" pontos.");
		     }
		
		 if ( modo == 2) {
			 	System.out.println("Sua modalidade é notas trimestrais.");
			 	System.out.println("Informe a primeira nota: ");
			 	nota = sc.nextDouble();
			 	pontos += nota;
				
			 	System.out.println("Informe a segunda nota: ");
			 	nota = sc.nextDouble();
			 	pontos += nota;
				
			 	System.out.println("Informe a terceira nota: ");
			 	nota = sc.nextDouble();
			 	pontos += nota;
				
			 	media = pontos / 3.0;
				
			 	System.out.printf("Sua média é "+ media+" pontos.");
		     }
		 
		 if (modo == 3) {
				 System.out.println("Sua modalidade é notas semestrais.");
				 System.out.println("Informe a primeira nota: ");
				 nota = sc.nextDouble();
				 pontos += nota;
					
				 System.out.println("Informe a segunda nota: ");
				 nota = sc.nextDouble();
				 pontos += nota;
				 
				 media = pontos / 2.0;
					
				 	System.out.printf("Sua média é "+ media+" pontos.");
		     }
				
		sc.close();		
	}

}
