package socket.server;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");
        // a continuação do servidor deve ser escrita aqui
        
        
        Runnable thread = ()-> {
        	Socket cliente = null;
        	
			try {
				cliente = servidor.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Nova conexão com o cliente " + 
                cliente.getInetAddress().getHostAddress()
            ); // imprime o ip do cliente
            Scanner scanner = null;
			try {
				scanner = new Scanner(cliente.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            try {
				cliente.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				servidor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		new Thread(thread).start();

    }
   
 
}