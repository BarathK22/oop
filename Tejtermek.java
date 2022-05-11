package Etel;

import java.time.LocalDate;

public class Tejtermek {
	
	private int egysegar;
	private String gyarto;
	private LocalDate gyartasiIdo;
	private LocalDate lejaratiIdo;
	
	public Tejtermek(int egysegar, String szoveg, LocalDate gyartasiIdo, LocalDate lejaratiIdo) {
		super();
		this.egysegar = egysegar;
		this.gyarto = szoveg;
		this.gyartasiIdo = gyartasiIdo;
		this.lejaratiIdo = lejaratiIdo;
	}

	@Override
	public String toString() {
		return "Tejtermek [egysegar=" + egysegar + ", szoveg=" + gyarto + ", gyartasiIdo=" + gyartasiIdo
				+ ", lejaratiIdo=" + lejaratiIdo + "]";
	}

	public int getEgysegar() {
		return egysegar;
	}
	public String getSzoveg() {
		return gyarto;
	}
	public LocalDate getGyartasiIdo() {
		return gyartasiIdo;
	}
	public LocalDate getLejaratiIdo() {
		return lejaratiIdo;
	}
	public void setEgysegar(int egysegar) {
		this.egysegar = egysegar;
	}
	public void setSzoveg(String szoveg) {
		this.gyarto = szoveg;
	}
	public void setGyartasiIdo(LocalDate gyartasiIdo) {
		this.gyartasiIdo = gyartasiIdo;
	}
	public void setLejaratiIdo(LocalDate lejaratiIdo) {
		this.lejaratiIdo = lejaratiIdo;
	}
	
	public boolean IhatoE()
	{
		LocalDate jelen = LocalDate.now();
		
		if ( this.lejaratiIdo.isAfter(jelen) )
		{
			return true; //regebbi.
		}
		return false; //korabbi.
		
	}
}
