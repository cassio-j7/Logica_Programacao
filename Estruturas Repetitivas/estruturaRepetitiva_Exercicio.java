import java.util.Scanner;

public class estruturaRepetitiva_Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quer saber a tabuada de qual numero?");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int produto = i * numero;
			System.out.println("O produto "+i+"x"+numero+" é igual a "+produto+".");
		}
		
		sc.close();
	}

}
