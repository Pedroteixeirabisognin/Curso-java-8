package socket.client;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//Conecta a um endpoint para a conexão entre 2 computadores ou mais EX: O pc1 terá que connectar pelo ip 127.0.0.1 esse será a url ou endpoint
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");

		//Instanciação de uma entrada do tipo que recebe parametros vindos do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Recebe um fluxo de dados via socket do cliente
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		while (teclado.hasNextLine()) {
			//imprime a entrada de teclado enviada em outro computador que criou o servidor via socket
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
		cliente.close();
	}

}

