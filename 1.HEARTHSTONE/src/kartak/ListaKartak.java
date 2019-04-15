package kartak;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaKartak 
{
	//atributoak
	private ArrayList<Karta> lista;
	private boolean ikusgarria;
	
	//eraikitzailea
	public ListaKartak () 
	{
		this.lista = new ArrayList<Karta>(); 
	}
	
	//gainontzeko metodoak	
	private Iterator<Karta> getIteradorea()
	{
		return lista.iterator();
	}
	public void barajatu()
	{
		//TODO
	}
	public Karta aukeratuKarta() 
	{
		//TODO
		Karta karta=null;
		return karta;
	}
	public ArrayList<Karta> getLista()
	{
		return this.lista;
	}
	public void gehituKarta(Karta pKarta) {
		//TODO
	}
	
	public void kenduKarta(Karta pKarta) {
		//TODO
	}
	
	
	public void jokatuKarta(Karta pKarta) {
		//TODO
	}
	
	public Karta bilatuObjetiboa(Karta pKarta) 
	{
		//TODO
		Karta karta=null;
		return karta;
	}
	public Heroia aukeratuHeroia() 
	{
		//TODO
		Heroia heroia=null;
		return heroia;
	}
	public void inprimatuLista() {
		//TODO
	}
	
	public Karta getKarta()
	{
		Iterator<Karta>itr = this.getIteradorea();
		Karta k;
		k = itr.next();
		return k; // Esto es par el metodo partida que hay un lapurtuKarta()
	}
}