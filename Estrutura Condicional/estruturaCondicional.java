/*Um programa para ler um horário do dia e fazer uma saudação
 * com base no horário.
 */

import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Que horas são?");
		int hora = sc.nextInt();
		
		if (hora >= 5 && hora <= 11) {		
			System.out.println("Bom dia!");
		}
		
		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		
		else {
		System.out.println("Boa noite!");
		}
		sc.close();
		
	}

}
