package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);
		System.out.println("Informe nota 1:\n");
		float n1 = entrada.nextFloat();
		
		System.out.println("Informe nota 2:\n");
		float n2 = entrada.nextFloat();

		System.out.println("Informe nota 3:\n");
		float n3 = entrada.nextFloat();

		System.out.println("Informe nota 4:\n");
		float n4 = entrada.nextFloat();
	
		float media = (n1+n2+n3+n4)/4;
		
		saida.format("media= %.2f", media);
		entrada.close();
		saida.close();
	}

}
