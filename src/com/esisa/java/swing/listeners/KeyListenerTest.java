package com.esisa.java.swing.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest implements KeyListener {

	public KeyListenerTest() {
		
	}

	//touche imprimables = les caracteres
	public void keyTyped(KeyEvent e) {
		System.out.println(">> KeyTyped() : " + e.getKeyChar());
	}
	
	//touche no imprimables
	public void keyPressed(KeyEvent e) {
		System.out.println(">> KeyPressed() : " + e.getKeyCode());
	}

	public void keyReleased(KeyEvent e) {
		System.out.println(">> KeyReleased() : " + e.getKeyCode());
	}

}
