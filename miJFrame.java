package miBlastGuiVersion2.copy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.*;

//La siguiente clase tendrá todos los elementos de nuestra vista. 

public class miJFrame extends JFrame {
	
	private miJPanelTyP panelTyP;
	
	private miJPanelSecyBus panelSecyBus;
	
	
	private JPanel panel3;
	private JLabel lResult;
	
	private miJPanelResult panelResult;
	private JTextArea tResult;
	private JScrollPane scrollPane;
	
	public miJFrame() {
		
		this.panelTyP = new miJPanelTyP();
		this.panelSecyBus = new miJPanelSecyBus();
		
		panel3 = new JPanel();
		lResult = new JLabel("Result: ");
		
		panelResult = new miJPanelResult();
		
		panel3.add(lResult);
		
		JSplitPane jSP = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panel3, panelResult);
		jSP.setDividerSize(0);
		
		this.add(panelTyP, BorderLayout.NORTH);
		this.add(panelSecyBus, BorderLayout.CENTER);
		this.add(jSP, BorderLayout.SOUTH);
		
	}
	public miJPanelTyP getmiJPanelTyP() {
		return this.panelTyP;
	}

	public miJPanelSecyBus getmiJPanelSecyBus() {
		return this.panelSecyBus;
	}
	
	public miJPanelResult getmiJPanelResult() {
		return this.panelResult;
	}
}
