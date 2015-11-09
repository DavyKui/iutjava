package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationWarningLog()
	{
		super();
	}
	
	@Override
	public void setMessage(String message) 
	{
		//Appel indirecte � newMessage()
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
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