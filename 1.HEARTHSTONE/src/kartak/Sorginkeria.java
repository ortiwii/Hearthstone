package kartak;

public abstract class Sorginkeria extends Karta
{
	//atributoak
	
	//eraikitzailea
	public Sorginkeria(int pIdKarta, String pIzena, String pDeskribapena, int pBalioa) 
	{
		super(pIdKarta, pIzena, pDeskribapena, pBalioa);
		//TODO
	}
	
	//gainontzeko metodoak
	public abstract void egikarituSorginkeria();
	public boolean edonoriErasoDiezaioke (ListaKartak pLista)
	{
		boolean emaitza = false;
		return emaitza;
	}
	public void inprimatu()
	{
		//TODO
	}
}
