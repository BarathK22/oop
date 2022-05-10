package etel;

import java.time.LocalDate;

public class Tej extends Tejtermek {
	
	private int eladasiAr;
	private Type tipus;
	private Kiszerel kiszereles;
	
	public Tej(int egysegar, String gyarto, LocalDate gyartasido, LocalDate lejaratiido, Type tipus,
			Kiszerel kiszereles) {
		super(egysegar, gyarto, gyartasido, lejaratiido);
		if(this.tipus == Type.FELZSIROS) {
			this.eladasiAr = egysegar * 1;
		}else if(this.tipus == Type.ZSIROS) {
			this.eladasiAr = (int) (egysegar * 1.4);
		}
		this.tipus = tipus;
		this.kiszereles = kiszereles;
	}

	public Tej(int egysegar, String gyarto, LocalDate gyartasido, LocalDate lejaratiido) {
		super(egysegar, gyarto, gyartasido, lejaratiido);
		if(this.tipus == Type.FELZSIROS) {
			this.eladasiAr = egysegar * 1;
		}else if(this.tipus == Type.ZSIROS) {
			this.eladasiAr = (int) (egysegar * 1.4);
		}
		this.tipus = Type.ZSIROS;
		this.kiszereles = Kiszerel.LITERES;
	}

	public int getEladasiAr() {
		return eladasiAr;
	}

	public void setEladasiAr(int eladasiAr) {
		this.eladasiAr = eladasiAr;
	}

	public Type getTipus() {
		return tipus;
	}

	public void setTipus(Type tipus) {
		this.tipus = tipus;
	}

	public Kiszerel getKiszereles() {
		return kiszereles;
	}

	public void setKiszereles(Kiszerel kiszereles) {
		this.kiszereles = kiszereles;
	}

	@Override
	public String toString() {
		return "Tej [eladasiAr=" + eladasiAr + ", tipus=" + tipus + ", kiszereles=" + kiszereles + "]" + super.toString();
	}
	
	public Tej olcsobbTej(Tej tej1,Tej tej2) {
		if(tej1.eladasiAr > tej2.eladasiAr) {
			return tej2;
		}else if(tej1.eladasiAr < tej2.eladasiAr) {
			return tej1;
		}else {
			return tej1;
		}
		
		
		
	}
	

	
}
