package trebetasunak;

public abstract class Trebetasuna 
{
	private String izena;
	private String deskribapena;
	
	public Trebetasuna(String pIzena, String pDeskribapena) 
	{
		this.izena = pIzena;
		this.deskribapena = pDeskribapena;
	}
	public String getIzena ()
	{
		return this.izena;
	}
	public String getDeskribapena ()
	{
		return this.deskribapena;
	}
	public abstract void erabiliTrebetasuna();
}
