package miBlastGuiVersion2.copy;
import blast.BlastController;
import java.awt.event.*;

public class miActionListener implements ActionListener {
	private miJFrame mJF;
	private BlastController bCnt;
	private String dataBaseFile;
	private  String dataBaseIndexes;

	
	public miActionListener(miJFrame m, BlastController b, String dbf, String dbi) {
		mJF = m;
		bCnt = b;
		this.dataBaseFile = dbf;
		this.dataBaseIndexes = dbi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			char qT = 'p';
    		if(mJF.getmiJPanelTyP().isSelectedNButton()) {
				qT = 'n';
				mJF.getmiJPanelResult().setTextTResult("This query type is not available");
			}
    		else {
			String resultado = bCnt.blastQuery(qT, dataBaseFile, dataBaseIndexes,(float) mJF.getmiJPanelTyP().getPorcetange(), mJF.getmiJPanelSecyBus().getSecuencia());
			mJF.getmiJPanelResult().setTextTResult(resultado);;
			String nuevaSec = ( mJF.getmiJPanelSecyBus().getSecuencia().toUpperCase());
    		mJF.getmiJPanelSecyBus().addSecuencia(nuevaSec);
    		}
		}
			catch(Exception ex) {
				System.out.print(ex.getMessage());
			}
		}
	}
	

