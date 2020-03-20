package miBlastGuiVersion2.copy;

import javax.swing.JFrame;

import blast.BlastController;

public class blastGuiMain {

	private static final String dataBaseFile = new String("yeast.aa");
	private static final String dataBaseIndexes = new String("yeast.aa.indexs");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Busqueda();
			}
		});
	}
	public static void Busqueda() {
		miJFrame mJF = new miJFrame();
		mJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BlastController bCnt = new BlastController();
		miActionListener mAL = new miActionListener(mJF, bCnt, dataBaseFile, dataBaseIndexes);
		mJF.getmiJPanelSecyBus().getBSearch().addActionListener(mAL);
		mJF.pack();
		mJF.setVisible(true);
		 
	}

}
