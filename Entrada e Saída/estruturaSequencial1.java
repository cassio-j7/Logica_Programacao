/* Vamos fazer um programa para ler os lados de um retângulo
 * e depois apresentar o valor da diagonal, seu perímetro e sua área.
 */

import java.util.Scanner;

public class estruturaSequencial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o valor da base do retângulo?");
		double base = sc.nextDouble();
		
		System.out.println("Qual o valor da altura do retângulo?");
		double altura = sc.nextDouble();
		
		double perimetro = 2.0 * base + 2.0 * altura;
		double diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
		double area = base * altura;
		
		System.out.printf("O perímetro vael %.2f.%n", perimetro);
		System.out.printf("A diagonal vale %.2f.%n", diagonal);
		System.out.printf("A area vale %.2f.%n", area);
		
		
		sc.close();
	}

}
