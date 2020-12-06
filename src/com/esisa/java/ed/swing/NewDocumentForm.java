package com.esisa.java.ed.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import com.esisa.java.ed.business.DocumentService;
import com.esisa.java.ed.models.Document;
import com.esisa.java.swing.compeonents.Form;

public class NewDocumentForm extends JDialog implements ActionListener {
	private DocumentService documentService;
	private Form form;
	
	public NewDocumentForm(JFrame parent) {
		super(parent, true);
		init();
		setLocationRelativeTo(parent);//afficher la forme au centre de nouveau document
	}
	
	public void init() {
		setTitle("Nouveau Document");
		form = new Form();
		form.addTextField("Identificateur", 15);
		form.addTextField("Titre", 40);
		form.addTextField("Prix", 10);
		
		form.addButtons("Enregistrer");
		form.addButtons("Annuler");
		
		form.addActionListenerToButton(this);
		setContentPane(form);
		pack();
		setResizable(false);
	}

	public void setDocumentService(DocumentService documentsrvice) {
		this.documentService = documentsrvice;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			System.out.println(btn.getText());
			if (btn.getText().equals("Annuler")) {
				dispose();
			}
			else if (btn.getText().equals("Enregistrer")) {
				Document doc = new Document(
						form.getIntValue(0),
						form.getValue(1),
						form.getDoubleValue(2)
						);
				documentService.add(doc);
				dispose();
				
			}
		}
		
	}

}
