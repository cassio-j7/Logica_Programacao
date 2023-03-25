import java.util.Scanner;

public class estruturaRepetitiva_Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int y = sc.nextInt();
		
		int min, max;
		
		if (x > y) {
			max = x;
			min = y;
		}
		else {
			min = x;
			max = y;
		}
		
		int soma = 0;
		
		for (int i = min + 1; i < max; i++ ) {
			if ( i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma é "+soma);
	
	sc.close();	
	}

}
