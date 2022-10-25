package oso2D;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class VentanaOso extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Oso panel;
	
	public VentanaOso() 
	{
		setTitle("Dibujo 2D: Oso");
		setSize(450, 370);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		
		panel = new Oso();
		
		add(panel);
		
	}
	
	public static void main (String [] args) {
		VentanaOso ventana = new VentanaOso();
		ventana.setVisible(true);
	}
}
