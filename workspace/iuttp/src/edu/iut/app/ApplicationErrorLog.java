package edu.iut.app;

import java.util.ArrayList;

public class ApplicationErrorLog extends AbstractApplicationLog 
{

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	// pas d'ajout de t'ableau car celui-ci est present dans la classe m�re
	// et est accesible a toute les classes filles
	
	
	//_______________________LES METHODES____________________________________
	public ApplicationErrorLog()
	{
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		//Appel indirecte � newMessage()
		this.message = message;	// ici le message est conserver
		super.fireMessage("[ERROR]", this.message);	// dans la methode fireMessage,
													// le tableau de la classe est deja parcouru
	}

	@Override
	public String getMessage() 
	{
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public IApplicationLogListener[] getpplicationLogListeners()
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

}