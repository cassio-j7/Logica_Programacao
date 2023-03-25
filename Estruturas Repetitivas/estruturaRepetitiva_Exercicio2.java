/*
 * Faça um programa para ler um numero indertermiado de dados,
 * contento a idade de um indivíduo. Oultimo dado que não entrará
 * nos calculos contém um valor negativo. Calcular e imprimir a média
 * de idades destes indivíduos. O primeiro valor for um numero negativo,
 * exibir a mensagem "Impossível Calcular".
 */

import java.util.Scanner;

public class estruturaRepetitiva_Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int idade = 0;
		int soma = 0;
		int cont = 0;
		
		System.out.println("Informe a idade: ");
		idade = sc.nextInt();
		
		while (idade > 0) {
			soma += idade;
			cont++;
			System.out.println("Informe a idade: ");
			idade = sc.nextInt();
		}
		
		if ( cont > 0) {
			double media = (double) soma / cont;
			System.out.println("A media das idades é "+media+".");
		}
		else {
			System.out.println("IMpossível Calcular!");
		}

		sc.close();

	}

}
