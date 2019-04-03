package a.projectPackage;

import kartak.ListaKartak;

public class Partida 
{
	//atributoak
	private static Partida nirePartida = null;
	private Jokalaria[] listaJokalariak;
	private int unekoTxanda;
	
	//eraikitzailea
	private Partida() 
	{
		this.listaJokalariak = new Jokalaria[2];
		this.unekoTxanda=0;
	}
	
	//gainontzeko metodoak
	public static Partida getNirePartida()
	{
		if (nirePartida == null)
		{
			nirePartida = new Partida();
		}
		return nirePartida;
	}

	public void hasieratuPartida ()
	{
		//TODO
	}
	public String jokatu() 
	{
		//TODO
		
		return "Jokalari irabazlearen izena";
	}
	public Jokalaria aukeratuJokalaria (int pUnekoTxanda)
	{
		//TODO
		Jokalaria jokalaria = null;
		return jokalaria;
	}
	public void hurrengoTxanda() 
	{
		//Suma 1 a uneko txanda
		//TODO
	}
	public boolean irabazia()
	{
		//TODO
		return false;
	}
	
	public void inprimatuPartida() 
	{
		//TODO
	}
}
