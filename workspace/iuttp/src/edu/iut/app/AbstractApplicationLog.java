package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog
{
	//_______________________LES VARIABLES____________________________________
	protected String message;
		
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList<IApplicationLogListener> listeners;
	
	
	//_______________________LES METHODES____________________________________
	public AbstractApplicationLog()
	{
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
    /** TP1 : Fonction venant de l'interface par h�ritage */
	public void addListener(IApplicationLogListener listener) 
	{
		this.listeners.add(listener);
	}
	
	//M�thode getApplicationLogListener
	protected IApplicationLogListener[] getApplicationLogListeners()
	{
		
		int i = 0;
		IApplicationLogListener[] tab = new IApplicationLogListener[this.listeners.size()];
		for (IApplicationLogListener listener : this.listeners)
		{
			
			tab[i] = listener;
			i++;
			
		}
		
		return tab;
	}

	
	/** Listener action */
	protected void fireMessage(String level, String message)
	{
		for (IApplicationLogListener listener_i : listeners)
		{
			//M�thode qui va d�pendre du type d'erreur(level) et le message
			listener_i.newMessage(level, message);
		}
	}
	
	//M�thode abstraite setMessage
	public abstract void setMessage(String message);
}
