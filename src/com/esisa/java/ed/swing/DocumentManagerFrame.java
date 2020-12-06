package com.esisa.java.ed.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

import com.esisa.java.ed.business.DocumentService;
import com.esisa.java.swing.compeonents.Menu;

public class DocumentManagerFrame extends JFrame implements ActionListener{
	private NewDocumentForm newDocumentForm;
	private DocumentListForm documentListForm;
	private DocumentService service;

	public DocumentManagerFrame() {
		init();
	}
	
	public void init() {
		service = new DocumentService();
		newDocumentForm = new NewDocumentForm(this);
		newDocumentForm.setDocumentService(service);
		//...
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Gestion Electronique des documents");
		Menu menu = new Menu(new String[][] {
			{ "Document",
				"Nouveau Document",
				"Liste des Documents",
				"-",
				"Quitter"
			}
		});
		menu.addActionListener(this);
		setJMenuBar(menu);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DocumentManagerFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem)e.getSource();
		System.out.println(">> " + item.getText());
		if (item.getText().equals("Nouveau Document")) {
			newDocumentForm.setVisible(true);
		}
		
	}

}
