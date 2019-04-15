package kartak;

import a.projectPackage.Partida;

public class Heroia  
{
	//atributoak
	private int bizitza;

	//eraikitzailea
	public Heroia() 
	{
		this.bizitza = 30;
	}
	
	//gainontzeko metodoak
	public int getBizitza()
	{
		return this.bizitza;
	}
	public void erasoEgin ()
	{
		Partida.getNirePartida().getHeroiEtsaia().puntoBatKendu();
	}
	public void puntoBatKendu ()
	{
		this.bizitza = this.bizitza - 1 ;
	}
	public boolean bizirikDago ()
	{
		boolean emaitza = true;
		if (this.bizitza <= 0)
		{
			emaitza = false;
		}
		return emaitza;
	}
}