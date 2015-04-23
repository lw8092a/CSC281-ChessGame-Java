import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;

import java.awt.*;

import javax.swing.*;


public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.CYAN);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		g.setColor(Color.BLUE);
		g.fillRect(x-20, y-20, 40, 40);
		g.setColor(new Color(190,81,215));
		g.fillRect(40,20,80,50);
		g.fillRect(10,10,20,20);
		Image chessPiecesImage;
		chessPiecesImage = new ImageIcon("ChessPiece.png").getImage();
		g.drawImage(chessPiecesImage, x, y, 100, 100, this);
		
	}
	static int x,y;
	public void mouseDragged(MouseEvent arg0) {

		
	}

	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("object will move");
		repaint();
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		System.out.println("Something was clicked");
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		x=arg0.getX();
		y=arg0.getY();
		System.out.println("object will move");
		repaint();
		
	}

}

