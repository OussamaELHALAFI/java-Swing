package com.esisa.java.swing.examples;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.esisa.java.swing.compeonents.ButtonPanet;
import com.esisa.java.swing.compeonents.Form;
import com.esisa.java.swing.compeonents.LabeledTextFeild;
import com.esisa.java.swing.compeonents.Menu;
import com.esisa.java.swing.compeonents.choicePanel;
import com.esisa.java.swing.listeners.AlphaListener;
import com.esisa.java.swing.listeners.ExitListener;
import com.esisa.java.swing.listeners.KeyListenerTest;
import com.esisa.java.swing.listeners.ToUpperListener;

public class Examples extends JFrame {

	public Examples() {
		// TODO Auto-generated constructor stub
		
		exp12();
		config();
	}

	void config() {
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void exp01() {
		JPanel p1 = new JPanel();
		//p1.setLayout(null);
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("valider");
		
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		
		setContentPane(p1);
	}
	
	void exp02() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 3));
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("valider");
		
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		
		setContentPane(p1);
	}
	
	void exp03() {
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("valider");
		JTextArea a1 = new JTextArea();
		
		p1.add("West", l1);
		p1.add("North", t1);
		p1.add("South", b1);
		p1.add("Center", new JScrollPane(a1));
		p1.add("East", new JLabel("East"));
		
		setContentPane(p1);
	}
	
	void exp04() {
		JPanel p1 = new JPanel();
		JButton b1 = new JButton("Valider");
		JButton b2 = new JButton("Imprimer");
		JButton b3 = new JButton("Quitter");
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		setContentPane(p1);
	}
	
	void exp05() {
		ButtonPanet p1 = new ButtonPanet("Valider", "Imprimer", "Quitter");
		
		setContentPane(p1);
	}
	
	void exp06() {
		JPanel container = new JPanel(new BorderLayout());
		ButtonPanet p1 = new ButtonPanet("Valider", "Imprimer", "Quitter");
		container.add("South", p1);
		setContentPane(container);
	}
	
	void exp07() {
		JPanel form =  new JPanel();
		form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
		LabeledTextFeild t1 = new LabeledTextFeild("reference", 15, 120);
		LabeledTextFeild t2 = new LabeledTextFeild("Désignation", 30, 120);
		LabeledTextFeild t3 = new LabeledTextFeild("Prix", 10, 120);
		form.add(t1);
		form.add(t2);
		form.add(t3);
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(form);
		setContentPane(p1);
		
		form.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		p1.setBackground(Color.BLUE);
	}
	
	void exp08() {
		Form form = new Form(120);
		form.addTextField("Reference", 15);
		form.addTextField("Designation", 30);
		form.addTextField("Prix unitaire", 10);
		form.addTextField("Quantité en stock", 10);
		
		form.addButtons("valider");
		form.setButtons("Enregistrer", "Imprimer");
		form.addButtons("Annuler");
		
		setContentPane(form);
	}
	
	void exp09() {
		JMenuBar menu = new JMenuBar();
		JMenu m1 = new JMenu("File");
		menu.add(m1);
		JMenuItem n11 = new JMenuItem("New");
		JMenuItem n12 = new JMenuItem("Open");
		JMenuItem n13 = new JMenuItem("Save");
		JMenuItem n14 = new JMenuItem("Exit");
		
		m1.add(n11);
		m1.add(n12);
		m1.add(n13);
		m1.addSeparator();
		m1.add(n14);
		
		JMenu m2 = new JMenu("Edit");
		menu.add(m2);
		JMenuItem n21 = new JMenuItem("copy");
		JMenuItem n22 = new JMenuItem("cut");
		JMenuItem n23 = new JMenuItem("Paste");
		
		m2.add(n21);
		m2.add(n22);
		m2.add(n23);
		
		setJMenuBar(menu);
	}
	
	void exp10() {
		String menuLabels[][] = {
				{"File", "New", "Open", "Save", "-", "Exit"},
				{"File", "Copy", "cut", "Paste"},
				{"source", "Generate getters & setters", "generate toString()", "add Import"},
		};
		
		Menu menu = new Menu(menuLabels);
		setJMenuBar(menu);
	}
	
	void exp11() {
		//Choice p2 = new Choice("Layout Manager", "FlowLayout", "BorderLayout", "GridLayout");
		choicePanel p1 = new choicePanel("Layout Manager", "FlowLayout", "BorderLayout", "GridLayout");
		p1.setChoice("FlowLayout", true);
		p1.setChoice("GridLayout", true);
		getContentPane().add("North", p1);
		
		String t[] = p1.getChoices();
		for (String choice : t) {
			System.out.println(choice);
		}
	}
	
	void exp12() {
		choicePanel p1 = new choicePanel(choicePanel.RADIO, "Layout Manager", "FlowLayout", "BorderLayout", "GridLayout");
		getContentPane().add("North", p1);
	}
	
	void exp13()
	{
		JButton b1 = new JButton("Quitter");
		b1.addActionListener(new ExitListener());
		getContentPane().add("South", b1);
	}
	
	void exp14() {
		JTextField t1 = new JTextField();
		getContentPane().add("North", t1);
		
		t1.addKeyListener(new KeyListenerTest());
		t1.addKeyListener(new AlphaListener());
		t1.addKeyListener(new ToUpperListener());
	}
	
	void exp15() {
		Screen screen = new Screen();
		setContentPane(screen);
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		screen.requestFocus();
	}
	
	/*combox GroupBox,, abstrukbutton(Jbutton,jradiobutton,jcheckbox)*/
	public static void main(String[] args) {
		new Examples();

	}

}