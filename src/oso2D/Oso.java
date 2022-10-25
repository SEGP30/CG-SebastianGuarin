package oso2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Oso extends JPanel
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) 
    {
    	//-----PROPIEDADES ESTÁNDARES DEL PINCEL-----
    	Graphics2D G2d = (Graphics2D)g;
        BasicStroke Grosor = new BasicStroke(4);
        G2d.setStroke(Grosor);
        G2d.setColor(Color.BLACK);
    	
    	//-----CONTORNO Y COLOREADO DE FONDO CON POLÍGONOS Y LÍNEAS-----
        //Orejas y coronilla
        //	Oreja y coronilla izquierda
        int [] orejaIzquierdaX = {260, 290, 320, 305};
        int [] orejaIzquierdaY = {97, 70, 110, 168};
        G2d.fillPolygon(orejaIzquierdaX , orejaIzquierdaY, 4);
        G2d.drawLine(160, 98, 211, 85);
        //	Oreja y coronilla derecha
        int [] orejaDerechaX = {160, 129, 90, 120};
        int [] orejaDerechaY = {97, 68, 110, 168};
        G2d.fillPolygon(orejaDerechaX , orejaDerechaY, 4);
        G2d.drawLine(211, 85, 262, 98);
        
        //Ojos
        //	Ojo izquierdo
        int [] ojoIzquierdoX = {230, 240, 255, 275};
        int [] ojoIzquierdoY = {150, 210, 235, 218};
        G2d.fillPolygon(ojoIzquierdoX, ojoIzquierdoY, 4);
        //	Ojo derecho
        int [] ojoDerechoX = {190, 180, 165, 145};
        int [] ojoDerechoY = {150, 210, 235, 218};
        G2d.fillPolygon(ojoDerechoX , ojoDerechoY, 4);
        
        //Perfiles
        //	Perfil izquierdo
        int [] perfilIzquierdoX = {260, 230, 295, 320};
        int [] perfilIzquierdoY = {100, 150, 250, 195};
        G2d.drawPolygon(perfilIzquierdoX, perfilIzquierdoY, 4);
        //	Perfil derecho
        int [] perfilDerechoX = {160, 190, 125, 100};
        int [] perfilDerechoY = {100, 150, 250, 195};
        G2d.drawPolygon(perfilDerechoX, perfilDerechoY, 4);
        
        //Nariz
        int [] narizX = {210, 232, 242, 211, 180, 188};
        int [] narizY = {271, 260, 248, 252, 248, 260};
        G2d.fillPolygon(narizX, narizY, 6);
        
        //Mejillas
        //	Mejilla izquierda
        int [] mejillaIzquierdaX = {275, 255, 245, 295};
        int [] mejillaIzquierdaY = {220, 235, 273, 250};
        G2d.drawPolygon(mejillaIzquierdaX, mejillaIzquierdaY, 4);
        //	Mejilla derecha
        int [] mejillaDerechaX = {145, 165, 175, 125};
        int [] mejillaDerechaY = {220, 235, 273, 250};
        G2d.drawPolygon(mejillaDerechaX, mejillaDerechaY, 4);
        
        //Boca
        int [] bocaX = {227, 210, 193, 210};
        int [] bocaY = {277, 276, 277, 284};
        G2d.fillPolygon(bocaX, bocaY, 4);
        G2d.drawLine(211, 268, 211, 275);
        
        //Mandibula inferior
        int [] mandibulaInferiorX = {245, 230, 210, 190, 175, 190, 210, 230};
        int [] mandibulaInferiorY = {273, 280, 275, 280, 273, 290, 295, 290};
        G2d.drawPolygon(mandibulaInferiorX, mandibulaInferiorY, 8);
   
    }
}
