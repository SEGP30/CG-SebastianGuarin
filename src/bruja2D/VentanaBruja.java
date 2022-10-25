package bruja2D;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class VentanaBruja extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Bruja panel;
	
	public VentanaBruja() 
	{
		setTitle("Dibujo 2D: Bruja");
		setSize(550, 550);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		
		panel = new Bruja();
		
		add(panel);
		
	}
	
	public static void main (String [] args) {
		VentanaBruja ventana = new VentanaBruja();
		ventana.setVisible(true);
	}
}
