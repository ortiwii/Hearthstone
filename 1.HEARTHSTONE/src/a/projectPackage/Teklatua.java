package a.projectPackage;

import java.util.Scanner;
import kartak.Heroia;
import kartak.Karta;
import kartak.ListaKartak;

public class Teklatua 
{
	//atributoak
	private static Teklatua nireTeklatua = null;
	private Scanner sc;
	
	//eraikitzailea
	private Teklatua ()
	{
		//TODO
	}
	public static Teklatua getNireTeklatua()
	{
		//TODO
		return Teklatua.nireTeklatua;
	}
	
	//gainontzeko metodoak
	public String Irakurri (String aurrekoMezua)
	{
		//TODO
		String mezua = "A";
		return mezua;
	}
	public int OsoaIrakurri (String pAurrekoMezua, int pNondik, int pNorarte)
	{
		//TODO
		int emaitza = 0;
		return emaitza ;
    }

	public boolean irakurriBaiEz (String pAurrekoMezua, String pBai, String pEz)
	{
		//TODO
		return false;
	}
	
	public Karta irakurriAukera (String pAurrekoMezua, ListaKartak pAukerak)
	{
		//TODO
		Karta emaitza = null;
		return emaitza;
	}
}
