package abeja2D;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class VentanaAbeja extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Abeja panel;
	
	public VentanaAbeja() 
	{
		setTitle("Dibujo 2D: Abeja");
		setSize(550, 550);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		
		panel = new Abeja();
		
		add(panel);
		
	}
	
	public static void main (String [] args) {
		VentanaAbeja ventana = new VentanaAbeja();
		ventana.setVisible(true);
	}
}
