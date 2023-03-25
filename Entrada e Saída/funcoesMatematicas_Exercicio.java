import java.util.Scanner;
public class funcoesMatematicas_Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		/*
		 * Fazer um programa que leia as medidas de um terreno
		 * e informe qual a sua área se o valor de venda. Considere
		 * o valor de venda por m² de R$1000,00.
		 */
		
		System.out.println("Qual  comprimento de do terreno?");
		double comprimento = sc.nextDouble();
		
		System.out.println("Qual a largura do terreno?");
		double largura = sc.nextDouble();
		
		double area = comprimento * largura;
		double valorCompra = area * 1000.00;
		
		System.out.printf("A area do terreno e de %.2fm² e o preço dele é R$%.2f.%n", area, valorCompra);
		
		sc.close();
	}

}
