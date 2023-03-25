import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Para armazenar dados do tipo string
		String x;
		
		x = sc.next();
		System.out.println("Meu nome é "+x);
		
		//Para armazenar dados do tipo inteiro
		int y;
		
		y = sc.nextInt();
		System.out.println("Você digitou "+y);
		
		//Para armazenar dados do tipo flot 
		double z;
		
		z = sc.nextDouble();
		System.out.println("Você digitou "+z);
		
		//Para armazenar um caracter
		char t;
		
			//O zero no .charAt(0) se refere a posição zero
		t = sc.next().charAt(0);
		System.out.println("O caracter é "+t);
		
	
		
		sc.close();
	}

}
