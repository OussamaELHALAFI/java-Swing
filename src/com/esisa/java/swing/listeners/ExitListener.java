package com.esisa.java.swing.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitListener implements ActionListener {

	public ExitListener() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		System.out.println(">> actionPreformed() : " + src.getText());
		System.exit(0);
	}

}
