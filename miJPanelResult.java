package miBlastGuiVersion2.copy;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class miJPanelResult extends JPanel {
	private JTextArea tResult;
	private JScrollPane scrollPane;
	
	public miJPanelResult() {
		tResult = new JTextArea(20, 60);
		tResult.setEditable(false);
		scrollPane = new JScrollPane(tResult);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(scrollPane);
	}
	public void setTextTResult(String s) {
		this.tResult.setText(s);
	}
}
