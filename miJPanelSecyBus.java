package miBlastGuiVersion2.copy;

import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class miJPanelSecyBus extends JPanel{
	
	private Vector<String> listaOpc;
	private JComboBox<String> comboBox;
	private JButton bSearch;
	
	public miJPanelSecyBus(){
		listaOpc = new Vector<String>();
		comboBox = new JComboBox<String>(listaOpc);
		comboBox.setEditable(true);
		bSearch = new JButton("Search");
		
		this.setLayout(new GridLayout(1, 2));
		this.add(comboBox);
		this.add(bSearch);
	}
	public String getSecuencia() {
		return this.comboBox.getSelectedItem().toString();
	}
	public void addSecuencia(String s) {
		Boolean b = false;
		int cnt = 0;
		while(b == false && cnt< listaOpc.size()) {
			if (listaOpc.elementAt(cnt).toUpperCase().equals(s)) {
				b = true;
			}
			cnt++;
		}
		if(!b) {
			listaOpc.add(s);
		}
		
	}
	public JButton getBSearch() {
		return this.bSearch;
	}
}
