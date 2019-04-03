package kartak;

public abstract class SorginkeriaDefentsazkoa extends Sorginkeria 
{
	//atributoak
	
	public SorginkeriaDefentsazkoa(int pIdKarta, String pIzena, String pDeskribapena, int pBalioa) 
	{
		super(pIdKarta, pIzena, pDeskribapena,pBalioa);
		// TODO Auto-generated constructor stub
	}
	public void egikarituSorginkeria() 
	{
		//TODO
	}
	public abstract void emanDefentsa (Karta pKarta);
}
