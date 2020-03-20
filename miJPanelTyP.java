package miBlastGuiVersion2.copy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.*;


public class miJPanelTyP extends JPanel {
	private JLabel lpnB;
	private JRadioButton pButton;
	private ButtonGroup pnButton;
	private JRadioButton nButton;
	private JTextField tqp;
	private JLabel lEspacio;
	private JLabel lqp;
	
	public miJPanelTyP() {
		lpnB = new JLabel("Elija el tipo de búsqueda: ");
		pButton = new JRadioButton("Protein");
		nButton = new JRadioButton("Nucleotid");
		pnButton = new ButtonGroup();
		pnButton.add(pButton);
		pnButton.add(pButton);
		lEspacio = new JLabel("|");
		pnButton.add(pButton);
		tqp = new JTextField();
		lqp = new JLabel("Query porcentage:");
		
		this.setLayout(new GridLayout(1, 5));
		this.add(lpnB);
		this.add(pButton);
		this.add(nButton);
		this.add(lEspacio);
		this.add(lqp);
		this.add(tqp);
	}
	public boolean isSelectedNButton() {
		return nButton.isSelected();
	}
	public float getPorcetange() {
		return Float.valueOf(this.tqp.getText());
	}
}
