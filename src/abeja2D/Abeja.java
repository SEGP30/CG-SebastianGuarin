package abeja2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Abeja extends JPanel
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) 
    {
    	//-----PROPIEDADES ESTÁNDARES DEL PINCEL-----
    	Graphics2D G2d = (Graphics2D)g;
        BasicStroke Grosor = new BasicStroke(5);
        G2d.setStroke(Grosor);
    	
        //-----COLOREADO DE FONDO Y CONTORNO CON CURVAS-----
        
        //ALAS
        //	Ala derecha
       G2d.setColor(Color.cyan);
       Arc2D alaDLadoDerecho = new Arc2D.Double(111, 100, 120, 230, 0, 122, Arc2D.CHORD);
       Arc2D alaDLadoIzquierdo = new Arc2D.Double(131, 70, 200, 150, 160, 110, Arc2D.CHORD);
       G2d.draw(alaDLadoDerecho);
       G2d.draw(alaDLadoIzquierdo);
       G2d.fill(alaDLadoDerecho);
       G2d.fill(alaDLadoIzquierdo);
       G2d.setColor(Color.BLACK);
       //		Contorno
       Arc2D contornoAlaDLadoDerecho = new Arc2D.Double(111, 100, 120, 190, 0, 122, Arc2D.OPEN);
       Arc2D contornoAlaDLadoIzquierdo = new Arc2D.Double(131, 70, 165, 150, 158, 110, Arc2D.OPEN);
       G2d.draw(contornoAlaDLadoDerecho );
       G2d.draw(contornoAlaDLadoIzquierdo );
       
       //		Ala izquierda
       G2d.setColor(Color.CYAN);
       Arc2D alaILadoDerecho = new Arc2D.Double(235, 90, 90, 200, 45, 140, Arc2D.CHORD);
       Arc2D alaILadoIzquierdo = new Arc2D.Double(157, 70, 160, 145, 255, 120, Arc2D.CHORD);
       G2d.draw(alaILadoDerecho);
       G2d.draw(alaILadoIzquierdo);
       G2d.fill(alaILadoDerecho);
       G2d.fill(alaILadoIzquierdo);
       G2d.setColor(Color.BLACK);
       //	Contorno
       Arc2D contornoAlaILadoDerecho = new Arc2D.Double(235, 90, 90, 200, 45, 140, Arc2D.OPEN);
       Arc2D contronoAlaILadoIzquierdo = new Arc2D.Double(157, 69, 160, 145, 255, 120, Arc2D.OPEN);
       G2d.draw(contornoAlaILadoDerecho);
       G2d.draw(contronoAlaILadoIzquierdo);
       
       //CUERPO
       //		Fondo amarillo de las franjas
       G2d.setColor(Color.YELLOW);
       Arc2D fondoAmarillo = new Arc2D.Double(100, 200, 300, 200, 90, 290, Arc2D.CHORD);
       G2d.draw(fondoAmarillo);
       G2d.fill(fondoAmarillo);
       //		Franja negra trasera
       G2d.setColor(Color.BLACK);
       Arc2D franjaTrasera = new Arc2D.Double(100, 200, 300, 200, 120, 120, Arc2D.CHORD);
       G2d.draw(franjaTrasera);
       G2d.fill(franjaTrasera);
       //		Franja amarilla media
       G2d.setColor(Color.YELLOW);
       Arc2D franjaAmarillaM = new Arc2D.Double(150, 214, 80, 172, 90, 360, Arc2D.CHORD);
       G2d.draw(franjaAmarillaM);
       G2d.fill(franjaAmarillaM);
       //		Franja negra media
       G2d.setColor(Color.BLACK);
       Arc2D franjaNegraM1 = new Arc2D.Double(193, 202, 105, 200, 90, 180, Arc2D.CHORD);
       Arc2D franjaNegraM2 = new Arc2D.Double(205, 202, 116, 200, 90, 180, Arc2D.CHORD);
       G2d.draw(franjaNegraM1);
       G2d.draw(franjaNegraM2);
       G2d.fill(franjaNegraM1);
       G2d.fill(franjaNegraM2);
       //		Detalle amarillo  del rostro
       G2d.setColor(Color.YELLOW);
       Arc2D detalleRostro = new Arc2D.Double(235, 203, 78, 190, 90, 180, Arc2D.CHORD);
       G2d.draw(detalleRostro);
       G2d.fill(detalleRostro);
       //		Sonrisa
       G2d.setColor(Color.BLACK);
       Arc2D sonrisa = new Arc2D.Double(300, 280, 57, 70, 220, 93, Arc2D.OPEN);
       G2d.draw(sonrisa);
       //		Contorno
        G2d.setColor(Color.BLACK);
       Arc2D contronoCuerpo = new Arc2D.Double(100, 200, 300, 200, 90, 290, Arc2D.OPEN);
       G2d.draw(contronoCuerpo);
       
       //OJOS
       //		Ojo izquierdo
       G2d.setColor(Color.WHITE);
       Arc2D ojoIzquierdo = new Arc2D.Double(330, 180, 115, 130, 230, 257, Arc2D.CHORD);
       G2d.draw(ojoIzquierdo);
       G2d.fill(ojoIzquierdo);
       //		Pupila
       G2d.setColor(Color.BLACK);
       Ellipse2D pupilaIzquierda = new Ellipse2D.Double(365, 217, 41, 43);
       G2d.draw(pupilaIzquierda);
       G2d.fill(pupilaIzquierda);
       //		Contorno
       G2d.setColor(Color.BLACK);
       Arc2D contornoOjoIzquierdo = new Arc2D.Double(330, 180, 115, 130, 230, 257, Arc2D.OPEN);
       G2d.draw(contornoOjoIzquierdo);
       
       //		Ojo derecho
       G2d.setColor(Color.WHITE);
       Ellipse2D ojoDerecho = new Ellipse2D.Double(238, 170, 130, 145);
       G2d.draw(ojoDerecho);
       G2d.fill(ojoDerecho);
       //		Pupila
       G2d.setColor(Color.BLACK);
       Ellipse2D pupilaDerecha = new Ellipse2D.Double(285, 215, 47, 47);
       G2d.draw(pupilaDerecha);
       G2d.fill(pupilaDerecha);
       //		Contorno
       G2d.setColor(Color.BLACK);
       Ellipse2D contornoOjoDerecho = new Ellipse2D.Double(238, 170, 130, 145);
       G2d.draw(contornoOjoDerecho);
       
       //LAPIZ
       //Cuerpo del lápiz
       G2d.setColor(Color.ORANGE);
       G2d.fillRect(148, 401, 220, 88);
       //		Borrador
       G2d.setColor(Color.PINK);
       Arc2D colorBorrador = new Arc2D.Double(100, 403, 100, 84, 90, 180, Arc2D.CHORD);
       G2d.draw(colorBorrador);
       G2d.fill(colorBorrador);
       //		Detalle del borrador
       G2d.setColor(Color.GRAY);
       Arc2D detalleBorrador = new Arc2D.Double(140, 403, 50, 84, 90, 180, Arc2D.CHORD);
       G2d.draw(detalleBorrador);
       G2d.fill(detalleBorrador);
       //		Contorno del lapiz y el detalle
       G2d.setColor(Color.BLACK);
       G2d.drawRoundRect(100, 400, 280, 90, 80, 80);
       G2d.draw(detalleBorrador);
       //		Punta del lapiz
       int [] puntaX = {430, 360, 355, 360};
       int [] puntaY = {440, 400, 440, 488};
       G2d.setColor(new Color(245, 230, 168));
       G2d.fillPolygon(puntaX, puntaY, 4);
       //		Mina del lapíz
       int [] minaX = {430, 400, 410, 400};
       int [] minaY = {440, 424, 440, 460};
       G2d.setColor(Color.GRAY);
       G2d.fillPolygon(minaX, minaY, 4);
       //		Contorno de la punta
       G2d.setColor(Color.BLACK);
       G2d.drawPolygon(puntaX, puntaY, 4);
       G2d.drawPolygon(minaX, minaY, 4);
       
       //LETRAS
       //		Letra D
       Arc2D letraD = new Arc2D.Double(160, 415, 50, 60, 270, 180, Arc2D.CHORD);
       G2d.draw(letraD);
       //		Letra a
       Ellipse2D circuloA = new Ellipse2D.Double(220, 439, 27, 27);
       G2d.draw(circuloA);
       G2d.drawLine(249, 438, 249, 466);
       //		Letra v
       G2d.drawLine(260, 438, 270, 466);
       G2d.drawLine(272, 466, 282, 438);
       //		Letra i
       G2d.drawLine(297, 438, 297, 466);
       Ellipse2D puntoI = new Ellipse2D.Double(292, 421, 10, 10);
       G2d.draw(puntoI);
       G2d.fill(puntoI);
       //		Letra d
       Ellipse2D circuloD = new Ellipse2D.Double(308, 440, 27, 27);
       G2d.draw(circuloD);
       G2d.drawLine(335, 418, 335, 467);
       
    }
}
