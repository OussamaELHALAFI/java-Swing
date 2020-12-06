package com.esisa.java.swing.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * C'est un listener qui convetit les lettres miniscule tapées en majiscule
 */
public class ToUpperListener implements KeyListener {

	public ToUpperListener() {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() > 'a' && e.getKeyChar() < 'z') {
			e.setKeyChar((char)(e.getKeyChar() - 'a' + 'A'));//casting
		}
	}

	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}

}
