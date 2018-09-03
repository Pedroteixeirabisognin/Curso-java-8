package unidade2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception  {
		
		FileInputStream entrada = new FileInputStream("C:/Java8/2Disciplina/src/unidade2/dados.txt");
		int contador = 0;
		int caracter ;
		while((caracter = entrada.read())!= -1) {
			if(caracter == 'a') {
				contador++;	
			}
			
		}
		System.out.println("Número de vezes que aparece 'a': "+ contador);

		entrada.close();
	}

	public static void main(String[] args) {
		try {
			byteStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
