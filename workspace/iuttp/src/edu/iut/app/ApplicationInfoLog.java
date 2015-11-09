package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog
{

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		this.message = message;
		//Appel indirecte � newMessage()
        super.fireMessage("[INFO]", this.message);
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
		// TODO Auto-generated method stub
		return null;
	}

}
