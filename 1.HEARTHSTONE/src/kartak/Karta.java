package kartak;

public abstract class Karta 
{
	//atributoak
	private int idKarta;
	private String izena;
	private String deskribapena;
	private int balioa;

	
	//eraikitzailea
	public Karta(int pIdKarta, String pIzena, String pDeskribapena, int pBalioa) 
	{
		//TODO
	}
	
	//gainontzeko metodoak	
	public abstract void jokatuKarta();
	
	public boolean idHauDu(int pId)
	{
		boolean emaitza = false;
		return emaitza;
	}
	public void imprimatu()
	{
		//TODO
	}
}
