package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog 
{

	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FOURNI DANS L'ENNONCE */
		JOptionPane.showMessageDialog(null, "[Erreur]" + message);
	}

	@Override
	protected void showMessage()
	{
		// TODO Auto-generated method stub
		
	}

}