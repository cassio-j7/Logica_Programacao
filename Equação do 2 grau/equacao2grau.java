import java.util.Scanner;

public class equacao2grau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos calcular as raízes de uma equação do segundo grau\n"
				+ "definas no conjunto dos reais |R.");
		System.out.println("Toda a equação do 2º grau é dada pela lei de formação\n"
				+ "ax² + bx + c, onde a é fiferente de 0.");
		
		System.out.println("Vamos definir os valores dos coeficientes e do termo\n"
				+ "independente.");
		System.out.println("Informe o valor de a: ");
		double a = sc.nextDouble();
			while (a == 0) {
				System.out.println("Pela definição, o coeficiente a deve ser diferente de 0.\n"
						+ "Escolha outro valor para a.");
					a = sc.nextDouble();
				}
		
		System.out.println("Informe o valor de b: ");
		double b = sc.nextDouble();
		
		System.out.println("Informe o valor de c: ");
		double c = sc.nextDouble();
		
		System.out.println("Sua equação é: "+a+"x² + "+b+"x + "+c+" = 0");
		
		double delta;
		
		delta = Math.pow(b, 2) + 4 * a * c;
		System.out.printf("Seu delta vale  %.2f%n", delta);
		
		double x1, x2;
		
		x1 = -b + Math.sqrt(delta) / (2*a);
		x2 = -b - Math.sqrt(delta) / (2*a);
		System.out.printf("Sua raízes são x1 = %.2f e x2 = %.2f.%n", x1, x2);
		
		sc.close();
				
		
	}

}
