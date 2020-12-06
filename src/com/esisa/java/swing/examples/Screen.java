package com.esisa.java.swing.examples;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;

public class Screen extends JPanel implements KeyListener, MouseListener {

	public static final int KEY_LEFT = 37;
	public static final int KEY_UP = 38;
	public static final int KEY_RIGHT = 39;
	public static final int KEY_DOWN = 40;
	
	private int x = 200;
	private int y = 100;
	private int step = 3;
	private Vector<Circle> circles;
	
	public Screen() {
		setBackground(Color.RED);
		addKeyListener(this);
		circles = new Vector<>();
		addMouseListener(this);
		
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		//requestFocus();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(Color.blue);
		g.fillRect(x, y, 30, 15);

		for (Circle c : circles) {
			g.drawOval(c.getX(), c.getY(), c.getRay(), c.getRay());
		}
	}
	
	/*******************************************************************************/
	
	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KEY_LEFT) {
			x -= step;
		}
		
		else if (e.getKeyCode() == KEY_UP) {
			y -= step;
		}

		else if (e.getKeyCode() == KEY_RIGHT) {
			x += step;
		}

		else if (e.getKeyCode() == KEY_DOWN) {
			y += step;
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {}

/*******************************************************************************/
	
	public void mouseClicked(MouseEvent e) {	
		circles.add(new Circle(e.getX(), e.getY(), 30));
		repaint();
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
	
}
