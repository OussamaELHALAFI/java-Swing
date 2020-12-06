package com.esisa.java.swing.examples;

import javax.swing.JFrame;

public class Example {
	
	public Example() {
		JFrame f1 = new JFrame();
		f1.setSize(500, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example();
	}

}
