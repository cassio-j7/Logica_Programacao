import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Locale.setDefault(Locale.US);
		//Utiliza o separador decimal (.)
		
		System.out.print("Olá Mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.569874556;
		System.out.println(x);
		System.out.printf("%.2f\n", x); // a tag \n (ou %n) serve para quebrar a linha
		System.out.printf("%.4f%n", x);
		
		//Para concatenar elementos basta utilizar o operador "+"
		System.out.println("O resultado é "+x+" metros.");
		
		System.out.printf("Resultado = %.3f metros%n", x);
		
		//Para concatenar varios tipos de elmentos usamos marcadores
		/*
		 *  %f = ponto flutuante
		 *	%n = quebra de linha
		 *  %d = numero inteiro
		 *  %s = texto
		 */
		
		String nome = "Maria";
		int idade = 31;
		double salario = 3.500;
		
		System.out.printf("O nome é %s tem %d anos de idade e ganha R$%.3f reais.%n", nome, idade, salario);
		
		
	}

}
;