package com.mycompany.projectoop;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
    
    public MainPanel(){}
    
    @Override
    public void paint(Graphics g){
        
        Graphics2D g2D = (Graphics2D) g;
        
        /***frame of rectangle***/
        g2D.setPaint(new Color(240,240,240));
        g2D.fillRect(50, 10, 155, 70);
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(1));
        g2D.drawRect(50, 10, 155, 70);
        
        /***rectangle***/
        g2D.setPaint(new Color(32,178,170));
        g2D.fillRect(95, 20, 60, 35);
        g2D.setStroke(new BasicStroke(3));
        g2D.setPaint(Color.black);
        g2D.drawRect(95, 20, 60, 35);
        g2D.setPaint(Color.black);
        g2D.setFont(new Font("MV Boli",Font.BOLD,15));
        g2D.drawString("Rectangle", 90, 75);
        
        
        /***frame of square***/
        g2D.setPaint(new Color(240,240,240));
        g2D.fillRect(50, 83, 75, 70);
        g2D.setStroke(new BasicStroke(1));
        g2D.setPaint(Color.black);
        g2D.drawRect(50, 83, 75, 70);
        
        /**square***/
        g2D.setPaint(new Color(150,0,150));
        g2D.fillRect(68, 94, 35, 35);
        g2D.setStroke(new BasicStroke(3));
        g2D.setPaint(Color.black);
        g2D.drawRect(68, 94, 35, 35);
        g2D.setPaint(Color.black);
        g2D.setFont(new Font("MV Boli",Font.BOLD,15));
        g2D.drawString("Square", 61, 145);
        
        
        /***frame of circle***/
        g2D.setPaint(new Color(240,240,240));
        g2D.fillRect(130, 83, 75, 70);
        g2D.setStroke(new BasicStroke(1));
        g2D.setPaint(Color.black);
        g2D.drawRect(130, 83, 75, 70);
        
        /***circle***/
        g2D.setPaint(new Color(200,0,100));
        g2D.fillOval(145, 94, 40, 40);
        g2D.setStroke(new BasicStroke(3));
        g2D.setPaint(Color.black);
        g2D.drawOval(145, 94, 40, 40);
        g2D.setPaint(Color.black);
        g2D.setFont(new Font("MV Boli",Font.BOLD,15));
        g2D.drawString("Circle", 147, 145);
    }
}
