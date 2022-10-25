package bruja2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Bruja extends JPanel
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) 
    {
    	//-----PROPIEDADES ESTÁNDARES DEL PINCEL-----
    	Graphics2D G2d = (Graphics2D)g;
        BasicStroke Grosor = new BasicStroke(3);
        G2d.setStroke(Grosor);
    	
    	//-----COLOREADO DE FONDO CON LÍNEAS Y POLÍGONOS-----
        
      //Palo de escoba
        G2d.setColor(new Color(185, 135, 80));
        G2d.fillRect(110, 400, 220, 10);
        
        //Piel de la bruja
        int [] rostroX = {190, 160, 160,  180, 260, 280, 280, 250};
        int [] rostroY = {320, 290, 270, 210, 210, 270, 290, 320};
        int [] manoIzquierdaX = {310, 310, 320, 320, 330, 340, 320};
        int [] manoIzquierdaY = {310, 290, 290, 300, 290, 310, 320};
        int [] manoDerechaX = {120, 120, 130, 140, 140};
        int [] manoDerechaY = {400, 390, 380, 390, 400};
        int [] piernaIzquierdaX = {230, 250, 270, 270, 260, 250};
        int [] piernaIzquierdaY = {410, 440, 440, 430, 430, 410};
        int [] piernaDerechaX = {190, 210, 220, 230, 230, 210};
        int [] piernaDerechaY = {410, 410, 440, 440, 450, 450};
        G2d.setColor(new Color(130, 210, 80));
        G2d.fillPolygon(rostroX, rostroY, 8);
        G2d.fillPolygon(manoIzquierdaX, manoIzquierdaY, 7);
        G2d.fillPolygon(manoDerechaX, manoDerechaY, 5);
        G2d.fillPolygon(piernaIzquierdaX, piernaIzquierdaY, 6);
        G2d.fillPolygon(piernaDerechaX, piernaDerechaY, 6);
        
        //Vestido y sombrero de la bruja
        int[] vestidoX = {160, 160, 179, 140, 130, 190, 250, 310, 320, 260, 280, 280};
        int[] vestidoY = {410, 400, 350, 390, 380, 320, 320, 310, 320, 350, 400, 410};
        int[] sombreroX = {160, 220, 260, 240, 280};
        int[] sombreroY = {200, 90, 120, 120, 200};
        G2d.setColor(new Color(150, 70, 190));
        G2d.fillPolygon(vestidoX, vestidoY, 12);
        G2d.fillPolygon(sombreroX, sombreroY, 5);
        G2d.fillRect(100, 200, 220, 10);
         
        //Fibras de la escoba
        int[] escobaX = {330, 330, 340, 430, 430, 340};
        int[] escobaY = {410, 400, 370, 370, 440, 440};
        G2d.setColor(new Color(240, 205, 50));
        G2d.fillPolygon(escobaX, escobaY, 6);
        
        //Ojos de la bruja
        Rectangle2D  ojoIzquierdo = new Rectangle2D.Double(230, 220, 30, 30);
        Rectangle2D  ojoDerecho = new Rectangle2D.Double(180, 220, 30, 30); 
        G2d.setColor(Color.white);
        G2d.draw(ojoIzquierdo);
        G2d.draw(ojoDerecho);
        G2d.fill(ojoIzquierdo);
        G2d.fill(ojoDerecho);
        
        //Luna de fondo y detalles (hebilla del sombrero y medias)
        int[] lunaX = {350, 370, 380, 380, 370, 350, 380, 400, 410, 410, 400, 380};
        int[] lunaY = {180, 170, 150, 110, 100, 90, 90, 100, 120, 150, 170, 180};
        Rectangle2D  hebilla = new Rectangle2D.Double(200, 150, 40, 40); 
        Rectangle2D  mediaIzquierda = new Rectangle2D.Double(270, 430, 10, 10); 
        Rectangle2D  mediaDerecha = new Rectangle2D.Double(230, 440, 10, 10); 
        G2d.setColor(Color.YELLOW);
        G2d.fillPolygon(lunaX, lunaY, 12);
        G2d.draw(hebilla);
        G2d.draw(mediaIzquierda);
        G2d.draw(mediaDerecha);
        G2d.fill(hebilla);
        G2d.fill(mediaIzquierda);
        G2d.fill(mediaDerecha);
        
      //-----CREACIÓN DE LÍNEAS Y POLÍGONOS PARA LOS CONTORNOS Y DETALLES-----
        
        //Polígonos de la correa del sombrero (dividida en lados izquierdo y derecho, interno), botas, cabello y pupilas
        int[] ladoIzquierdoX = {240, 240, 260, 270};
        int[] ladoIzquierdoY = {180, 160, 160, 180};
        int[] ladoDerechoX = {170, 180, 200, 200};
        int[] ladoDerechoY = {180, 160, 160, 180};
        int[] botaIzquierdaX = {280, 280, 300, 300, 290};
        int[] botaIzquierdaY = {440, 430, 430, 460, 440};
        int [] botaDerechaX = {240, 240, 260, 260, 250};
        int [] botaDerechaY = {450, 440, 440, 470, 450};
        int [] cabelloIzquierdoX = {280, 340, 330, 298, 320, 310, 288, 300, 290, 260};
        int [] cabelloIzquierdoY = {210, 260, 270, 238, 270, 280, 250, 290, 300, 210};
        int [] cabelloDerechoX = {160, 100, 110, 140, 120, 130, 150, 140, 150, 180};
        int [] cabelloDerechoY = {210, 260, 270, 236, 270, 280, 250, 290, 300, 210};
        Rectangle2D  correaInterna = new Rectangle2D.Double(210, 160, 20, 20);
        Rectangle2D  pupilaIzquierda = new Rectangle2D.Double(190, 230, 20, 20);
        Rectangle2D  pupilaDerecha = new Rectangle2D.Double(230, 230, 20, 20);
        G2d.setColor(Color.BLACK);
        G2d.fillPolygon(ladoIzquierdoX, ladoIzquierdoY, 4);
        G2d.fillPolygon(ladoDerechoX, ladoDerechoY, 4);
        G2d.fillPolygon(botaIzquierdaX, botaIzquierdaY, 5);
        G2d.fillPolygon(botaDerechaX, botaDerechaY, 5);
        G2d.fillPolygon(cabelloIzquierdoX, cabelloIzquierdoY, 10);
        G2d.fillPolygon(cabelloDerechoX, cabelloDerechoY, 10);
        G2d.draw(correaInterna);
        G2d.draw(pupilaIzquierda);
        G2d.draw(pupilaDerecha);
        G2d.fill(correaInterna);
        G2d.fill(pupilaIzquierda);
        G2d.fill(pupilaDerecha);
        
        //Contornos del sombrero
        //	Hebilla
        Rectangle2D  contornoHebilla = new Rectangle2D.Double(200, 150, 40, 40); 
        G2d.draw(contornoHebilla);
        
        //	Parte superior del sombrero
        G2d.drawLine(160, 200, 220, 90);
        G2d.drawLine(220, 90, 260, 120);
        G2d.drawLine(260, 120, 240, 120);
        G2d.drawLine(240, 120, 280, 200);
        //	Borde o ala del sombrero
        G2d.drawLine(100, 200, 320, 200);
        G2d.drawLine(100, 210, 320, 210);
        G2d.drawLine(100, 200, 100, 210);
        G2d.drawLine(320, 200, 320, 210);
        
        //Contornos del rostro
        G2d.drawLine(160, 270, 160, 290);
        G2d.drawLine(160, 290, 190, 320);
        G2d.drawLine(190, 320, 250, 320);
        G2d.drawLine(250, 320, 280, 290);
        G2d.drawLine(280, 290, 280, 270);
        //	Ojos
        Rectangle2D  contornoOjoIzquierdo = new Rectangle2D.Double(230, 220, 30, 30);
        Rectangle2D  contornoOjoDerecho = new Rectangle2D.Double(180, 220, 30, 30); 
        G2d.draw(contornoOjoIzquierdo);
        G2d.draw(contornoOjoDerecho);
        ///	Nariz
        G2d.drawLine(260, 250, 170, 250);
        G2d.drawLine(170, 250, 170, 270);
        G2d.drawLine(170, 270, 230, 270);
        //	Boca
        G2d.drawLine(190, 280, 190, 290);
        G2d.drawLine(190, 290, 200, 300);
        G2d.drawLine(200, 300, 240, 300);
        G2d.drawLine(240, 300, 250, 290);
        G2d.drawLine(250, 290, 250, 280);
        
        //Contornos del cuerpo
        //	Brazo izquierdo
        G2d.drawLine(250, 320, 310, 310);
        G2d.drawLine(310, 310, 310, 290);
        G2d.drawLine(310, 290, 320, 290);
        G2d.drawLine(320, 290, 320, 300);
        G2d.drawLine(320, 300, 330, 290);
        G2d.drawLine(330, 290, 340, 310);
        G2d.drawLine(340, 310, 260, 350);
        G2d.drawLine(310, 310, 320, 320);
        //	Brazo derecho
        G2d.drawLine(190, 320, 120, 390);
        G2d.drawLine(120, 390, 120, 400);
        G2d.drawLine(180, 350, 140, 390);
        G2d.drawLine(140, 390, 140, 400);
        G2d.drawLine(140, 390, 130, 380);
        //	Tronco
        G2d.drawLine(190, 320, 160, 400);
        G2d.drawLine(160, 400, 160, 410);
        G2d.drawLine(250, 320, 280, 400);
        G2d.drawLine(280, 400, 280, 410);
        G2d.drawLine(160, 410, 280, 410);
        //	Pierna izquierda
        G2d.drawLine(230, 410, 250, 440);
        G2d.drawLine(260, 440, 290, 440);
        G2d.drawLine(290, 440, 300, 460);
        G2d.drawLine(300, 460, 300, 430);
        G2d.drawLine(300, 430, 260, 430);
        G2d.drawLine(260, 430, 250, 410);
        G2d.drawLine(270, 430, 270, 440);
        G2d.drawLine(280, 430, 280, 440);
        //	Pierna derecha
        G2d.drawLine(190, 410, 210, 450);
        G2d.drawLine(210, 450, 250, 450);
        G2d.drawLine(250, 450, 260, 470);
        G2d.drawLine(260, 470, 260, 440);
        G2d.drawLine(260, 440, 220, 440);
        G2d.drawLine(220, 440, 210, 410);
        G2d.drawLine(230, 440, 230, 450);
        G2d.drawLine(240, 440, 240, 450);
        
        //Contornos del fondo
        //	Escoba
        G2d.drawLine(110, 400, 160, 400);
        G2d.drawLine(110, 400, 110, 410);
        G2d.drawLine(110, 410, 160, 410);
        G2d.drawLine(280, 400, 330, 400);
        G2d.drawLine(330, 400, 330, 410);
        G2d.drawLine(280, 410, 330, 410);
        G2d.drawLine(330, 400, 340, 370);
        G2d.drawLine(340, 370, 430, 370);
        G2d.drawLine(430, 370, 430, 440);
        G2d.drawLine(330, 410, 340, 440);
        G2d.drawLine(340, 440, 430, 440);
        //	Luna
        G2d.drawLine(350, 180, 380, 180);
        G2d.drawLine(380, 180, 400, 170);
        G2d.drawLine(400, 170, 410, 150);
        G2d.drawLine(410, 120, 400, 100);
        G2d.drawLine(410, 150, 410, 120);
        G2d.drawLine(380, 90, 350, 90);
        G2d.drawLine(400, 100, 380, 90);
        G2d.drawLine(370, 100, 380, 110);
        G2d.drawLine(350, 90, 370, 100);
        G2d.drawLine(370, 170, 350, 180);
        G2d.drawLine(380, 110, 380, 150);
        G2d.drawLine(380, 150, 370, 170);
   
    }
}
