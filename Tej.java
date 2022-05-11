package Etel;

import java.time.LocalDate;

public class Tej extends Tejtermek {
	
	private int eladasiAr;
	private Tipus tipus;
	private Kiszereles kiszereles;
	
	
	public Tej(int egysegar, String gyarto, LocalDate gyartasiIdo, LocalDate lejaratiIdo, int eladasiAr, Tipus tipus, 
			Kiszereles kiszereles) 
	{
		
		super(egysegar, gyarto, gyartasiIdo, lejaratiIdo);
		
		if (this.tipus == Tipus.FELZSIROS) 
		{
			this.eladasiAr = super.getEgysegar() * 1;
		}
		else
		{
			this.eladasiAr = (int) Math.round( (super.getEgysegar() * 1.4) );
		}
		
		this.tipus = tipus;
		this.kiszereles = kiszereles;
		
	}


	public Tej(int egysegar, String gyarto, LocalDate gyartasiIdo, LocalDate lejaratiIdo) {
		super(egysegar, gyarto, gyartasiIdo, lejaratiIdo);
		
		this.tipus = Tipus.ZSIROS;
		this.kiszereles = Kiszereles.LITERES;
	}

	public int getEladasiAr() {
		return eladasiAr;
	}
	public Tipus getTipus() {
		return tipus;
	}
	public Kiszereles getKiszereles() {
		return kiszereles;
	}
	public void setEladasiAr(int eladasiAr) {
		this.eladasiAr = eladasiAr;
	}
	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}
	public void setKiszereles(Kiszereles kiszereles) {
		this.kiszereles = kiszereles;
	}

	@Override
	public String toString() {
		return "Tej [eladasiAr=" + eladasiAr + ", tipus=" + tipus + ", kiszereles=" + kiszereles + ", toString()="
				+ super.toString() + "]";
	}
	
	public Tej OlcsobbTej(Tej t1, Tej t2)
	{
		if (t1.eladasiAr > t2.eladasiAr) 
		{
			return t2;
		}
		else if(t1.eladasiAr < t2.eladasiAr)
		{
			return t1;
		}
		
		return t1;
	}
	
	
}
