package com.esisa.java.swing.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 c'est un ecouteur qui n'accepte uniquement les lettres
 majiscule ou miniscule . les autres caracteres seront désactivés. On désactive caractere avec :
 setKeyChar(0)
  */

public class AlphaListener implements KeyListener {

	public AlphaListener() {
		
	}
	
	public void keyTyped(KeyEvent e) {
		if ((e.getKeyChar() < 'a' || e.getKeyChar() > 'z') && (e.getKeyChar() < 'A' || e.getKeyChar() > 'Z')) {
			e.setKeyChar((char)0);
		}
	}

	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}

}
