package a.projectPackage;

import kartak.Heroia;
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
		//getters
	public Heroia getHeroiEtsaia ()
	{
		//como la unekotxanda si es bikoti (%2=0) es el jugador 1, y si no el jugador 2, 
		// si unekotxanda es bikoti devolvemos el heroe del jugador 2, y si no del 1, es decir,
		// hacemos lo contrario
		if (this.unekoTxanda % 2 != 0)
		{
			return this.listaJokalariak[1].getHeroia();
		}
		else
		{
			return this.listaJokalariak[2].getHeroia();
		}
	}
}
