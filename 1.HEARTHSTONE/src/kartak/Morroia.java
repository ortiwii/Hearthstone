package kartak;

import trebetasunak.Trebetasuna;

public class Morroia extends Karta 
{
	//atributoak
	private int erasoa;
	private int bizitza;
	private Trebetasuna trebetasuna;
	//Creo que esto hace falta, porque no puedes sacar una carta y que ataque del tiron, 
	//tienes que esperar un turno
	private boolean erasoAhalDu;
	private int zelairaAteratakoTxanda;
	
	//eraikitzailea
	public Morroia(int pIdKarta, String pIzena, String pDeskribapena, int pBalioa, int pErasoa, int pBizitza, Trebetasuna pTrebetasuna) 
	{
		super(pIdKarta, pIzena, pDeskribapena, pBalioa);
		this.erasoAhalDu = false;
		this.zelairaAteratakoTxanda = 0;
		// TODO
	}
	
	//gainontzeko metodoak
	public int getBizitza()
	{
		return this.bizitza;
	}
	
	public int getErasoa()
	{
		return this.erasoa;
	}
	public void jokatuKarta() 
	{
		//TODO
	}
	public abstract void erabiliTrebetasuna();
	
	//Siempre hay que comprobar esto para que pueda atacar
	public boolean erasoAhal(int pUnekoTxanda)
	{
		if (this.trebetasuna.getIzena() == "Eraso Jarraia")
		{
			this.erasoAhalDu = true;
		}
		else if (this.zelairaAteratakoTxanda + 1 == pUnekoTxanda)
		{
			this.erasoAhalDu = true;
		}
		return this.erasoAhalDu;
	}
	
	public void inprimatu()
	{
		System.out.println(this.erasoa);
		System.out.println(this.bizitza);
		
	}
}
