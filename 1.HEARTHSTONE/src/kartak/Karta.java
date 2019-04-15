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
		this.idKarta = pIdKarta;
		this.izena = pIzena;
		this.deskribapena = pDeskribapena;
		this.balioa = pBalioa;
	}
	
	//gainontzeko metodoak	
	public abstract void jokatuKarta();
	
	public boolean idHauDu(int pId)
	{
		if (this.idKarta == pId)
		{
			return true; // Si tienen el mismo id te devuelve True
		}
		return false; // Si no es el mismo id no entra en el if y te devuelve el False.
	}
	public void imprimatu()
	{
		this.imprimatu(); 
		/* En las cartas hijas tiene que imprimir el ataque y la defensa, no creo que haga falta imprimir la descripción ni nada.*/
	}
}
