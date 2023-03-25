
public class funcoesMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("A raiz quadrada de "+x+" é "+A);
		System.out.println("A raiz quadrada de "+y+" é "+B);
		System.out.println("A raiz quadrada de "+z+" é "+C);
		
		System.out.println();

		A = Math.pow(x,2);
		B = Math.pow(y,3);
		C = Math.pow(z,4);
		System.out.println(x+" elevado ao quadrado é "+A);
		System.out.println(y+" elavaod ao cubo é "+B);
		System.out.println(z+" elevado a quarta potência é "+C);
		
		System.out.println();
		
		B = Math.abs(y);
		C =Math.abs(z);
		System.out.println("O valor absoluto de "+y+" é "+B);
		System.out.println("O valor absoluto de "+z+" é "+C);
		
	}

}
