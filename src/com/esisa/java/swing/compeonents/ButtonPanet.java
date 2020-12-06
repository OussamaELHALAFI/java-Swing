package com.esisa.java.swing.compeonents;

import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanet extends JPanel {
	//private Vector<JButton> buttons;
	
	public ButtonPanet() {
		
	}

	public ButtonPanet(String ...labels) {
		for (String label : labels) {
			JButton b = new JButton(label);
			add(b);
		}
	}

	public void addButtons(String label)
	{
		JButton b = new JButton(label);
		add(b);
	}
	
	public void addActionListener(ActionListener listener) {
		for (int i = 0; i < getComponentCount(); i++) {
			JButton btn = (JButton)getComponent(i);
			btn.addActionListener(listener);
		}
	}
	
}
