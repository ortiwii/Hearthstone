package a.projectPackage;

import kartak.Heroia;
import kartak.Karta;
import kartak.ListaKartak;

//viva er beti
public class Jokalaria 
{
	//atributoak
	private String izena;
		//ListaKartak
	private ListaKartak lapurtzekoKartak;
	private ListaKartak zelaikoKartak;
	private ListaKartak eskukoKartak;
	private ListaKartak hilerria;
		//Gainontzekoak
	private Heroia heroia;
	private int gemak;
	
	//eraikitzailea
	public Jokalaria (String pIzena) 
	{
		this.izena = pIzena;
		//ListaKartak
		this.zelaikoKartak=new ListaKartak();
		this.eskukoKartak=new ListaKartak();
		this.hilerria=new ListaKartak();
		this.lapurtzekoKartak = new ListaKartak();
		//Gainontzekoak
		this.heroia=new Heroia();
		this.gemak=1;
	}
	
	//gainontzeko metodoak
	public void hasieratuJokalaria ()
	{
		//TODO
	}
	public void jokatuTxanda(ListaKartak pListaEtsaia) 
	{
		//TODO
	}
	public void lapurtu () 
	{
		this.eskukoKartak.
	}
	public Karta aukeratuKarta() 
	{
		//TODO
		Karta karta=null;
		return karta;
	}
	public void jokatuKarta(Karta pKarta) 
	{
		//TODO
	}
//	public Karta aukeratuObjetiboa() 
//	{
//		//TODO
//		Karta karta=null;
//		return karta;
//	}
	private void zelaianJarri (Karta pKarta)
	{
		//TODO
		//Baldin sorginkeria bat bada, jokatuKarta()
	}
	private boolean aukeratuAhalDu()
	{
		//gemekin aukeratu ahal duen adierazi
		ListaKartak lista = new ListaKartak();
		Iterator<Karta> itr= this.eskukoKartak.//no va el punto
		while()
		boolean emaitza = false;
		return emaitza;
	}
	public void imprimatu()
	{
		//TODO
	}
	public boolean erasoDezake()
	{
		//Baldin :Zelaiko Kartak dituen
		//Zelaikoko kartek eraso ahal
		//Heroia ez 
		
		//TODO
		boolean emaitza = false;
		return emaitza;
	}
	public boolean txandaBukatu()
	{
		//Baldin !aukeratuAhalDu()
		//Baldin Pasatu Duen
		//Baldin Heroia hil
		boolean emaitza = false;
		return emaitza;
	}
}
