package unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

public class AloMundo extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Inicializando...");
	}
	public void paint(Graphics g) {
		this.setBackground(Color.GREEN);
		
		g.setColor(Color.BLUE);
		this.setSize(400,100);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão JVM:"+ System.getProperty("java.version"), 20, 20);
		g.drawString("Versão S.O.:"+ System.getProperty("os.version"), 50, 50);

	}
	
	@Override
	public void stop() {
		System.out.println("Pausando...");

	}
	

}